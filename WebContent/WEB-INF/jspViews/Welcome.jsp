<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="jstlcore" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=auto, initial-scale=1">
</head>
<body>
<div class="container">
<jsp:include page="include.jsp" />
<center>
<h2><a  href="back.html">All Posts</a></h2>
<jstlcore:set var="user" scope="application" value="${loginuser}"></jstlcore:set>
 <p>
Welcome To Q&A<br>
<h1>${user}</h1>
<br>
Here you can post your questions and get answers and clarifications from various users!!<br>
<br>
GET CLARIFIED!!
 </center>
</p> 
</div>
</body>
</html>
