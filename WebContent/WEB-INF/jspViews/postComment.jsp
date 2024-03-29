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
<title>Post</title>
</head>
<body>
<center>
<h1 style="display:inline-block;">Kloudone Project</h1><br/><br/>
<h3><a  href="welcome.html">Home</a></h3>
<h3><a  href="index.jsp">Logout</a></h3>
<h3><a  href="back.html">Back</a></h3>
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
<form action="reply.html">
<input type="hidden" name="commentid" value="${commentlist.id}"/>
<button>Add Reply</button>
</form>
<jstlcore:forEach items="${replylist}" var="replylist">
<jstlcore:set var="rl1" scope="session" value="${replylist.commentid}"></jstlcore:set>
<jstlcore:set var="rl2" scope="session" value="${commentlist.id}"></jstlcore:set>
<jstlcore:if test="${rl1==rl2}">
<h4>Reply</h4>
<p>${replylist.body}</p>
<form action="reply1.html">
<input type="hidden" name="commentid" value="${commentlist.id}"/>
<input type="hidden" name="replyid" value="${replylist.id}"/>
<button>Add Reply</button>
</form><br>
<%-- <jstlcore:set var="rl3" scope="session" value="${replylist.id}"></jstlcore:set> --%>
<jstlcore:set var="rl4" scope="session" value="${replylist.parentid}"></jstlcore:set>
<jstlcore:if test="${!empty rl4}">
Reply to a Reply
<h3>${replylist.body}</h3>

</jstlcore:if>
</jstlcore:if>
</jstlcore:forEach>
<%-- <form action="reply.html">
<input type="hidden" name="commentid" value="${commentlist.id}"/>
<button>Add Reply</button>
</form> --%>
</jstlcore:if>
</jstlcore:forEach>
</body>
</html>