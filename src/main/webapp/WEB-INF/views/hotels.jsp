<jsp:include page="header.jsp"/>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="page">
<jsp:include page="slide.jsp"/>
      <h1>Rooms:</h1>
  <div id="rowImg"> 
      <c:forEach items="${hotels}" var="user">
       ${hotel.name}
      </c:forEach>
</div>
      
 
</div>
 <jsp:include page="footer.jsp"/>