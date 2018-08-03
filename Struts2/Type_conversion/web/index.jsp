<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/20 0020
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <s:property value="name"/><br/>
  <s:property value="age"/><br/>
  <s:property value="interests"/><br/>
  <s:date name="date" format="yyyy/MM/dd HH:mm:ss"/><br/>
  <s:property value="users"/><br/>
  <s:property value="point"/><br/>
  <s:property value="ps"/><br/>
  points:<s:property value="points"/><br/>
  <s:debug></s:debug>
  </body>
</html>
