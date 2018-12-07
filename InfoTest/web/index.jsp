<%@ page import="java.util.List" %>
<%@ page import="entity.User" %><%--
  Created by IntelliJ IDEA.
  User: luosen
  Date: 2018/12/3
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>info</title>
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
  <%--<%
      boolean addflag=(boolean)request.getAttribute("addSuccess");
      if(addflag==true) {
        out.print("能够获取到页面值");
      }
    %>--%>
  <%--<script type="text/javascript" language="JavaScript">
      alert("提交成功，请查询核实！");
      window.location='index.html';
  </script>--%>
  <form action="addServlet" method="get">
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
        <td colspan="2" style="text-align:center"><input name="submit" type="submit" value="提交"/></td>
      </tr>
    </table>
  </form>
  <form action="showServlet" method="get">
    <table class="table" style="height:auto">
      <tr>
        <td colspan="2" style="text-align:center"><input name="submit" type="submit" value="查询"/></td>
      </tr>
    </table>
  </form>
  <table border="1" style="line-height:40px; margin:10px;width:400px">
    <tr>
      <th>账号</th>
      <th>姓名</th>
      <th>密码</th>
      <th>联系方式</th>
      <th>籍贯</th>
      <th>操作</th>
    </tr>
    <%
      List<User> list=(List<User>) request.getAttribute("list");
      if(list!=null&&list.size()>0){

      for(User user:list){
    %>
    <tr style="text-align:center">
      <td><%=user.getId()%></td>
      <td><%=user.getName()%></td>
      <td><%=user.getPasswd()%></td>
      <td><%=user.getTel()%></td>
      <td><%=user.getAddress()%></td>
      <td><a href="edit.jsp">编辑</a>|<a href="deleteServlet?id=<%=user.getId()%>">删除</a></td></tr>
    <%
        }
      }
    %>
  </table>
  </body>
</html>
