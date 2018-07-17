<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id="loginForm">
       		<form:form modelAttribute="user" action="Login" method="post">
    		
		    		<div class="row">
		    			<form:input type="text" path="email" placeholder="Email"/>
		  			</div> 
		  			
					<div class="row">
		    		<form:input type="password"  path="password" placeholder="Password"/>
					</div>	
					
					<div class="row">	
		    			<button type="submit"  value="Login">Login</button>
					</div>	 
					
		 </form:form>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>