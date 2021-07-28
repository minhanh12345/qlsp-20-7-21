<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/28/2021
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/product" method="post" >
    <div class="container">
        <h2>Product Table</h2>
        <table class="table">
            <thead>
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input placeholder="nhập id" name="id"></td>
                <td><input placeholder="nhập name" name="name"></td>
                <td><input placeholder="nhập price" name="price"></td>
            </tr>
            </tbody>
        </table>
    </div>
    <button type="submit"   >Create</button>
</form>
</body>
</html>
