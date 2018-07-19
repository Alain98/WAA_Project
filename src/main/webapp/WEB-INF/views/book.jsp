<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<jsp:include page="header.jsp" />  
		<div id="page">

			<jsp:include page="slide.jsp"/>
		
           <div id="loginForm">
       		<form:form modelAttribute="booking" action="room" method="post">
    		
		    		<div class="row">
		    			<label>Check-in</label> 
		    			<form:input path="checkIn" type="date" placeholder="mm/dd/yyyy"/>
		  			</div> 
		  			
					<div class="row">
		    		    Check-out <form:input path="checkOut" type="date" placeholder="mm/dd/yyyy"/>
					</div>	
					
					<div class="row">
		    			Adults(18+) <form:input type="number" path="adults"/>
		  			</div> 
		  			
		  			<div class="row">
		    			Children(0-17) <form:input type="number" path="children"/>
		  			</div> 
		  			<br/>
		  			
		  			
<div class="panel panel-default credit-card-box">
<div class="panel-heading display-table" >
<div class="row display-tr" >
<h3 class="panel-title display-td" >Payment Details</h3>
<div class="display-td" >                            
<img class="img-responsive pull-right" src="http://i76.imgup.net/accepted_c22e0.png">
</div>
</div>                    
</div>
<div class="panel-body">
<div class="row">
<div class="col-xs-12">
<div class="form-group">
<label for="cardNumber">CARD NUMBER</label>
<div class="input-group">
<form:input 
type="tel"
class="form-control"
name="cardNumber"
path="payment.cardNumber"
placeholder="Valid Card Number"
autocomplete="cc-number"
autofocus 
/>
<span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
</div>
</div>                            
</div>
</div>
<div class="row">
<div class="col-xs-7 col-md-7">
<div class="form-group">
<label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
<form:input 
type="tel" 
class="form-control" 
name="cardExpiry"
placeholder="MM / YY"
autocomplete="cc-exp"
path="payment.ExpirationDate"
/>
</div>
</div>
<div class="col-xs-5 col-md-5 pull-right">
<div class="form-group">
<label for="cardCVC">CV CODE</label>
<form:input 
path="payment.cvCode"
type="tel" 
class="form-control"
name="cardCVC"
placeholder="CVC"
autocomplete="cc-csc"
/>
</div>
</div>
</div>
<div class="row">
<div class="col-xs-12">
<button class="btn btn-success btn-lg btn-block" type="submit">Reserve</button>
</div>
</div>
<div class="row" style="display:none;">
<div class="col-xs-12">
<p class="payment-errors"></p>
</div>
</div>
</div>
</div> 
</form:form>
 </div>
 
 </div>
 <jsp:include page="footer.jsp"/>