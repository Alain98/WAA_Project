<jsp:include page="header.jsp"/>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.3/jquery.min.js"></script>
<script type="text/javascript">




$(function() {
	
	var stars = function() {
	    return $(this).each(function() {
	        // Get the value
	        var val = parseFloat($(this).html());
	        // Make sure that the value is in 0 - 5 range, multiply to get width
	        var size = Math.max(0, (Math.min(5, val))) * 16;
	        // Create stars holder
	        var $span = $('<span />').width(size);
	        // Replace the numerical value with stars
	        $(this).html($span);
	    });
	} 
	
     $('span.stars').each(stars);
});


</script>
<style type="text/css">
	span.stars, span.stars span {
		display: block;
		background: url(http://www.ulmanen.fi/stuff/stars.png) 0 -16px repeat-x;
		width: 80px;
		height: 16px;
	}
	
	span.stars span {
		background-position: 0 0;
	}
</style>

<div id="page">
	<jsp:include page="slide.jsp"/>
	  
	  <c:choose>
		<c:when test="${not empty hotels}">
			<h1 align="center">Available hotels in ${city}:</h1>
			  <div id="rowImg"> 
			      <c:forEach items="${hotels}" var="hotel">
			      	  <div id="column">
					    <img src="<c:url value="/resource/images/hotels/${hotel.hotelId}.png"></c:url>" >
						<p style="color: black;"> ${hotel.name}</p>
						<span class="stars">${hotel.stars}</span>
						<p><a href="<spring:url value="/hotels/room?id=${hotel.hotelId}" /> ">Rooms</a></p>
					  </div>
			      </c:forEach>
			</div>
		</c:when>
		<c:otherwise>
			<h1 align="center">There are no hotels located to ${city} in our database</h1>
		</c:otherwise>
	</c:choose>	
  
</div>
 <jsp:include page="footer.jsp"/>