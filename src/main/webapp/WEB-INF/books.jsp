<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/4/2020
  Time: 6:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
    <style>
        body {
            text-align: center;
            font-size: 150%;
            background-color: mediumpurple;
            color: white;
        }
        table {
            width: 20rem;
            margin-left: auto;
            margin-right: auto;
        }
        th, td {
            width: 50%;
        }
        .title {
            text-align: left;
        }
        .author {
            text-align: right;
        }
        div {
            display: inline-block;
        }
        img {
            margin-top: 5rem;
            padding: 1rem;
            width: 10rem;
        }
    </style>
</head>
<body>
<h1>Books</h1>

<table>
    <tr>
        <th class="title">Title</th>
        <th class="author">Author</th>
    </tr>
    <tr>
        <td class="title">Animal Farm</td>
        <td class="author">George Orwell</td>
    </tr>
    <tr>
        <td class="title">To Kill a Mockingbird</td>
        <td class="author">Harper Lee</td>
    </tr>
<%--  THIS WILL INSERT ONE ENTRY WITH A POST OR GET REQUEST  --%>
<%--    <tr>--%>
<%--        <td class="title">${book.title}</td>--%>
<%--        <td class="author">${book.author}</td>--%>
<%--    </tr>--%>
<%--  THIS WILL FILL UP TABLE WITH DB ENTRIES  --%>
    ${DATA}
</table>


<div>
    <img src="../img/animal-farm.jpg" alt="">
</div>
<div>
    <img src="../img/to-kill-a-mockingbird.jpg" alt="">
</div>

<form method="post" action="/books">
    <label for="title">Title:<input type="text" id="title" name="title"></label>
    <label for="author">Author:<input type="text" id="author" name="author"></label>
    <button type="submit" class="btn">Submit</button>
</form>

</body>
</html>
