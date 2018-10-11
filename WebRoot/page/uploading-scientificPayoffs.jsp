<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*"  %>
<%@ page import="cn.trxy.dao.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>

<%
	//准备科研成功--学术论文成果 需要的数据
	//1、论文类型
	PapertypeDao papertypeDao=new PapertypeDao();
	List<PapertypeBean> papertype = papertypeDao.getAll();
	//2、刊物类别
	AcademicPapercategoryDao academicPapercategoryDao=new AcademicPapercategoryDao();
	List<AcademicPapercategoryBean> allAcademicPapercategory = academicPapercategoryDao.getAllAcademicPapercategory();
	//3、作者等级表）
	AhthorunitDao ahthorunitDao=new AhthorunitDao();
	List<AhthorunitBean> ahthorunit= ahthorunitDao.getAll();
	//4、项目来源
	ProjectsourceDao projectsourceDao=new ProjectsourceDao();
	List<ProjectsourceBean> projectsource= projectsourceDao.getAll();
	//5、署名单位
	SignunitDao signunitDao=new SignunitDao();
	List<SignunitBean> signunit = signunitDao.getAll();
	//6、版面
	LayoutDao layoutDao = new LayoutDao();
	List<LayoutBean> layout= layoutDao.getAll();
	//7、学科门类
	SubjectcategoryDao SubjectcategoryDao = new SubjectcategoryDao();
	List<SubjectcategoryBean> subjectcategory = SubjectcategoryDao.getAll();
 %>

<!DOCTYPE html>
<html lang="zh" id="page-view">
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
<h3 style="text-align: center;">科研成果>>学术论文成果</h3>
<div class="topbar"></div>
<div style="width: 100%;padding: 20px" >

