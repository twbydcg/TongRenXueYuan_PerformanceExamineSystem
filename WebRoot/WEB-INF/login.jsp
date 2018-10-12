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
    <!-- 引入Bootstrap核心样式文件（必须） -->
    <link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">

    <!-- 自己的样式或其他文件 -->
    <link rel="stylesheet" href="css/login.css">
    <style type="text/css">
    .col-sm-3:hover{cursor: pointer;}
    </style>

</head>
<body style="overflow-x:hidden">
<!-- 顶部图片 -->
<div class="center-block overflow-hidden">
    <img src="res/photo/SuCai03.png" class="center-img" calt="Responsive image">
    <img src="res/photo/logo-TongRen.png" id="logo-TongRen">
    <h3 id="Title-h3">铜仁学院</h3>
    <h1 id="Title-h1">竟聘考核系统</h1>
</div>

<!-- /顶部图片 -->
<!--  内容部分  -->
<div class="title-line">
    <span class="title" style="cursor: default;">登 录</span>
</div>
<div class="container">
    <div class="row login-box">
        <div class="login-left  hidden-xs col-sm-6">
            <div class="login-left-head">
                <ul>
                    <li><a class="a-bolck" onclick="TabClick(this,1)">公共下载</a></li>
                    <li><a class="a-bolck" onclick="TabClick(this,2)">信息公开</a></li>
                </ul>
            </div>
            <div class="login-left-body">
                <div id="page1" class="login-left-tab"><h1 class="tab-title">公共下载</h1>
                    <hr />
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                    <p>文件名： <a href="">链接</a></p>
                </div>
                <div id="page2" class="login-left-tab" style="display: none"><h1 class="tab-title">信息公开</h1>
                    <hr />
                    <p>这是一个div id=page2  class=login-left-tab</p>
                    <p>当内容没有超出范围则隐藏滚动条</p>
                    <p>否则显示滚动条</p>
                </div>
            </div>
        </div>
        <div class="login-line hidden-xs"></div>
        <div class="login-right col-sm-6">
            <div class="login-right-head"></div>
            <form class="form-horizontal form-signin" action="checkLogin.action" method="post">
                <!-- 身份选择-->
                <div class="form-group">
                    <label for="useride" class="col-sm-3 control-label">用户身份</label>
                    <div class="col-sm-9">
                        <select class="form-control" id="useride">
                            <option value="1" selected>普通教师</option>
                            <option value="2" >审核人员</option>
                            <option value="3" >超级用户</option>
                        </select>
                    </div>
                    </div>
                <!-- 职工号-->
				<div class="form-group">
                    <label for="workerNum" class="col-sm-3 control-label">职工号</label>
                    <div class="col-sm-9">
                            <input type="text" class="form-control"  id="workerNum"
                                   title="职工号应为5~12位数字" maxlength="10" autofocus pattern="[0-9]{5,12}"
                                   required placeholder="职工号"  name="account">
                    </div>
				</div>
                <!-- 密码 <!-- required pattern="^[a-zA-Z]\w{5,17}$" -->
				<div class="form-group">
                    <label for="userPassword" class="col-sm-3 control-label">密码</label>
                    <div class="col-sm-9">
                         <input type="password" class="form-control" id="userPassword"  placeholder="Password" name="password"
                                maxlength="10" 
                                title="字母开头，长度在6~18之间，只能包含字母、数字和下划线"  onkeyup="value=value.replace(/[^a-zA-Z0-9]/g,'')">
                    </div>
				</div>
                <!-- 验证码-->
				<div class="form-group">
                    <label for="userPassword" class="col-sm-3 control-label">验证码</label>
                    <div class="col-sm-6">
                        <input name="secruityCode" class="form-control" type="text" title="请输入验证码" required placeholder="输入验证码">
                    </div>
                    
                    <div class="col-sm-3">
                    	<img alt="" src="<%=path %>/trxypes/SecurityCode"  onclick="changCode(this)" />
                    </div>
                        
				</div>
                <!--  忘记密码按钮-->
				<div class="form-group">
                    <a href="#" class="col-sm-offset-5 col-xs-offset-3">忘记密码？</a>
                <!-- 登录按钮-->
                    <input class="btn btn-lg btn-primary col-sm-6 col-xs-12 col-sm-offset-3 " type="submit" value="登 录">
                </div>
                
            </form>
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

<script src="js/login.js"></script>
<script type="text/javascript">
//点击改变验证码
function changCode(obj){
	obj.src="<%=path %>/trxypes/SecurityCode?arg="+Math.random();
}
</script>
</body>
</html>