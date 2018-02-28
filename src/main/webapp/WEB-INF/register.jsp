<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 18/2/27
  Time: 上午9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
    <script src="/js/jquery-3.2.1.js"></script>
    <style>
        .box {
            width: 300px;
            height: 400px;
            border: 1px solid black;
            margin: 50px auto;
            text-align: center;
        }
        form{
            margin: 20px auto;
        }
        .text{
            margin:10px 20px;
        }
        span{
            margin-left: 20px;
        }
        a{
            color: #d3d3d3;
            font-size: 12px;
        }
        a:hover{
            color: pink;
        }
    </style>
</head>
<body>
<div class="box">
    <form action="/doregister" method="post">
        <span>用户名:</span><input class="text" type="text" name="name"><br/>
        <span>密 &nbsp;&nbsp;码:</span><input class="text" type="password" name="pwd"><br/>
        <span>简 &nbsp;&nbsp;介:</span><input class="text" type="text" name="desc"><br/>
        <span>电 &nbsp;&nbsp;话:</span><input class="text" type="text" name="tel"><br/>
        <span>地 &nbsp;&nbsp;址:</span><input class="text" type="text" name="address"><br/>
        <input type="submit" value="注册" style="width: 100px;height: 50px;margin: 10px 0"><br/>
    </form>

</div>
</body>
</html>