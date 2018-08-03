<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/18 0018
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="admin/Login-login" method="post">
<%--    <s:property value="getText('login.username')"/><input name="username" type="text"/>
    <s:property value="getText('login.password')"/><input name="password" type="password" />--%>
    <s:text name="login.username"/><input type="text" name="username"/>
    <s:text name="login.password"/><input type="password" name="password"/>
    <input type="submit" value="<s:text name="login.login"/>" />
    <br>
    <a href="/admin/language?request_locale=zh_CN">中文</a>
    <a href="/admin/language?request_locale=en_US">English</a>
</form>
<s:debug></s:debug>
<%--<a href="admin/lang?request_locale=en_US">en</a>
<a href="admin/lang?request_locale=zh_CN">cn</a>--%>

</body>
</html>
