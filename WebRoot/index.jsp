<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>trxy</title>
		<style type="text/css">
			
		</style>
	</head>
	<body>
		
		<jsp:forward page="WEB-INF/index.html"></jsp:forward>
		<script type="text/javascript">
			
		</script>
	</body>
</html>


