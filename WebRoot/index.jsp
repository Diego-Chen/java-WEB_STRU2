<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登录</title>
  </head>
  
  <body>
    	<s:form action="index">
	        <s:textfield name="username" key="用户名"></s:textfield>
	        <s:textfield name="password" key="密    名"></s:textfield>
	         <s:submit key="登录"></s:submit>
    	</s:form>
  </body>
</html>
