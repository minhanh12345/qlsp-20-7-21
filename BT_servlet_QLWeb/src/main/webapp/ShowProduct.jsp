<%@ page import="java.util.ArrayList" %>
<%@ page import="Product.Product" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/28/2021
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

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
      <%
        ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("listSP");
        String str ="";
        for (int i=0;i< list.size();i++) {
          str +="<tr> <td>" + list.get(i).getId() + "</td><td>" + list.get(i).getName() + "</td><td>" + list.get(i).getPrice()
                  + "</td><td>"+"<form action='/remove' method='post'  > <button type=\"submit\" name=\"remove\" value='"+i+"' >Remove</button></form>"
                  +"<form action='/edit' method='post'  > <button type=\"submit\" name=\"edit\" value='"+i+"' >Edit</button></form>"
                  +"</td></tr>";
        }
        out.println(str);
      %>
      </tbody>
    </table>
  </div>
  <a href="/index.jsp" class="btn btn-success">Create</a>
  </body>
</html>
