<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2020
  Time: 3:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My First Jsp</title>
    <style>
        body {
            text-align: center;
            font-size: 150%;
            background-color: mediumpurple;
            color: white;
        }
        a, a:link, a:visited, a:hover, a:active {
            text-decoration: none;
            color: white;
        }
        a:hover {
            color: purple;
        }
    </style>
</head>
<body>
<h1>Hello world!</h1>
<p><a href="books">Books</a></p>
<p><a href="redirect">Redirect</a></p>
<p><a href="hello?first=Steven&last=D%27Hondt">Personal greeting</a></p>
<p><a href="xml">Xml Servlet</a></p>
</body>
</html>