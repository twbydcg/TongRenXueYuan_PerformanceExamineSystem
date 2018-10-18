<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*"  %>
<%@ page import="cn.trxy.dao.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>



<link rel="stylesheet" href="<%=path%>/static/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=path%>/css/page-style.css">



<div class="view">
<div class="topbar"></div>
<div>
<h3 style="display: inline;">
    <small>您当前排名：</small>
    1
</h3>

<div style="display: inline;float: right;">
    <div class="btn-group">
        <button class="btn btn-xs btn-default  dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true"
                aria-expanded="false">
            按学历检索 <span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li><a href="#">按学历检索</a></li>
            <li><a href="#">按职称检索</a></li>
        </ul>
    </div>
    <button type="button" class="btn btn-sm btn-warning">
        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>&nbsp;申诉
    </button>
<button type="button" class="btn btn-sm btn-success">
    <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>&nbsp;刷新列表
</button>
</div>
</div>
<div class="table-responsive" style="width: 100%">
    <table class="table table-bordered table-hover">
        <thead>
        <tr class="info">
            <th>排名</th>
            <th>姓名</th>
            <th>学历</th>
            <th>职称</th>
            <th>教学成果</th>
            <th>社会服务成果</th>
            <th>学科建设成果</th>
            <th>综合积分</th>
        </tr>
        </thead>
        <tr class="success">
            <th>1</th>
            <td>小张</td>
            <td>博士</td>
            <td>教师</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
        <tr>
            <th>2</th>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
        <tr>
            <th>3</th>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
        <tr>
            <th>4</th>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
            <td>xxx</td>
        </tr>
    </table>
</div>
</div>
<script src="<%=path%>/static/jQuery/jquery.min.js"></script>
<script src="<%=path%>/static/bootstrap/js/bootstrap.min.js"></script>


