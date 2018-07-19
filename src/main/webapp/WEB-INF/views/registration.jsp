<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id=RegistrationForm>
       		<form:form modelAttribute="user" action="Registration" method="post">
    		
    				<div class = "err"><form:errors path = "firstName" cssClass = "error" /></div>
    		
    				<div class="row">
		    			<form:input type="text" path="firstName" placeholder="First Name" />
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "lastName" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="lastName" placeholder="Last Name" />
		  			</div> 
		  			
		  			
		  			<div class = "err"><form:errors path = "email" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="email" placeholder="Email" />
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "password" cssClass = "error" /></div>
					<div class="row">
		    		<form:input type="password"  path="password" placeholder="Password" />
					</div>	
					
					<div class = "err">${confirmPasswordErr}<form:errors path = "confirmPassword" cssClass = "error" /></div>
					<div class="row">
		    		<form:input type="password"  path="confirmPassword" placeholder="Confirm Password" />
					</div>	
					
					<div class = "err"><form:errors path = "address" cssClass = "error" /></div>
					<div class="row">
		    			<form:input type="text" path="address" placeholder="Address" />
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "mobile" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="mobile" placeholder="Mobile"/>
		  			</div> 
		  			
		  			
					<div class="row">	
		    			<button type="submit"  value="Signup">Sign Up</button>
					</div>	 
					
		 </form:form>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>