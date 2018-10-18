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

<div class="view">
<div class="topbar"></div>
<h3 style="text-align: center;">上传网络论文成果</h3>
<div class="topbar"></div>
<div style="width: 100%;padding: 20px">

<form class="form-horizontal form-signin" action="<!-- 提交地址  -->" method="post" onsubmit="return toVaild()" >
    <div class="form-group">
        
         <label for="unit" class="col-sm-2 control-label">所属单位</label>
       <div class="col-sm-4">
          <select class="form-control" title="请选择所属单位" id="unit" name="unit">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <option value="1" >行政机构</option>
                <option value="2" >继续教育学院</option>
                <option value="3" >大健康学院</option>
                <option value="4" >大数据学院</option>
                <option value="5" >经济管理学院</option>
                <option value="6" >人文学院</option>
                <option value="7" >马克思主义学院</option>
                <option value="8" >国际学院</option>
                <option value="9" >材料化学与工程学院</option>
                <option value="10" >农林工程与规划学院</option>
                <option value="11" >艺术学院</option>
                <option value="12" >教育学院</option>
                <option value="13" >乌江学院</option>
                <option value="14" >田秋学院</option>
                <option value="15" >现代教育技术中心</option>
                <option value="16" >图书馆(档案馆)</option>
                <option value="17" >学报编辑部</option>
            </select>
       </div>
        
        <label for="ageLimit" class="col-sm-2 control-label">成果所属年限</label>
        <div class="col-sm-3">
            <select class="form-control" id="ageLimit" name="ageLimit">
               <option value="0" selected="selected" style="display: none">请选择</option>
               
               <%
                for(int i=2018;i<=2028;i++){
                %>
                <option value="<%=i%>"><%=i %> 年</option>
                <%
                }
                 %> 
            </select>
        
        </div>
        
    </div>
    
    <div class="form-group">
          <label for="projectSource" class="col-sm-2 control-label">论文类型</label>
       <div class="col-sm-4">
          <select class="form-control" title="请选择你的论文类型" id="projectSource" name="projectSource">
                <option value="1" selected="selected" >优秀网络理论文章</option>
            </select>
        
        </div>	
        <label for="title" class="col-sm-2 control-label">论文标题</label>
        <div class="col-sm-3">
	     <input type="text" class="form-control" id="title" title="请输入你的论文标题" required placeholder="论文题目" name="papertitle">
        </div>
       
        
        	
    </div>
    
    <div class="form-group">
        <label for="firstauthor" class="col-sm-2 control-label">第一作者</label>
        <div class="col-sm-4">
           <input type="text" class="form-control" title="请输入第一作者姓名" required placeholder="第一作者" id="firstauthor" name="firstauthor">
        </div>
        <label for="firstAuthornit" class="col-sm-2 control-label">第一作者所属单位</label>
        <div class="col-sm-3">
           <input type="text" class="form-control" title="请输入第一作者所属单位" required placeholder="第一作者所属单位" id="firstAuthornit" name="firstAuthornit">
        </div>
        
    </div>
   
    <div class="form-group">
        
         <label for="level" class="col-sm-2 control-label">署名单位第次</label>
        <div class="col-sm-4">
             <select class="form-control" title="请选择你的署名单位第次" id="level" name="level">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <option value="1"  >第一署名单位</option>
                <option value="2"  >第二署名单位</option>
            </select>
        </div>
         <label for="owner" class="col-sm-2 control-label">所有作者</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" title="请输入所有作者"  required placeholder="所有作者" name="owner" id="owner" >
        </div>
    </div>
    
    <div class="form-group">
        
         <label for="provenance" class="col-sm-2 control-label">刊登报刊/互联网</label>
        <div class="col-sm-2">
            <select class="form-control" title="请选择你的出版平台" id="provenance" name="provenance">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <option value="1"  >中央级报刊</option>
              	<option value="2"  >电视新闻媒体</option>
                <option value="3"  >电视新闻媒体的“两微一端”</option>
                <option value="4"  >省部级单位网站</option>
				<option value="5"  >省会城市政务和新闻等网站</option>
				<option value="6"  >中国新闻网及其“两微一端”</option>
				<option value="7"  >重要商业门户网站</option>
				<option value="8"  >其他</option>
			</select>
        </div>
       	<div class="col-sm-2">
       		<input type="text" readonly="readonly" title="成果对应积分" placeholder="成果对应积分" style="background-color:yellow;color: #fff;" class="form-control" id="resultCode"  onkeyup="" name="resultCode">
       	</div>
       	
        <label for="time" class="col-sm-2 control-label">发表时间</label>
        <div class="col-sm-3">
             <input type="date" class="form-control" title="请选择你的发表时间" id="time" required placeholder="出版时间" name="time">
        </div>
       	
       	
    </div>
    
    <div class="form-group">
       
        <label for="type" class="col-sm-2 control-label">学科门类</label>
        <div class="col-sm-4">
             <select class="form-control" title="请选择你的的学科门类" id="type" name="type">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <option value="1" >社会科类</option>
                <option value="2" >自然科类</option>
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
        
        <label for="schoolsign" class="col-sm-2 control-label">学校署名</label>
        <div class="col-sm-3">
            <select class="form-control" id="schoolsign" name="schoolsign">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >第一署名单位</option>
                <option value="2" >第二署名单位</option>
                <option value="3" >第三署名单位</option>
        	</select>
         </div>       
    </div>
  <div class="form-group">
  		<label for="layout" class="col-sm-2 control-label">版面</label>
        <div class="col-sm-4">
             <select class="form-control" title="请选择你的版面" id="layout" name="layout">
                <option value="0" selected="selected" style="display: none" >请选择</option>
                <option value="1"  >正刊</option>
                <option value="2"  >增刊</option>
            </select>
        </div>
  	
  		 
        <label for="pressNumber" class="col-sm-2 control-label">报刊号</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" title="请输入你的报刊期号" id="pressNumber" required placeholder="报刊号" name="pressNumber">
        </div>
        
  </div>
  
  
  
    <div class="form-group">
        <input type="submit" class="btn btn-lg btn-primary col-sm-6 col-xs-12 col-sm-offset-3" value="提交" >
    </div>
</form>
</div>
</div>

<script src="<%=path%>/static/jQuery/jquery.min.js" ></script>
<script src="<%=path%>/static/js/uploading-scientificPayoffs.js"></script>
<script type="text/javascript">
function toVaild(){
		var select=new Array();
			select[0] = $("#unit");
			select[1] = $("#ageLimit");
			select[2] = $("#projectSource");
			select[3] = $("#level");			
			select[4] = $("#provenance");
			select[5] = $("#type");
			select[6] = $("#schoolsign");
			select[7] = $("#layout");
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