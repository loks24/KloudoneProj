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
<title>Comment</title>
</head>
<body>
<jstlcore:forEach items="${postlist}" var="postlist">
<jstlcore:set var="pl1" scope="session" value="${postlist.id}"></jstlcore:set>
<jstlcore:set var="pl2" scope="session" value="${postid}"></jstlcore:set>
<jstlcore:if test="${pl1==pl2}">
<p>${postlist.title}</p>
<p>${postlist.body}</p>

<%-- <p>${PostBean.body}</p>
<p>${PostBean.title}</p> --%>
<f:form action="comment.html" modelAttribute="commentbean">
    <table>
    <tr><td><label for="Body">Comment</label></td>
    <td><f:textarea path="body" id="Content" name="Content" rows="2" cols="35"/>
    </td></tr>
    <tr><td><f:hidden path = "postid" value = "${pl1}" /></td></tr>
    <tr><td colspan="1"><button class="button" style="vertical-align:middle"><span>Add Comment </span></button></td></tr>
    
  </table>
</f:form>
</jstlcore:if>
</jstlcore:forEach>
</body>
</html>