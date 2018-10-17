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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>竟聘系统</title>
    <!-- 引入Bootstrap核心样式文件（必须） -->
    <link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
    <!-- 自己的样式或其他文件 -->
    <link rel="stylesheet" href="css/main.css">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body  onresize="autoHeight()" >
<!-- 顶部图片部分 -->

<div class="center-block overflow-hidden">

    <img src="res/photo/SuCai03.png" class="center-img" calt="Responsive image">
    <img src="res/photo/logo-TongRen.png" id="logo-TongRen">
    <h3 id="Title-h3">铜仁学院</h3>
    <h1 id="Title-h1">竟聘考核系统</h1>

</div>
<!-- /顶部图片部分 -->
<!-- 导航栏部分 -->
<div class="container-fluid">
    <div class="row">
        <div class="col-xs-12 nav-top">
        	<button id="btn-menu" class="btn btn-default" onclick="togglrMenu(this)" type="button">隐藏菜单栏  <span class="glyphicon glyphicon-chevron-left"></span></button>
       		<ul class="nav-top">
       			 <li><a href="javascript:void(0)" onmousedown="cheked(this,9);"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;用户中心</a></li>
           		 <li><a href="javascript:void(0)" onmousedown="cheked(this,10);"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;&nbsp;退出</a></li>
       		</ul>
        </div>
    </div>
    <div class="row">
    <div class="meun-max nvabar-left" id="meunView"  style="background: #2a2730;height:1000px"  >
        <ul class="meun">
            <li><a href="javascript:void(0)" class="active" onmousedown="cheked(this,1);"><span class="glyphicon glyphicon-stats" aria-hidden="true"></span>&nbsp;&nbsp;个人成果排行</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,2);"><span class="iconfont" aria-hidden="true">&#xe607;</span>&nbsp;&nbsp;科研成果&nbsp;&nbsp;<span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span></a>
                <ul class="meun-sub">
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,1);" >学术论文成果</a>
                    	<ul class="meun-level3">
                            <li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                             <li><a href="javascript:void(0)" onmousedown="level3cheked(this,1);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,2);" >优秀网络理论文章成果</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,2);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,3);" >科研成果获奖</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,3);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,4);" >科研平台</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,4);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,5);" >科研项目</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,5);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,6);" >文体艺术类成果</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,6);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,7);" >著作成果</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,7);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,8);" >著作权</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,8);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,9);" >专利成果</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,9);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,10);" >纵向项目</a>
                    	<ul class="meun-level3">
                    		<li><a href="javascript:void(0)" onmousedown="" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改</a></li>
                            <li><a href="javascript:void(0)" onmousedown="level3cheked(this,10);" ><span class="glyphicon glyphicon-open" aria-hidden="true"></span>&nbsp;&nbsp;上传</a></li>
                        </ul>
                    </li>
                    
                </ul>
            </li>
             <li><a href="javascript:void(0)" onmousedown="cheked(this,3);"><span class="iconfont" aria-hidden="true">&#xe658;</span>&nbsp;&nbsp;教学成果&nbsp;&nbsp;<span class="glyphicon glyphicon-chevron-up" aria-hidden="true"></span></a>
                 <ul class="meun-sub">
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,1);" >教改论文</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,2);" >教改项目</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,3);" >教改平台</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,4);" >纵向项目</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,5);" >著作成果</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,6);" >专利成果</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,7);" >网络文章成果</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,8);" >文体艺术成果</a></li>
                    <li><a href="javascript:void(0)" onmousedown="subcheked(this,9);" >教改成果</a></li>
                </ul>
             </li>
            <li><a href="javascript:void(0)" onmousedown="cheked(this,4);"><span class="iconfont" aria-hidden="true">&#xe658;</span>&nbsp;&nbsp;社会服务成果</a></li>
            <li><a href="javascript:void(0)" onmousedown="cheked(this,5);"><span class="iconfont" aria-hidden="true">&#xe604;</span>&nbsp;&nbsp;学科建设成果</a></li>
            <li><a href="javascript:void(0)" onmousedown="cheked(this,6);"><span class="iconfont" aria-hidden="true">&#xe60c;</span>&nbsp;&nbsp;(兼)行政管理业绩</a></li>
            <li><a href="javascript:void(0)" onmousedown="cheked(this,7);"><span class="glyphicon glyphicon-option-horizontal" aria-hidden="true"></span>&nbsp;&nbsp;其他业绩成果</a></li>
        </ul>
    </div>
    <!-- /导航栏部分 -->
    <!--  内容部分  -->
        <div id="data" class="data-min" style="height: 500px;" >

            <iframe name="myiframe" id="myrame" src="page/Scientific/lookOver/ranking.jsp"
                    frameborder="0" align="left" width="100%" height="100%" scrolling="auto"></iframe>
        </div>
    </div>
</div>
<!--  /内容部分  -->

<!--  脚注部分  -->
<footer class="bs-docs-footer">
    <div class="container">
        <ul class="bs-docs-footer-links">
            <li><a href="#">帮助</a></li>
            <li><a href="#">关于</a></li>
        </ul>
        <p>版权归大数据学院所有</p>
        <p>有任何需要帮助或建议的地方请<a href="#">联系我们</a>,乐意为您服务</p>
    </div>
</footer>

<!--  /脚注部分  -->
<!-- 由于Bootstrap的JS插件依赖jQuery，引入jQuery -->
<script src="static/jQuery/jquery.min.js"></script>
<!-- 引入所有的Bootstrap的JS插件 -->
<script src="static/bootstrap/js/bootstrap.min.js"></script>
<!-- 自己的脚本文件 -->
<script src="js/main.js"></script>
</body>
</html>