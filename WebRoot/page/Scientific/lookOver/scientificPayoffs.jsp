<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*"  %>
<%@ page import="cn.trxy.dao.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<% 
//获得当前用户的id
UserBean userInfo= (UserBean)request.getSession().getAttribute("userInfo");
//传入用户id获取所有学术论文
AcademicPaperDao academicPaperDao=new AcademicPaperDao();
List<AcademicPaperBean> academicPaper=academicPaperDao.getAll(userInfo.getId());
//刊物等级
CategoregradeDao categoregradeDao=new CategoregradeDao();
%>

<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 	<title>竟聘系统</title>
	<link rel="stylesheet" href="<%=path%>/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=path%>/css/page-style.css">
</head>
<body>

<div class="topbar"></div>
<h1 style="text-align: center;" >科研成果>>学术论文成果</h1>

<div class="table-responsive" style="width: 95%;margin:0px auto;">
    <table class="table table-bordered table-hover">
        <thead>
        <tr class="info">
        	<th>序号</th>
            <th>论文类型</th>
            <th>论文题目</th>
            <th>第一作者</th>
            <th>通讯作者</th>
            <th>本人等级</th>
            <th>学校署名</th>
            <th>出版时间</th>
            <th>项目来源</th>
            <th>刊物类型</th>
            <th>刊物类型等级</th>
            <th>版面</th>
            <th>学科门类</th>
            <th>期号</th>
            <th>ISSN号</th>
            <th>CN号</th>
            <th>积分</th>
            <th>审核状态</th>
        <tr>
        </thead>
        <tbody>
       <%--  <% 
        int i=0;
        if(academicPaper.size()>0){
        for(AcademicPaperBean a:academicPaper){
        i++;
        %>
        <tr>
        	<td><%=i %></td>
	        <td><%=a.getPapertype() %></td>
	       	<td><%=a.getPapertitle() %></td>
	        <td><%=a.getFirstauthor() %></td>
	        <td><%=a.getMessageauthor() %></td>
	       	<td><%=a.getAuthorgrade() %></td>
	       	<td><%=a.getSchoolsign() %></td>
	       	<td><%=a.getPublishdate() %></td>
	       	<td><%=a.getProjectsource() %></td>
	        <td><%=a.getCategory() %></td>
	       <td><%=categoregradeDao.getByIdCategoregrade(Integer.parseInt(a.getCategorysecond())).getTypename() %></td>
	        <td><%=a.getLayout() %></td>
	        <td><%=a.getFirstproject() %></td>
	       <td><%=a.getNumber() %></td>
	       <td><%=a.getISSNnumber() %></td>
	       <td><%=a.getCnNumber() %></td>
	        <td><%=a.getScore() %></td>
	       <td style="color:red;"><%=a.getStatuss()==1? "已审核" : "审核中" %></td>
	        </tr>
        <%
        }
        }
        %> --%>
        </tbody>
    </table>
</div>

</body>
</html>