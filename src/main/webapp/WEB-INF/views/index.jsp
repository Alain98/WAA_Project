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
					<div style="color:red;">${errorMessage}</div>
					
					<div class="row">	
		    			<button type="submit"  value="SignIn">Sign In</button>
					</div>	
					
					
		 </form:form>
		 <div>	
		    	<form action="Registration" method="get">				
					<div class="row">	
		    			<button type="submit"  value="SignUp">Sign Up</button>
					</div>	 
					
		 		</form>
		</div>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>