<%--
  Created by IntelliJ IDEA.
  User: Mwinyi
  Date: 7/13/2020
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% session.setAttribute("message","please guess");
HttpSession session1 =request.getSession(true);
int randomnumber=(int)(Math.random()*100)+1;
session.setAttribute("saveNumber" , random);
%>
<p>Visit this site</p><br>
Click the link
<a href="inputno.jsp">Guess number</a>
/body>
</html>
