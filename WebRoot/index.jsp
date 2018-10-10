<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>入口</title>
  </head>
  <body>
   
   <jsp:forward page="/WEB-INF/login.jsp"></jsp:forward>
   
   
  </body>
</html>
