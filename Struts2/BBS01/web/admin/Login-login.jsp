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
<s:text name="welcome.msg">
    <s:param value="username"/>
</s:text>
<s:property value="password	"/>
<s:property value="container"/>
<s:debug></s:debug>
</body>
</html>
