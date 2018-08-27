<%@ page import="entity.Iphone" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 晚
  Date: 2018/8/25
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息列表</title>
    <link href="/css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
<form action="/iphone/search" method="get">
    <div class="input-group mb-3">
        <input type="text" name="name" class="form-control" placeholder="搜索你想知道的手机" aria-label="Recipient's username"
               aria-describedby="basic-addon2">
        <div class="input-group-append">
            <button class="btn btn-outline-secondary" type="submit">selete</button>
        </div>
    </div>
</form>
<form action="/iphone/add" method="get">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">手机名称</th>
            <th scope="col">手机分辨率</th>
            <th scope="col">摄像头</th>
            <th scope="col">系统</th>
            <th scope="col">运行内存</th>
            <th scope="col">其他操作</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Iphone> iphones = (List<Iphone>) request.getAttribute("iphones");
            for (Iphone iphone : iphones) {
        %>
        <tr>
            <th scope="row"><%=iphone.getId()%>
            </th>
            <td><%=iphone.getName() %>
            </td>
            <td><%=iphone.getResolution()%>
            </td>
            <td><%=iphone.getCamera()%>
            </td>
            <td><%=iphone.getSystem()%>
            </td>
            <td><%=iphone.getMemory()%>
            </td>
            <td>
                <a href="/iphone/del?id=<%= iphone.getId() %>">delete</a>
                <a href="/iphone/update?id=<%= iphone.getId() %>">update</a>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <input type="submit" value="add"/>
</form>
</body>
</html>
