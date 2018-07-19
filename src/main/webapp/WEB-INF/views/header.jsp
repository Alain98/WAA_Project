<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hostel Reservation System</title>
<link href="<c:url value="/resource/css/sliderResponsive.css"></c:url>" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="<c:url value="/resource/css/style.css"></c:url>" type="text/css">
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js" ></script>
	<link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
   
	
	<script>
		$(document).ready(function(){
			
			$("#menu-toggle").click(function(){
				
				$("#menu-wrapper").slideToggle('fast');
			});
			
		});
	</script>
	
	
	<style>

#slider2 {
    max-width: 30%;
    margin-right: 20px;
}

.row2Wrap {
    display: flex;
}

.content {
    padding: 50px;
    margin-bottom: 100px;
}

html {
    height: 100%;
    box-sizing: border-box;
}
*, *:before, *:after {
    box-sizing: inherit;
}
h1, h2, h3 {
    font-family: 'Crimson Text', sans-serif;
    font-weight: 100;
}
body {
    font: 15px 'Titillium Web', Arial, sans-serif;
    background: radial-gradient(#121212, #000);
    height: 100%;
    color: #aaa;
    margin: 0;
    padding: 0;
}

.content {
    padding: 10px 15vw;
}
</style>

</head>
<body>
<div id="header">
				
				<!-- div id="logo">
					<a href="index.jsp"><img src="<c:url value="/resource/images/TripleAa.png"></c:url>" alt="LOGO" height="112" width="118"></a>
				</div-->
				
				
				
				<div id="navigation">
					<a href="#" id="menu-toggle">Menu</a>
					<ul id="menu-wrapper">
						<li class="selected">
							<a href="index.jsp">Home</a>
						</li>
						<li>
							<a href="about.jsp">About</a>
						</li>
						<!--<li>
							<a href="rooms.jsp">Rooms</a>
						</li>
						
						<li>
							<a href="food.jsp">Food</a>
						</li>  -->
						<li>
							<a href="registeration.jsp">Join Us</a>
						</li>
						<li>
							<a href="contact.jsp">Contact</a>
						</li>
						
						<c:if test="${not empty authUser}">
							<li style="align: right;">
								<a href="Logout">Logout</a>
							</li>
						</c:if>
					</ul>
					
				</div>
				
				
				
			</div>
			
