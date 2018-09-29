<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<form action="paper/paperRegiter.action" method="post">

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>trxy</title>
		<style type="text/css">
			
		</style>
	</head>
	<body>
		
		<!--
papertype varchar(30) NOT NULL COMMENT '论文类型',
papertitle VARCHAR(30) NOT NULL COMMENT '论文题目',
firstauthor VARCHAR(30) NOT NULL COMMENT '第一作者',
messageauthor VARCHAR(30) COMMENT '通讯作者',
ofdeptment VARCHAR(30) NOT NULL COMMENT '所属单位',
publishdate date NOT NULL COMMENT '出版时间',
projectsource VARCHAR(30) COMMENT '项目来源',
number VARCHAR(10) NOT NULL COMMENT '期号',
schoolsign VARCHAR(20) NOT NULL COMMENT '学校署名',
ISSNnumber VARCHAR(20) NOT NULL COMMENT 'ISSN号',
cnNumber VARCHAR(10) NOT NULL COMMENT 'CN号',
category VARCHAR(20) NOT NULL COMMENT '刊物类型',
categorysecond VARCHAR(20) NOT NULL COMMENT '刊物类型中的某类/某区',
layout VARCHAR(30) NOT NULl DEFAULT '' COMMENT '版面',
firstproject VARCHAR(30) NOT null COMMENT '学科门类',
score int NOT NULL COMMENT '积分',
authorgrade int COMMENT '作者等级',
academyid int COMMENT '所属学院',
ofauthor int COMMENT '所属作者',
yourfile VARCHAR(200) COMMENT '附件路径(附件下载)',
        -->
<form action="paper/paperRegiter.action" method="post">
			
			<table border="1" cellspacing="1" cellpadding="1">
				
				<tr><td>论文类型</td><td><input type="text" name="papertype" id="" value="" /></td></tr>
				<tr><td>论文题目</td><td><input type="text" name="papertitle" id="" value="" /></td></tr>
				<tr><td>第一作者</td><td><input type="text" name="firstauthor" id="" value="" /></td></tr>
				<tr><td>通讯作者</td><td><input type="text" name="messageauthor" id="" value="" /></td></tr>
				<tr><td>所属单位</td><td><input type="text" name="ofdeptment" id="" value="" /></td></tr>
				<tr><td>出版时间</td><td><input type="text" name="publishdate" id="" value="" /></td></tr>
				<tr><td>项目来源</td><td><input type="text" name="projectsource" id="" value="" /></td></tr>
				<tr><td>期号</td><td><input type="text" name="number" id="" value="" /></td></tr>
				<tr>
					<td>学校署名</td>
					<td>
						<select name="schoolsign">
							<option value="">-----</option>
							<option value="1">铜仁学院第一属名</option>
							<option value="2">铜仁学院第二属名</option>
						</select>
					</td>
				</tr>
				<tr><td>ISSN号</td><td><input type="text" name="ISSNnumber" id="" value="" /></td></tr>
				<tr><td>CN号</td><td><input type="text" name="cnNumber" id="" value="" /></td></tr>
				<tr>
					<td>刊物类型</td>
					<td>
						<select name="category">
							<option value="">-----</option>
							<option value="1">国内期刊</option>
						</select>
					</td>
					<td>
						<select name="categorysecond">
							<option value="">----</option>
							<option value="1">A类</option>
							<option value="2">B类</option>
							<option value="3">C类</option>
							<option value="4">D类</option>
						</select>
					</td>
				</tr>
				<tr><td>版面</td><td><input type="text" name="layout" id="" value="" /></td></tr>
				<tr><td>学科门类</td><td><input type="text" name="firstproject" id="" value="" /></td></tr>
				<tr>
					<td>作者等级</td>
					<td>
						<select name="authorgrade">
							<option value="">-----</option>
							<option value="1">---第一作者--</option>
							<option value="2">---第二作者--</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>附件</td>
					<td><input type="file" name="yourfile" id="" value="" /></td>
				</tr>
				<tr><td><input type="submit" name="submit" id="" value="提交" /></td></tr>
			</table>
			
		</form>
		
		
		<script type="text/javascript">
			
		</script>
	</body>
</html>


