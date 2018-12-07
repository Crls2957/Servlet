<%--
  Created by IntelliJ IDEA.
  User: luosen
  Date: 2018/12/7
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>edit</title>
    <style>
        body{
            width:600px;
            margin:0 auto
        }
        .table{
            width:400px;
            height:300px;
            border:1px solid #000000;
            margin:10px;
            padding:20px;
            text-align:center;
        }
    </style>
</head>
<body>
<form action="updateServlet" method="get">
    <table class="table">
        <tr>
            <td style="text-align:right">账号：</td>
            <td style="text-align:left"><input name="userId"/></td></tr>
        <tr>
            <td style="text-align:right">姓名：</td>
            <td style="text-align:left"><input name="userName"/></td>
        </tr>
        <tr>
            <td style="text-align:right">密码：</td>
            <td style="text-align:left"><input name="userPasswd"/></td>
        </tr>
        <tr>
            <td style="text-align:right">联系方式：</td>
            <td style="text-align:left"><input name="userTel"/></td>
        </tr>
        <tr>
            <td style="text-align:right">籍贯：</td>
            <td style="text-align:left"><input name="userAddress"/></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align:center"><input name="submit" type="submit" value="修改"/></td>
        </tr>
    </table>
</form>
</body>
</html>
