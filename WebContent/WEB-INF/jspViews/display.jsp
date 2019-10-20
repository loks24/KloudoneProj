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
<h2><a  href="welcome.html">Home</a></h2>
<h2><a  href="index.jsp">Logout</a></h2>
 <h2><a href="forum.html">Add Post</a></h2>
<h2 align="center">All Questions</h2>
<table border="0">
<jstlcore:forEach items="${postlist}" var="postlist">
<!-- <table border="1"> -->

<tr><td align="center"><h3><jstlcore:out value="${postlist.title}"></jstlcore:out></h3></td></tr>
<%-- <tr><td align="center">User:${user}</td></tr> --%>
<tr><td align="center"><jstlcore:out value="${postlist.body}"></jstlcore:out></td></tr>
<tr><td align="center"><form action="addcomment.html">
<input type="hidden" name="postid" value="${postlist.id}"/>
<button>Add Comment</button>
</form>
<form action="postcomment.html">
<input type="hidden" name="postid" value="${postlist.id}"/>
<button>View Post</button>
</form>
</td></tr>
<%-- <tr><td><a href="addcomment.html?id=${postlist.id}">Add Comment</a> --%>
<!-- </table> -->
</jstlcore:forEach>
</table>
<%-- 
<p>${PostBean.body}</p>
<p>${PostBean.title}</p> --%>
<%-- <f:form action="comment.html" modelAttribute="commentbean">
    <table>
    <tr><td><label for="Body">Comment</label></td>
    <td><f:textarea path="body" id="Content" name="Content" rows="2" cols="35"/>
    </td></tr>
    <tr><td><f:hidden path = "post" value = "${PostBean}" /></td></tr>
    <tr><td colspan="1"><button class="button" style="vertical-align:middle"><span>Add Comment </span></button></td></tr>
    
  </table>
</f:form> --%>

 <h2><a href="forum.html">Add Post</a></h2>
</center>


</body>
</html>