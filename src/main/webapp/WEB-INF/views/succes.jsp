<jsp:include page="header.jsp" />  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div id="page">

<jsp:include page="slide.jsp"/>

<h1>reservation made successfully ${authUser.firstName} ${authUser.lastName}</h1>
<!--  <p align="center"><a href="<spring:url value="/hotels/searchHotel" /> ">Go back home</a></p>-->
 </div>
<jsp:include page="footer.jsp"/>