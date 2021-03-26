<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="../res/user.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <title>Hello</title>
  <script src="https://kit.fontawesome.com/d71e6268fc.js"
   crossorigin="anonymous"></script>
</head>
<body>
  <nav class="navbar">
  	<ul class = "navbar__menu">
  		<li><a style = color:white; href="#"></a>
  		<li><a style = color:white; href=""></a>
  		<li><a style = color:white; href=""></a>
  	</ul>
  	<ul class="navbar__icon">
  	
 		<li><p style = color:black; class='welcome'><%= request.getParameter("id") %> 님 반갑습니다.</p></li>
   		<li><a style='' href="../login.jsp" class="btn btn-secondary btn-sm">로그아웃</a></li>
  	</ul>    
  </nav>
  <!-- Optional JavaScript -->
  <Script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <Script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>