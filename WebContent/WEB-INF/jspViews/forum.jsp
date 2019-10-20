<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
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
<h3><a  href="back.html">All Posts</a></h3>
<h2 align="center">Ask Your Question</h2>
<f:form action="update.html" modelAttribute="PostBean">
    <table>
    <tr><td><label for="Title">Title</label></td>
    <td> <f:input path="title" placeholder="Title" type="text" />
    <font color="red"><f:errors path="title" style="font-family:sans serif;"/></font>
    </td>
	</tr>
    <tr><td><label for="content">Content</label></td>
    <td><f:textarea path="body" id="Content" name="Content" rows="10" cols="60"/>
    </td></tr>
    <tr><td colspan="1"><button class="button" style="vertical-align:middle"><span>Submit </span></button></td></tr>
    <tr><td colspan="2"><font style="font-family:sans serif;" color="red">${message}</font></td></tr>
  </table>
</f:form>
</center>

</body>
</html>