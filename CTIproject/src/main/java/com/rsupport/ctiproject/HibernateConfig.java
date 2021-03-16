package com.rsupport.ctiproject;
 
import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;
 
import javax.sql.DataSource;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
import com.mchange.v2.c3p0.ComboPooledDataSource;
 
@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.rsupport.ctiproject")})
@PropertySource({ "classpath:config.properties" })
public class HibernateConfig {
    
    @Autowired
    private Environment env;
 
    private Logger logger = Logger.getLogger(getClass().getName());
    
    @Bean
    public DataSource myDataSource() {
        
        // Connection Pool을 생성한다.
        ComboPooledDataSource myDataSource = new ComboPooledDataSource();
 
        // jdbc driver 설정을 한다.
        try {
            myDataSource.setDriverClass("com.mysql.jdbc.Driver");        
        }
        catch (PropertyVetoException exc) {
            throw new RuntimeException(exc);
        }
        
        // 연결정보가 옳바른지 로그를 남긴다.
        logger.info("jdbc.url=" + env.getProperty("jdbc.url"));
        logger.info("jdbc.user=" + env.getProperty("jdbc.username"));
        
        // database connection props 설정.
        myDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        myDataSource.setUser(env.getProperty("jdbc.username"));
        myDataSource.setPassword(env.getProperty("jdbc.password"));
        
        // connection pool props 설정.
  //      myDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
  //      myDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
   //     myDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));        
   //     myDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
 
        return myDataSource;
    }
    
    private Properties getHibernateProperties() {
 
        // hibernate properties 설
        Properties props = new Properties();
 
        props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
        props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        
        return props;                
    }
    
    // need a helper method 
    // read environment property and convert to int
    
    private int getIntProperty(String propName) {
        
        String propVal = env.getProperty(propName);
        
        // now convert to int
        int intPropVal = Integer.parseInt(propVal);
        
        return intPropVal;
    }    
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        
        // create session factory bean
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        
        // set the properties
        sessionFactory.setDataSource(myDataSource());
        sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
        sessionFactory.setHibernateProperties(getHibernateProperties());
        
        return sessionFactory;
    }
    
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        
        // setup transaction manager based on session factory
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
 
        return txManager;
    }
    
    
}
