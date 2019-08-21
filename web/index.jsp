<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/21
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="login/a" method="get">
    <%--用户：<input type="text" value="user" name="name"><br/>--%>
    用户：<input type="text" value="" name="name"><br/>
    密码：<input type="text" value="" name="password"><br/>
    <input type="submit" value="登录">
</form>
<%--<form action="login/ab" method="get">
    &lt;%&ndash;用户：<input type="text" value="user" name="name"><br/>&ndash;%&gt;
    用户：<input type="text" value="ab" name="name"><br/>
    密码：<input type="text" value="123456" name="password"><br/>
    <input type="submit" value="登录">
</form>--%>
<%--<form action="loginServlet.do" method="post">
    &lt;%&ndash;用户：<input type="text" value="user" name="name"><br/>&ndash;%&gt;
    用户：<input type="text" value="admin" name="name"><br/>
    密码：<input type="text" value="123" name="password"><br/>
    <input type="submit" value="登录">
</form>

<form action="abc.do" method="get">
    &lt;%&ndash;用户：<input type="text" value="user" name="name"><br/>&ndash;%&gt;
    用户：<input type="text" value="helen" name="name"><br/>
    密码：<input type="text" value="123456" name="password"><br/>
    <input type="submit" value="登录">
</form>--%>
</body>
</html>
