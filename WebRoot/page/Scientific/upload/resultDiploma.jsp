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
<h3 style="text-align: center;">上传科研成果获奖</h3>
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
         <label for="resultType" class="col-sm-2 control-label">成果类型</label>
       <div class="col-sm-4">
          <select class="form-control" title="成果类型" id="resultType" name="resultType">
                <option value="1" selected="selected">科研成果获奖</option>             
            </select>
        
        </div>	
        
        
        <label for=" winningNames" class="col-sm-2 control-label">获奖名称</label>
        <div class="col-sm-3">
	     <input type="text" class="form-control" id="winningNames" title="请输入你的获奖名称" required placeholder="论文题目" name="winningNames">
        </div>
         
       
    </div>
    
    <div class="form-group">
    	   <label for="topDogType" class="col-sm-2 control-label">第一完成人类型</label>
       <div class="col-sm-4">
          <select class="form-control" title="请选择你的论文类型" id="topDogType" name="topDogType">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1"  >本校老师</option>
                <option value="2"  >非本校老师</option>
            </select>
        
        </div>	
       
    
        <label for="firstauthor" class="col-sm-2 control-label">第一完成人</label>
        <div class="col-sm-3">
           <input type="text" class="form-control" title="请输入第一完成人姓名" required placeholder="第一完成人" id="firstauthor" name="firstauthor">
        </div>
        
    </div>
   
    <div class="form-group">
        
         <label for="resultType" class="col-sm-2 control-label">成果名称</label>
        <div class="col-sm-4">
                <input type="text" class="form-control" title="请输入成果名称" required placeholder="成果名称" id="resultType" name="resultType">
        </div>
         <label for="collaborator" class="col-sm-2 control-label">其他完成人</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" title="请输入其他完成人"  required placeholder="其他完成人" name="collaborator" id="collaborator" >
        </div>
    </div>
    
    <div class="form-group">
        
         <label for="PI" class="col-sm-2 control-label">积分分配比例</label>
        <div class="col-sm-4">
			<input  type="button" value="点击填写积分分配比例"  class="form-control btn btn-info" title="请选择你的积分分配比例" id="PI" name="PI">
        </div>
        <label for="Geim" class="col-sm-2 control-label">获奖完成人</label>
        <div class="col-sm-3">
             <input type="text" class="form-control" title="请选择获奖完成人" id="Geim" required placeholder="获奖完成人" name="Geim">
        </div>
       	
       	
    </div>
    
    <div class="form-group">
       
        <label for="NNT" class="col-sm-2 control-label">获奖人数</label>
        <div class="col-sm-4">
             	<input type="number" class="form-control" title="请输入获奖人数" id="NNT" required placeholder="获奖人数" name="NNT">
         </div>
        
        
        <label for="authorization" class="col-sm-2 control-label">发证机关</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" title="请输入发证机关" id="authorization " required placeholder="发证机关" name="authorization ">
        </div>
        
        
        
        
        
    </div>    
    
    <div class="form-group">
        <label for="time" class="col-sm-2 control-label">获奖时间</label>
        <div class="col-sm-4">
            <input type="date" class="form-control" title="请输入获奖时间" id="time" required placeholder="获奖时间" name="time">
        </div>
        
        <label for="Level" class="col-sm-2 control-label">获奖级别</label>
        <div class="col-sm-3">
            <select class="form-control" id="Level" name="Level">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >国家级别</option>
                <option value="2" >省级</option>
                <option value="3" >市级</option>
                <option value="4" >校级</option>
        	</select>
         </div>       
    </div>
  <div class="form-group">
  		<label for="class" class="col-sm-2 control-label">获奖等级</label>
        <div class="col-sm-4">
            <select class="form-control" id="class" name="class">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >一等奖</option>
                <option value="2" >二等奖</option>
                <option value="3" >三等奖</option>
        	</select>
         </div>
  	
  		 
        <label for="CompleteUnit" class="col-sm-2 control-label">完成单位</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" title="请输入完成单位" id="CompleteUnit" required placeholder="完成单位" name="CompleteUnit">
        </div>
        
  </div>
   <div class="form-group">
   		<label for="UnitNumber" class="col-sm-2 control-label">总参加单位数</label>
        <div class="col-sm-4">
            <input type="number" class="form-control" title="请输入完成单位" id="UnitNumber" required placeholder="完成单位" name="UnitNumber">
        </div>
  		<label for="UnitRank" class="col-sm-2 control-label">单位排名</label>
        <div class="col-sm-3">
            <select class="form-control" id="UnitRank" name="UnitRank">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >1</option>
                <option value="2" >2</option>
                <option value="3" >3</option>
                <option value="4" >4</option>
                <option value="5" >5</option>
        	</select>
         </div>
  </div>
   <div class="form-group">
   		<label for="RegisterNumber" class="col-sm-2 control-label">奖励批准号</label>
        <div class="col-sm-4">
            <input type="number" class="form-control" title="请输入奖励批准号" id="RegisterNumber" required placeholder="奖励批准号" name="RegisterNumber">
        </div>
  		<label for="firstproject" class="col-sm-2 control-label">学科门类</label>
        <div class="col-sm-3">
             <select class="form-control" id="firstproject" name="firstproject">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >自然科学</option>
                <option value="2" >社会科学</option>
                
            </select>
        </div>       
  </div>
   <div class="form-group">
   		  <label for="subject" class="col-sm-2 control-label">一级学科</label>
        <div class="col-sm-4">
        	<input type="text" class="form-control" title="请输入你的一级学科" id="subject" required placeholder="一级学科" name="subject">
        </div>
        
  		<label for="remark" class="col-sm-2 control-label">备注</label>
        <div class="col-sm-3">
           <input type="text" class="form-control" title="备注" id="remark"/>
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
			select[2] = $("#resultType");
			select[3] = $("#topDogType");			
			select[4] = $("#Level");
			select[5] = $("#class");
			select[6] = $("#UnitRank");
			select[7] = $("#firstproject");
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