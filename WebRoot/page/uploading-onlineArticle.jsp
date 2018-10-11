<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*"  %>
<%@ page import="cn.trxy.dao.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
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
<h3 style="text-align: center;">科研成果>>网络论文成果</h3>
<div class="topbar"></div>
<div style="width: 100%;padding: 20px">

<form class="form-horizontal form-signin" action="<!-- 提交地址  -->" method="post" onsubmit="return toVaild()" >
    <div class="form-group">
        <label for="title" class="col-sm-2 control-label">文章标题</label>
        <div class="col-sm-4">
	        <input type="text" class="form-control" id="title" title="请输入你的文章标题" required placeholder="文章题目" name="papertitle">
        </div>
         <label for="projectSource" class="col-sm-2 control-label">文章类型</label>
       <div class="col-sm-3">
          <input type="text" class="form-control" title="请输入文章类型" id="projectSource" name="projectSource" required placeholder="文章类型" >
        </div>
    </div>
    
    <div class="form-group">
    <label for="firstauthor" class="col-sm-2 control-label">第一作者</label>
        <div class="col-sm-4">
           <input type="text" class="form-control" title="请输入第一作者姓名" required placeholder="第一作者" id="firstauthor" name="firstauthor">
        </div>
        <label for="messageauthor" class="col-sm-2 control-label">通讯作者</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" title="请输入通讯作者姓名" id="messageauthor" required placeholder="通讯作者" name="messageauthor"> 
        </div>
    </div>
    
    <div class="form-group">
        <label for="time" class="col-sm-2 control-label">发表时间</label>
        <div class="col-sm-4">
             <input type="date" class="form-control" title="请选择你的发表时间" id="time" required placeholder="出版时间" name="time">
        </div>
        <label for="provenance" class="col-sm-2 control-label">刊登报刊/互联网</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" title="请输入你论文刊登的报刊或互联网" id="provenance" required placeholder="刊登报刊/互联网">
        </div>
    </div>
   
    <div class="form-group">
        <label for="type" class="col-sm-2 control-label">学科门类</label>
        <div class="col-sm-4">
             <select class="form-control" title="请选择你的的学科门类" id="type" name="type">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <!-- 
                
                
                		这里写数据库获取类型的代码
                
                
                 -->
            </select>
        </div>
        <label for="subject" class="col-sm-2 control-label">一级学科</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" title="请输入你的一级学科" id="subject" required placeholder="一级学科" name="subject">
        </div>
    </div>
    
    <div class="form-group">
        <label for="number" class="col-sm-2 control-label">期号</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" title="请输入你的论文的期号" id="number" required placeholder="期号" name="number">
        </div>
        <label for="level" class="col-sm-2 control-label">署名单位第次</label>
        <div class="col-sm-3">
             <select class="form-control" title="请选择你的署名单位第次" id="level" name="level">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <!-- 
                	
                	这里写署名单位第次的选择  从数据库获取的代码
                	
                 -->
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="layout" class="col-sm-2 control-label">版面</label>
        <div class="col-sm-4">
             <select class="form-control" title="请选择你的版面" id="layout" name="layout">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <!-- 
                	
                	这里写版面选项  从数据库获取的代码
                	
                 -->
            </select>
        </div>
        <label for="pressNumber" class="col-sm-2 control-label">报刊号</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" title="请输入你的报刊期号" id="pressNumber" required placeholder="报刊号" name="pressNumber">
        </div>
    </div>    
    
    <div class="form-group">
        <label for="ageLimit" class="col-sm-2 control-label">成果所属年限</label>
        <div class="col-sm-4">
            <input type="date" class="form-control" title="请选择你成果的年限" id="ageLimit" required placeholder="成果所属年限" name="ageLimit">
        </div>
               
    </div>
  
    <div class="form-group">
        <input type="submit" class="btn btn-lg btn-primary col-sm-6 col-xs-12 col-sm-offset-3" value="提交" >
    </div>
</form>
</div>


<script src="<%=path%>/static/jQuery/jquery.min.js" ></script>
<script src="<%=path%>/static/js/uploading-scientificPayoffs.js"></script>
<script type="text/javascript">
function toVaild(){
		var select=new Array();
			select[0] = $("#type");
			select[1] = $("#level");
			select[2] = $("#layout");
		var val = new Array();
		 for (i in select){
		 	select[i].change(function(){
  				$(this).removeClass("warning");
			});
		 	val[i]=select[i].find("option:selected").val();
		 }
		 
        
        for (x in val)
		{
			if(val[x] == 0){
                    select[x].addClass("warning");
            		return false;
                 }
		}
        return true;
                
		
		}


</script>
</body>
</html>