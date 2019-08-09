<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/3
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/mvc/test2.do" method="post">
    用户名 <input type="text" name="name"/><br/>
    年龄 <input type="text" name="age"/><br/>
    生日 <input type="text" name="birthday"/><br/>
    城市 <input type="text" name="address.city"/><br/>
    地区 <input type="text" name="address.area"/><br/>
    爱好
    <input type="submit" value="提交"/>
</form>
</body>
</html>
