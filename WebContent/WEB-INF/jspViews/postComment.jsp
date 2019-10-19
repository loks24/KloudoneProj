<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="jstlcore" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Posts</title>
</head>
<body>
<center>
<h1 style="display:inline-block;">Kloudone Project</h1><br/><br/>
<h3><a  href="index.jsp">Home</a></h3>
<h2 align="center"></h2>
<jstlcore:forEach items="${postlist}" var="postlist">
<jstlcore:set var="pl1" scope="session" value="${postlist.id}"></jstlcore:set>
<jstlcore:set var="pl2" scope="session" value="${postid}"></jstlcore:set>
<jstlcore:if test="${pl1==pl2}">
<h2>${postlist.title}</h2>
<p>${postlist.body}</p>
</jstlcore:if>
</jstlcore:forEach>
<jstlcore:forEach items="${commentlist}" var="commentlist">
<jstlcore:set var="pl1" scope="session" value="${commentlist.postid}"></jstlcore:set>
<jstlcore:set var="pl2" scope="session" value="${postid}"></jstlcore:set>
<jstlcore:if test="${pl1==pl2}">
<h4>Comment</h4>
<p>${commentlist.body}</p>
</jstlcore:if>
</jstlcore:forEach>
</body>
</html>