<form class="form-horizontal form-signin" action=" <%=path%>/paperRegiter.action" method="post" onsubmit="return toVaild()" >
    <div class="form-group">
        <label for="subject" class="col-sm-2 control-label">论文类型</label>
        <div class="col-sm-4">
	        	<select class="form-control" id="subject"  name="papertype" >
	              <option value="0" selected="selected" style="display: none">请选择</option>
	             
	                <% 
	                for(PapertypeBean p:papertype){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> 
	            </select>
        </div>
         <label for="type" class="col-sm-2 control-label">项目来源</label>
       <div class="col-sm-3">
             <select class="form-control" id="type" name="projectsource">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
                 <% 
	                for(ProjectsourceBean p:projectsource){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> 
            </select>
          </div>
    </div>
    
    <div class="form-group">
    <label for="title" class="col-sm-2 control-label">论文题目</label>
        <div class="col-sm-4">
           <input type="text" class="form-control" id="title" required placeholder="论文题目" name="papertitle">
        </div>
        <label for="schoolsign" class="col-sm-2 control-label">学校署名</label>
        <div class="col-sm-3">
            <select class="form-control" id="schoolsign" name="schoolsign">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
                 <% 
	                for(SignunitBean p:signunit){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %>
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="yearlimit" class="col-sm-2 control-label">论文年限</label>
        <div class="col-sm-4">
            <select class="form-control" id="yearlimit" name="yearlimit">
               <option value="0" selected="selected" style="display: none">请选择</option>
               
               <%
                for(int i=1;i<=10;i++){
                %>
                <option value="<%=i%>"><%=i %> 年</option>
                <%
                }
                 %> 
            </select>
        </div>
        <label for="correspondingAuthor" class="col-sm-2 control-label">期号</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" id="correspondingAuthor" required placeholder="期号" name="number">
        </div>
    </div>
   
    <div class="form-group">
        <label for="category" class="col-sm-2 control-label">刊物类型</label>
        <div class="col-sm-2">
            <select class="form-control" id="category" name="category"  onchange="change();">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
                <% 
	                for(AcademicPapercategoryBean p:allAcademicPapercategory){
	                %>
	                <option value="<%=p.getCategoryname()%>"  title="<%=p.getId()%>"><%=p.getCategoryname() %></option>
	                <% 
	                }
	                %>
            </select>
        </div>
        <div class="col-sm-2">
            <select class="form-control" id="categorysecond" name="categorysecond">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
            </select>
        </div>
        <label for="ISSNnumber" class="col-sm-2 control-label">ISSN号</label>
        <div class="col-sm-3">
        	<input type="text" class="form-control" id="ISSNnumber" required placeholder="ISSN号" name="ISSNnumber">
        </div>
    </div>
    
   <div class="form-group">
        <label for="firstauthor" class="col-sm-2 control-label">第一作者</label>
        <div class="col-sm-4">
             <input type="text" class="form-control" id="firstauthor" required placeholder="第一作者" name="firstauthor"> 
        </div>
        <label for="cnNumber" class="col-sm-2 control-label">CN号</label>
        <div class="col-sm-3">
             <input type="text" class="form-control" id="cnNumber" required placeholder="CN号" name="cnNumber"> 
        </div>
    </div>
    
    <div class="form-group">
        <label for="messageauthor" class="col-sm-2 control-label">通讯作者</label>
        <div class="col-sm-4">
         <input type="text" class="form-control" id="messageauthor" required placeholder="通讯作者" name="messageauthor"> 
        </div>
        <label for="layout" class="col-sm-2 control-label">版面</label>
        <div class="col-sm-3">
             <select class="form-control" id="layout" name="layout">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
               <% 
	                for(LayoutBean p:layout){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> 
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="authorgrade" class="col-sm-2 control-label">作者等级</label>
        <div class="col-sm-4">
             <select class="form-control" id="authorgrade" name="authorgrade">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
               <% 
	                for(AhthorunitBean p:ahthorunit){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %>
            </select>
        </div>
        <label for="firstproject" class="col-sm-2 control-label">学科门类</label>
        <div class="col-sm-3">
             <select class="form-control" id="firstproject" name="firstproject">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
               <% 
	                for(SubjectcategoryBean p:subjectcategory){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> 
            </select>
        </div>
    </div>    
    
    <div class="form-group">
        <label for="time" class="col-sm-2 control-label">出版时间</label>
        <div class="col-sm-4">
            <input type="date" class="form-control" id="time" required placeholder="出版时间" name="publishdate">
        </div>
        <label for="yourfile" class="col-sm-2 control-label">附件</label>
        <div class="col-sm-3">
            <input type="file" class="form-control" id="yourfile" required placeholder="附件" name="yourfile">
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


<script src="<%=path%>/static/jQuery/jquery.min.js" ></script>
<script src="<%=path%>/static/js/uploading-scientificPayoffs.js"></script>
<script type="text/javascript">

function change(){
	var category=document.getElementById("category");
 	var categorysecond=document.getElementById("categorysecond");
 	var index=category.selectedIndex;
	 var xmlhttp;
          if(window.XMLHttpRequest){
                   //正常浏览器、 ie7+ 创建XMLHttpRequest
                   xmlhttp=new XMLHttpRequest();
          }else{
                   //ie 567创建XMLHttpRequest
                   xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
          }
          
          xmlhttp.onreadystatechange=function(){
                   if(xmlhttp.readyState==4&&xmlhttp.status==200){
                             var xmlData=xmlhttp.responseXML;
                             //追加元素
                             var objs=xmlData.getElementsByTagName("obj");
                             var options="<option>请选择</option>";
                             for(var i=0;i<objs.length;i++){
                             	var name=objs[i].getElementsByTagName("name")[0].firstChild.nodeValue;
                             	var id=objs[i].getElementsByTagName("id")[0].firstChild.nodeValue;
                             	options+='<option value='+id+'>'+name+'</option>';
                             }
                             categorysecond.innerHTML=options;
                   }
          }
         
          //向服务器发送请求
          xmlhttp.open("GET","/TongRenXueYuan_PerformanceExamineSystem/trxypes/getCategoregrade?index="+index,true);
          xmlhttp.send();
}

function toVaild(){
		var select=new Array();
			select[0] = $("#subject");
			select[1] = $("#type");
			select[2] = $("#schoolsign");
			select[3] = $("#yearlimit");
			select[4] = $("#category");
			select[5] = $("#layout");
			select[6] = $("#authorgrade");
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
            		console.log(x);
            		if(x<=4){
            			$("#page-view").animate({scrollTop:0},'slow');
            		}else{
            			$("#page-view").animate({scrollTop:300},'slow');
            		}
                     return false;
                 }
		}
        return true;
                
		
		}

</script>
</body>
</html>