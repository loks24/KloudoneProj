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
<title>Reply</title>
</head>
<body>
<jstlcore:forEach items="${commentlist}" var="commentlist">
<jstlcore:set var="pl1" scope="session" value="${commentlist.id}"></jstlcore:set>
<jstlcore:set var="pl2" scope="session" value="${commentid}"></jstlcore:set>
<jstlcore:if test="${pl1==pl2}">
<p>${commentlist.body}</p>

<%-- <p>${PostBean.body}</p>
<p>${PostBean.title}</p> --%>
<%-- <jstlcore:forEach items="${replylist}" var="replylist">
<jstlcore:set var="rl1" scope="session" value="${replylist.id}"></jstlcore:set>
<jstlcore:set var="rl2" scope="session" value="${replyid}"></jstlcore:set>
<jstlcore:if test="${rl1==rl2}"> --%>


<jstlcore:set var="rl" scope="session" value="${replyid}"></jstlcore:set>
<f:form action="replycomment.html" modelAttribute="replybean">
    <table>
    <tr><td><label for="Body">Reply</label></td>
    <td><f:textarea path="body" id="Content" name="Content" rows="2" cols="35"/>
    </td></tr>
    <tr><td><f:hidden path = "parentid" value ="${rl}" /></td></tr>
    <tr><td><f:hidden path = "commentid" value = "${pl1}" /></td></tr>
    
    <tr><td colspan="1"><button class="button" style="vertical-align:middle"><span>Add Comment </span></button></td></tr>
    
  </table>
</f:form>

<%-- </jstlcore:if>
</jstlcore:forEach> --%>
</jstlcore:if>
</jstlcore:forEach>
</body>
</html>