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
<body>
<!-- 顶部图片部分 -->

<div class="center-block overflow-hidden">

    <img src="res/photo/SuCai03.png" class="center-img" calt="Responsive image">
    <img src="res/photo/logo-TongRen.png" id="logo-TongRen">
    <h3 id="Title-h3">铜仁学院</h3>
    <h1 id="Title-h1">竟聘考核系统</h1>

</div>
<!-- /顶部图片部分 -->
<!-- 导航栏部分 -->
<div class="container-fluid" style="margin-top: 50px;">
    <div class="row">
        <div class="col-sm-3 meun-button">
            <button class="btn btn-default" onclick="togglrMenu(this)" type="button">隐藏菜单栏  <span class="glyphicon glyphicon-chevron-left"></span></button>
        </div>
    </div>
    <div class="row">
    <div class="meun-max nvabar-left" id="meunView" style="background: #ccffcc;overflow-y: auto; height: 1000px;">
        <ul class="meun">
            <li><a href="javascript:void(0)" class="active" onclick="cheked(this,1);">个人成果排行</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,2);">科研成果</a>
                <ul class="meun-sub">
                    <li><a href="javascript:void(0)" onclick="subcheked(this,1);" >论文类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,2);">项目类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,3);">获奖类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,4);">著作出版成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,5);">科技及文化创新成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,6);">荣誉类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,7);">学术活动成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,8);">指导学术类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,9);">服务社会类成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,10);">教学任务积分量化</a></li>
                </ul>
            </li>
            <li><a href="javascript:void(0)" onclick="cheked(this,3);">社会服务成果</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,4);">学科建设成果</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,5);">(兼)行政管理业绩</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,6);">其他业绩成果</a></li>
            
            <li><a href="javascript:void(0)" onclick="cheked(this,7);">上传</a>
                <ul class="meun-sub">
                    <li><a href="javascript:void(0)"  onclick="subcheked(this,11);" >科研成果</a>
                        <ul class="meun-level3">
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,1);">论文类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,2);">项目类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,3);">获奖类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,4);">著作出版成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,5);">科技及文化创新成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,6);">荣誉类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,7);">学术活动成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,8);">指导学术类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,9);">服务社会类成果</a></li>
                            <li><a href="javascript:void(0)" onclick="level3cheked(this,10);">教学任务积分量化</a></li>
                        </ul>
                    </li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,12);">社会服务成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,13);">学科建设成果</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,14);">(兼)行政管理业绩</a></li>
                    <li><a href="javascript:void(0)" onclick="subcheked(this,15);">其他业绩成果</a></li>
                </ul>
            </li>
            
            <li><a href="javascript:void(0)" onclick="cheked(this,8);">用户中心</a></li>
            <li><a href="javascript:void(0)" onclick="cheked(this,9);">退出</a></li>
        </ul>
    </div>
    <!-- /导航栏部分 -->
    <!--  内容部分  -->
        <div id="data" class="data-min" style="height: 1000px;" >

            <iframe name="myiframe" id="myrame" src="page/ranking.html"
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