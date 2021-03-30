<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href='<spring:url value="/resources/css/login.css" />' rel="stylesheet"  type="text/css" >  

<title>RSUPPORT OlinePart</title>
</head>
<body class ="container">
	<section class="login-form">

	<h1>R Support Online</h1>
	
		<form action='<spring:url value="/loginAction"/>' method="post">
			<div class="int-area">
				<input name="username" type="text" class="form-control" required />
				 <label for='id'>USER ID</label>
			</div>
			<div class="int-area">
				<input name="password" type="password" class="form-control" required />
				<label for='pw'>PASSWORD</label>
			</div>
			<div class="btn-area">
				<button type="submit">LOGIN</button>
			</div>
		</form>
 			<div class="caption">
		    	<a onclick="alert('관리자에게 문의하세요.');">Forgot Password?</a>
		    </div>
  	 		
	</section>
	<!-- <script>
		let id =$('#id');
		let pw =$('#pw');
		let btn =$('#btn');
		
		$(btn).on('click', function(){
			if($(id).val*)==:){
			$(id).next('label').addClass('warning');
			setTimeout(function(){
				$('label').removeClass('warning');
			},1500);
		}
			else if($(pw).val() == ""){
			$(pw).next('label').addClass('warning');
			setTimeout(function(){
				$('label').removeClass('warning');
			},1500);
		}
		});
	</script> -->
</body>
</html>