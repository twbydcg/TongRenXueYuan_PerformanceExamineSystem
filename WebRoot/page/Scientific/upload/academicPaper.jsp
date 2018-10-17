<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*" %>
<%@ page import="cn.trxy.dao.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE html>
<html lang="zh" id="page-view">
<head>
    <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>竞聘系统</title>
	<link rel="stylesheet" href="<%=path%>/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=path%>/css/page-style.css">

</head>

<body>
<div class="view">
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
	              <option value="1" >教改论文</option>
	              <option value="2" >科研论文</option>
	             
	                <%-- <% 
	                for(PapertypeBean p:papertype){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %>  --%>
	            </select>
        </div>
         <label for="type" class="col-sm-2 control-label">项目来源</label>
       <div class="col-sm-3">
             <select class="form-control" id="type" name="projectsource">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >国家级</option>
                <option value="2" >省级</option>
                <option value="3" >市级</option>
                <option value="4" >校级</option>
                
                 <%-- <% 
	                for(ProjectsourceBean p:projectsource){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %>  --%>
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
                <option value="1" >第一署名单位</option>
                <option value="2" >第二署名单位</option>
                
                 <%-- <% 
	                for(SignunitBean p:signunit){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> --%>
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="yearlimit" class="col-sm-2 control-label">论文年限</label>
        <div class="col-sm-4">
            <select class="form-control" id="yearlimit" name="yearlimit">
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
                <option value ="1"  >Science和Nature</option>
                <option value="2"  >国内期刊</option>
                <option value="3"  >SCI</option>
                <option value="4"  >EI</option>
                <option value="5"  >SSCI</option>
                <option value="6"  >CPCI(ISIP)</option>
                <option value="7"  >普刊</option>                
            </select>
        </div>
        <div class="col-sm-2">
            <select class="form-control" id="categorysecond" name="categorysecond">
                <option value="0" selected="selected" style="display: none">请选择</option>
                
            </select>
        </div>
        <label for="resultCode" class="col-sm-2 control-label">成果对应积分</label>
        <div class="col-sm-3">
        	<input type="text" readonly="readonly"  style="background-color:yellow" class="form-control" id="resultCode"  onkeyup="Calculation();" name="resultCode">
        </div>   
    </div>
    
   <div class="form-group">
        <label for="firstauthor" class="col-sm-2 control-label">第一作者</label>
        <div class="col-sm-4">
             <input type="text" class="form-control" id="firstauthor" required placeholder="第一作者" name="firstauthor"> 
        </div>
       <label for="time" class="col-sm-2 control-label">出版时间</label>
        <div class="col-sm-3">
            <input type="date" class="form-control" id="time" required placeholder="出版时间" name="publishdate">
        </div>     
    </div>
    
    <div class="form-group">
        <label for="messageauthor" class="col-sm-2 control-label">通讯作者</label>
        <div class="col-sm-4">
         <input type="text" class="form-control" id="messageauthor" placeholder="通讯作者" name="messageauthor"> 
        </div>
        <label for="layout" class="col-sm-2 control-label">版面</label>
        <div class="col-sm-3">
             <select class="form-control" id="layout" name="layout">
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >正刊</option>
                <option value="2" >增刊</option>
                
            </select>
        </div>
    </div>
    
    <div class="form-group">
        <label for="authorgrade" class="col-sm-2 control-label">作者等级</label>
        <div class="col-sm-4">
             <select class="form-control" id="authorgrade" name="authorgrade">
<<<<<<< HEAD
                <option value="0" selected="selected" style="display: none">请选择</option>
                <option value="1" >第一作者</option>
                <option value="2" >第二作者</option>
                <option value="3" >通讯作者</option>
                
               <%-- <% 
=======
                <option value="0" selected="selected" style="display: none">请选择</option>     
               <% 
>>>>>>> dc5cc0a8e3cfcebf47470422e25e08f6594f21a8
	                for(AhthorunitBean p:ahthorunit){
	                %>
	                <option value="<%=p.getName()%>"><%=p.getName() %></option>
	                <% 
	                }
	                %> --%>
            </select>   
        </div>
       <label for="yourCode" class="col-sm-2 control-label">所得积分</label>
        <div class="col-sm-3">
        	<input type="text" readonly="readonly"  style="background-color:red" class="form-control" id="yourCode"  onkeyup="Calculation1();" name="yourCode">
        </div>   
    </div>    
    
    <div class="form-group">
    
        <label for="ISSNnumber" class="col-sm-2 control-label">ISSN号</label>
        <div class="col-sm-4">
        	<input type="text" class="form-control" id="ISSNnumber" required placeholder="ISSN号" name="ISSNnumber">
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
      <label for="cnNumber" class="col-sm-2 control-label">CN号</label>
        <div class="col-sm-4">
             <input type="text" class="form-control" id="cnNumber" required placeholder="CN号" name="cnNumber"> 
        </div> 
        <label for="yourfile" class="col-sm-2 control-label">附件</label>
        <div class="col-sm-3">
            <input type="file" class="form-control" id="yourfile" required placeholder="附件" name="yourfile">
        </div>  
    </div>
    <div class="form-group">
        <label for="remark" class="col-sm-2 control-label">备注</label>
        <div class="col-xs-10 col-xs-offset-1">
            <textarea id="remark"  style="width: 100%;height: 100px"></textarea>
        </div>
    </div>
    
    <div class="form-group">
        <input type="submit" class="btn btn-lg btn-primary col-sm-6 col-xs-12 col-sm-offset-3" value="提交" onclick="Calculation1()">
    </div>
</form>
</div>

</div>
<script src="<%=path%>/static/jQuery/jquery.min.js" ></script>
<script src="<%=path%>/static/js/uploading-scientificPayoffs.js"></script>
<script type="text/javascript">

function change(){
	var val = $("#category").val();
    var opt = $("#categorysecond");
     switch (val) {
            case "1":

                opt.html("<option value='0'>请选择</option><option value ='2000'  >Science&&Nature</option><option value ='1000'  >Nature子刊</option>");
                break;
            case "2":
            	opt.html("<option value='0'>请选择</option><option value ='900'  >A 类</option><option value ='600'  >B 类</option><option value ='300'  >C 类</option><option value ='120'  >D 类</option>");
               
                 break;
            case "3":
               opt.html("<option value='0'>请选择</option><option value ='900'  >1 区</option><option value ='600'  >2 区</option><option value ='300'  >3 区</option><option value ='150'  >4 区</option><option value ='75'  >5 区</option>");
                break;
            case "4":
                opt.html("<option value='0'>请选择</option><option value ='225'  >EI源刊</option><option value ='60'  >EI会议收录</option>");
                break;
            case "5":
                opt.html("<option value='0'>请选择</option><option value ='225'  >IF<1</option><option value ='375'  >1<=IF<3</option><option value ='600'  >3<=IF<6</option><option value ='900'  >IF>=6</option>");
                break;
            case "6":
                opt.html("<option value='0'>请选择</option><option value ='60'  >CPCI(ISIP)</option><option value ='60'  >CPCI-S</option><option value ='60'  >CPCI-SSH</option><option value ='225'  >A&HCI</option>");
                break;
            case "7":
                opt.html("<option value='0'>请选择</option><option value ='40'  >铜仁学院学报</option><option value ='20'  >其他</option>");
                break;        
            default:
                break;}
}

function toVaild(){
		var select=new Array();
			select[0] = $("#subject");
			select[1] = $("#type");
			select[2] = $("#schoolsign");
			select[3] = $("#yearlimit");
			select[4] = $("#category");
			select[5] = $("#layout");
			select[6] = $("#categorysecond");
			select[7] = $("#authorgrade");
			select[8] = $("#firstproject");
			
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

$(function Calculation(){
    $("#categorysecond").change(function(){
    	
           value1=$("#categorysecond option:selected").val();
           document.getElementById("resultCode").value=value1;
    })
    })
    
   
</script>
<script type="text/javascript">

 $(function Calculate(){
	    var value2 = $("#category").val();
	    var value3 = $("#schoolsign").val();
	    var value4 = $("#authorgrade").val();
	    var value5= $("#resultCode").val();
	    var fenpei=0;
           if(value2!="7"){
        	   
         	    if(value3=="1"){
         	    	
         	    	if(value4=="1"){
         	    		document.getElementById("yourCode").value=value5;
         	    		
         	    	}    	    		
         	    	if(value4=="2"){
        	    		document.getElementById("yourCode").value=fenpei;
        	    		
         	    	} 
         	    }
         	    if(value3=="2"){
         	    	if(value4=="1"){
         	    		document.getElementById("yourCode").value=value5*0.6;
         	    	}
         	    	if(value4=="2"){
         	    		document.getElementById("yourCode").value=value5*0.35;
         	    	}
         	    	if(value4=="3"){
         	    		document.getElementById("yourCode").value=value5*0.5;
         	    	}
         	    }
         	    return;
         	    }
           if(value2=="7"){
        	   if(value3=="1"){
        	    	
        	    	if(value4=="1"){
        	    		document.getElementById("yourCode").value=value5;
        	    		
        	    	}
        	    	else 
        	    		document.getElementById("yourCode").value=0;
	
           }else
        	   document.getElementById("yourCode").value=0;
        	   return;
           }
         
    })
$(function Calculation1(){
	 $("#authorgrade").change(function(){
		    var value2 = $("#category").val();
		    var value3 = $("#schoolsign").val();
		    var value4 = $("#authorgrade").val();
		    var value5= $("#resultCode").val();
	           if(value2!="7"){
	        	   
	         	    if(value3=="1"){
	         	    	
	         	    	if(value4=="1"){
	         	    		document.getElementById("yourCode").value=value5;
	         	    		
	         	    	}
		
	         	    }
	         	    if(value3=="2"){
	         	    	if(value4=="1"){
	         	    		document.getElementById("yourCode").value=value5*0.6;
	         	    	}
	         	    	if(value4=="2"){
	         	    		document.getElementById("yourCode").value=value5*0.35;
	         	    	}
	         	    	if(value4=="3"){
	         	    		document.getElementById("yourCode").value=value5*0.5;
	         	    	}
	         	    }
	         	    return;
	         	    }
	           if(value2=="7"){
	        	   if(value3=="1"){
	        	    	
	        	    	if(value4=="1"){
	        	    		document.getElementById("yourCode").value=value5;
	        	    		
	        	    	}
	        	    	else 
	        	    		document.getElementById("yourCode").value=0;
		
	           }else
	        	   document.getElementById("yourCode").value=0;
	        	   return;
	           } 
	 })     
	 $("#schoolsign").change(function(){
		 var value2 = $("#category").val();
		    var value3 = $("#schoolsign").val();
		    var value4 = $("#authorgrade").val();
		    var value5= $("#resultCode").val();
	           if(value2!="7"){
	        	   
	         	    if(value3=="1"){
	         	    	
	         	    	if(value4=="1"){
	         	    		document.getElementById("yourCode").value=value5;
	         	    		
	         	    	}
		
	         	    }
	         	    if(value3=="2"){
	         	    	if(value4=="1"){
	         	    		document.getElementById("yourCode").value=value5*0.6;
	         	    	}
	         	    	if(value4=="2"){
	         	    		document.getElementById("yourCode").value=value5*0.35;
	         	    	}
	         	    	if(value4=="3"){
	         	    		document.getElementById("yourCode").value=value5*0.5;
	         	    	}
	         	    }
	         	    return;
	         	    }
	           if(value2=="7"){
	        	   if(value3=="1"){
	        	    	
	        	    	if(value4=="1"){
	        	    		document.getElementById("yourCode").value=value5;
	        	    		
	        	    	}
	        	    	else 
	        	    		document.getElementById("yourCode").value=0;
		
	           }else
	        	   document.getElementById("yourCode").value=0;
	        	   return;
	           }
	 })     
    }) 
	 
        	   </script>  

</body>
</html>