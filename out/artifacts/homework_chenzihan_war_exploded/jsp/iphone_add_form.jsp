<%--
  Created by IntelliJ IDEA.
  User: 晚
  Date: 2018/8/26
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加表单</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">

    <form action="/iphone/add" method="post">
        <div class="form-group">
            <label for="id">ID</label>
            <input type="number" class="form-control" id="id" name="id" placeholder="id">
        </div>
        <div class="form-group">
            <label for="name">手机名称</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name">
        </div>
        <div class="form-group">
            <label for="resolution">手机分辨率</label>
            <input type="text" class="form-control" id="resolution" name="resolution" placeholder="resolution">
        </div>
        <div class="form-group">
            <label for="camera">摄像头</label>
            <input type="text" class="form-control" id="camera" name="camera" placeholder="camera">
        </div>
        <div class="form-group">
            <label for="system">系统</label>
            <input type="text" class="form-control" id="system" name="system" placeholder="system">
        </div>
        <div class="form-group">
            <label for="memory">运行内存</label>
            <input type="text" class="form-control" id="memory" name="memory" placeholder="memory">
        </div>
        <div><input type="submit"  class="form-control"></div>
    </form>
</div>

</body>
</html>
