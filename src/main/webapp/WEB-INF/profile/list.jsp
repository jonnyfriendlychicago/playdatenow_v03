<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/include/head.jsp" />

<body>
	<jsp:include page="/WEB-INF/include/header.jsp" />
	
	<div id=pageHeader class="container-fluid p-2 bg-primary text-white text-center">
		<h2>Members</h2>
	</div>
		
	<div id=main class="container-fluid">

<%-- 		<div id="profileList" class="container m-5">

		    <c:if test="${successMsg != null}">
			    <div class="alert alert-success alert-dismissible fade show" role="alert">
				  ${successMsg}
				  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
			</c:if>
			
			<h3>Members List</h3>
			<!-- <a href= "/playdate/new"><button class="btn btn-primary">Create New Playdate</button></a> -->
			<table class="table table-striped table-hover table-bordered table-responsive mt-2">
				<thead>
					<tr>
						<th scope="col">id</th>
						<th scope="col">userName</th>
<!-- 						<th scope="col">x</th>
						<th scope="col">y</th>
						<th scope="col">Date/Time</th> -->
					</tr>
				</thead>
				<tbody>
					<c:forEach var="record" items="${profileList}">
						<tr>
							<td>${record.id}</td>
							<td>
								<a class="text-decoration-none" href="/profile/${record.id}"  >${record.userName}</a>
							</td>
							<td>
								<fmt:formatDate value="${record.eventDate}" pattern="MMMM dd"/>, <fmt:formatDate value="${record.eventDate}" pattern="yyyy"/> @ ${record.startTimeTxt}
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div> <!-- end profileList -->
		 --%>
		
		<div id="profileCardArray" class="container m-5 d-flex flex-wrap">
			<c:forEach var="record" items="${profileList}">
				<div class="card m-3" style="width: 18rem;">
				 	<!-- <img src="..." class="card-img-top" alt="..."> -->
					<div class="card-body">
						<h5 class="card-title">${record.userName}</h5>
						<p class="card-text">${record.firstName} ${record.lastName}</p>
						
							<pre style="white-space: pre-wrap; max-height: 10rem; overflow: ellipsis;">${record.aboutMe}</pre>
						
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item">Joined: <fmt:formatDate value="${record.createdAt}" pattern="MMMM"/> <fmt:formatDate value="${record.createdAt}" pattern="yyyy"/></li>
						<li class="list-group-item"><a class="text-decoration-none" href="/profile/${record.id}">View Full Profile</a></li>
					</ul>
					<!-- <div class="card-body">
						<a href="#" class="card-link">Card link</a>
						<a href="#" class="card-link">Another link</a>
					</div> -->
				</div>
			</c:forEach>
			
			
		</div> <!-- end profileCardArray -->
		
<%-- 		<div id="playdateForm" class="container">
			<h3>Quick Playdate Entry</h3>
			<form:form action='/playdate/newFromList' method='post' modelAttribute='playdate'>
				
				<div class="form-group">
					<form:label path="playdateName" for="playdateName">playdateName</form:label>
					<form:input type="text" class="form-control" path="playdateName"/>
					<p class="errorText"><form:errors path="playdateName"/>
					</p>
				</div>
				
				<div class="form-group">
					<form:label path="playdateDesc" for="playdateDesc">playdateDesc</form:label>
					<form:textarea type="text" class="form-control" path="playdateDesc" />
					<p class="errorText"><form:errors path="playdateDesc" /></p>
				</div> 				
		
				<button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
		
			<c:choose>
				<c:when test="${path == 'errorOnCreate' }">
					<a href= "/playdate"><button class="btn btn-secondary">Cancel</button></a>
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose> 			
		</div> <!-- end playdateForm -->

 --%>	
	</div> <!-- end main -->  
 	<jsp:include page="/WEB-INF/include/footerbuffer.jsp"/>
 	<jsp:include page="/WEB-INF/include/footer.jsp"/>
</body>
</html>