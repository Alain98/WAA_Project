<jsp:include page="header.jsp"/>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div id="page">
	<jsp:include page="slide.jsp"/>
	  
	  <c:choose>
		<c:when test="${not empty bookings}">
			<h1 align="center">List of all reservation in ${hotel.name}:</h1>
			  <div id="rowImg"> 
			      <c:forEach items="${rooms}" var="room">
			      	  <div id="column">
					    <img src="<c:url value="/resource/images/rooms/${room.roomsId}.png"></c:url>" >
						<p style="color: black;"> ${room.description}</p>
						<p style="color: black;"> ${room.costPerNight} $</p>
						<p><a href="<spring:url value="/booking/room?idr=${room.roomsId}?idh=${hotel.hotelId}" /> ">Reserve Now</a></p>
					  </div>
			      </c:forEach>
			</div>
		</c:when>
		<c:otherwise>
			<h1 align="center">There are no rooms available in ${hotel.name}</h1>
		</c:otherwise>
	</c:choose>	
  
</div>
 <jsp:include page="footer.jsp"/>