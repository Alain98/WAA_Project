<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id=RegistrationForm>
       		<form:form modelAttribute="user" action="Registration" method="post">
    		
    				<div class = "err"><form:errors path = "firstName" cssClass = "error" /></div>
    		
    				<div class="row">
		    			<form:input type="text" path="firstName" placeholder="First Name" value="DFName"/>
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "lastName" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="lastName" placeholder="Last Name" value="DLName"/>
		  			</div> 
		  			
		  			
		  			<div class = "err"><form:errors path = "email" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="email" placeholder="Email" value="DEmail@abc.com"/>
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "password" cssClass = "error" /></div>
					<div class="row">
		    		<form:input type="password"  path="password" placeholder="Password" value="Password"/>
					</div>	
					
					<div class = "err">${confirmPasswordErr}<form:errors path = "confirmPassword" cssClass = "error" /></div>
					<div class="row">
		    		<form:input type="password"  path="confirmPassword" placeholder="Confirm Password" value="Password"/>
					</div>	
					
					<div class = "err"><form:errors path = "address" cssClass = "error" /></div>
					<div class="row">
		    			<form:input type="text" path="address" placeholder="Address" value="Fairfield"/>
		  			</div> 
		  			
		  			<div class = "err"><form:errors path = "mobile" cssClass = "error" /></div>
		  			<div class="row">
		    			<form:input type="text" path="mobile" placeholder="Mobile" value="3473246775"/>
		  			</div> 
		  			
		  			
					<div class="row">	
		    			<button type="submit"  value="Signup">Sign Up</button>
					</div>	 
					
		 </form:form>
 </div>
 
 </div>

 <jsp:include page="footer.jsp"/>