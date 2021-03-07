package com.rsupport.ctiproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection {
    
    private static Connection con;
        
    static{
        //클래스를 로딩할 때 단 한번 실행돼는 영역
        
        //환경성정 파일을 읽어오기 위한 객체 생성
        Properties pro = new Properties();
        Reader reader;
        try {
            reader = new FileReader("src/resources/config.properties");//읽어올 파일 지정
            //설정 파일 로딩하기(인자가 Reader로 된 메서드 선택했음. 필요에 따라 다양한 생성자 사용)
            pro.load(reader);
            
        } catch (FileNotFoundException e1) {
            System.out.println("예외: 지정한 파일을 찾을수없습니다 :" + e1.getMessage());
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        //설정 파일에서 읽어와 변수에 담기
        String driverName = pro.getProperty("driverClassName");
        String url = pro.getProperty("url");
        String user = pro.getProperty("user");
        String pwd = pro.getProperty("password");
        
        System.out.println("jdbc.properties 에서 불러온 데이터");
        System.out.println("driverName :"+driverName);
        System.out.println("url :"+url +" /user :"+user+" /pwd :"+pwd);
        
        try{
            Class.forName(driverName);        
            con = DriverManager.getConnection(url,user,pwd);
            System.out.println("connection success");        
        }
        
        catch(ClassNotFoundException e){
            System.out.println("예외: 드라이버로드 실패 :" + e.getMessage());
            e.printStackTrace();
            //printStackTrace() : 메소드 호출관계를 스텍영역을 추적해 올라가면서 
            //어느 메소드를 실행하다가 어떤 예외가 발생했는지의 정보를 출력하는 메소드
        } catch (SQLException e) {
            System.out.println("예외: connection fail :" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    public static Connection getCon(){ //Connection 객체 얻기
        return con;        
    }
}
