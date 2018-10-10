<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" href="../static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/page-style.css">
</head>
<body>

<div class="topbar"></div>
<h3 style="text-align: center;">科研成果>>学术论文成果</h3>
<div class="topbar"></div>
<div style="width: 100%;padding: 20px">

<form class="form-horizontal form-signin" action="#">
    <div class="form-group">
        <label for="title" class="col-sm-2 control-label">论文类型</label>
        <div class="col-sm-4">
	        	<select class="form-control" id="subject"  name="papertype" >
	                <option value="0" selected="selected">--请选择--</option>
	            </select>
        </div>
         <label for="projectSource" class="col-sm-2 control-label">项目来源</label>
       <div class="col-sm-3">
             <select class="form-control" id="type" name="projectsource">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
    </div>
    
    <div class="form-group">
    <label for="subject" class="col-sm-2 control-label">论文题目</label>
        <div class="col-sm-4">
           <input type="text" class="form-control" id="title" required placeholder="论文题目" name="papertitle">
        </div>
        <label for="ISSN" class="col-sm-2 control-label">学校署名</label>
        <div class="col-sm-3">
            <select class="form-control" id="type" name="schoolsign">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="type" class="col-sm-2 control-label">论文年限</label>
        <div class="col-sm-4">
            <select class="form-control" id="type" name="yearlimit">
                <option value="-1" selected="selected">--请选择--</option>
            </select>
        </div>
        <label for="correspondingAuthor" class="col-sm-2 control-label">期号</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="correspondingAuthor" required placeholder="期号" name="number">
        </div>
    </div>
   
    <div class="form-group">
        <label for="college" class="col-sm-2 control-label">刊物类型</label>
        <div class="col-sm-2">
            <select class="form-control" id="college" name="category">
                <option value ="0">--请选择--</option>
            </select>
        </div>
        <div class="col-sm-2">
            <select class="form-control" id="college" name="categorysecond">
                <option value ="0">--请选择--</option>
            </select>
        </div>
        <label for="ISSN" class="col-sm-2 control-label">ISSN号</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" id="correspondingAuthor" required placeholder="期号" name="ISSNnumber">
        </div>
    </div>
    
   <div class="form-group">
        <label for="sign" class="col-sm-2 control-label">第一作者</label>
        <div class="col-sm-4">
             <input type="text" class="form-control" id="correspondingAuthor" required placeholder="期号" name="firstauthor"> 
        </div>
        <label for="sign" class="col-sm-2 control-label">CN号</label>
        <div class="col-sm-3">
             <input type="text" class="form-control" id="correspondingAuthor" required placeholder="期号" name="cnNumber"> 
        </div>
    </div>
    
    <div class="form-group">
        <label for="sign" class="col-sm-2 control-label">通讯作者</label>
        <div class="col-sm-4">
             <select class="form-control" id="type" name="messageauthor">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
        <label for="sign" class="col-sm-2 control-label">版面</label>
        <div class="col-sm-3">
             <select class="form-control" id="type" name="layout">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="sign" class="col-sm-2 control-label">作者等级</label>
        <div class="col-sm-4">
             <select class="form-control" id="type" name="authorgrade">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
        <label for="sign" class="col-sm-2 control-label">学科门类</label>
        <div class="col-sm-3">
             <select class="form-control" id="type" name="firstproject">
                <option value="0" selected="selected">--请选择--</option>
            </select>
        </div>
    </div>    
    
    <div class="form-group">
        <label for="firstAuthor" class="col-sm-2 control-label">出版时间</label>
        <div class="col-sm-4">
            <input type="date" class="form-control" id="time" required placeholder="出版时间" name="publishdate">
        </div>
        <label for="sign" class="col-sm-2 control-label">附件</label>
        <div class="col-sm-3">
            <input type="file" class="form-control" id="time" required placeholder="附件" name="yourfile">
        </div>        
    </div>
  
    <div class="form-group">
        <label for="remark" class="col-sm-2 control-label">备注</label>
        <div class="col-xs-10 col-xs-offset-1">
            <textarea id="remark" style="width: 100%;height: 100px"></textarea>
        </div>
    </div>
    
    <div class="form-group">
        <input type="submit" class="btn btn-lg btn-primary col-sm-6 col-xs-12 col-sm-offset-3" value="提交" >
    </div>
</form>
</div>


<script src="../static/jQuery/jquery.min.js" ></script>
<script src="../static/js/uploading-scientificPayoffs.js"></script>

</body>
</html>
