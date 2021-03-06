<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="cn.trxy.bean.*"  %>
<%@ page import="cn.trxy.dao.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <meta charset="UTF-8">
    <meta name="Generator" content="">
    <meta name="Author" content="TRboy">
    <meta name="Keywords" content="">
    <meta name="Description" content="">
    <link rel="shortcut icon" type="image/x-icon" href=""/>
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/Common.css"/>
    <link rel="stylesheet" type="text/css" href="css/Index.css"/>
    <link rel="stylesheet" type="text/css" href="css/Home.css"/>
    <link rel="stylesheet" type="text/css" href="css/iconfont.css"/>
    <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="js/Nav.js"></script>
</head>
<body>
<!--开始头部-->
<header>
    <!--开始系统logo-->
    <div class="logo fl"></div>
    <!--结束系统logo-->
    <!--开始用户身份退出-->
    <ul class="root_nav fr">
        <li class="home fl">
            <a href="#">
                <i class="iconfont icon-xing"></i>
                <span>首页</span>
            </a>
        </li>
        <li class="user fl">
            <a href="#">
                <i class="iconfont icon-zhanghuguanli"></i>
                <span>审核人员</span>
            </a>
        </li>
        <li class="exit fl">
            <a href="#">
                <i class="iconfont icon-zhuxiaoguanji"></i>
                <span>退出</span>
            </a>
        </li>
    </ul>
    <!--结束用户身份退出-->
</header>
<!--结束头部-->

<!--开始侧边导航栏(有个jq或者js要计算哈)-->
<aside class="fl">
    <ul class="menu">
        <li class="index">
            <a href="index.html">
                <i class="iconfont icon-xing"></i>
                <span>起始页面</span>
            </a>
            <a class="hiddle_nav" title="收起">
                <i class="iconfont icon-shouqi"></i>
            </a>
        </li>
        <!--开始科研所有内容-->
        <li class="scientific">
            <a href="javascript:void(0)" class="first_nav title_big" >
                <i class="iconfont icon-keyanguanli"></i>
                <span>科研成果</span>
                <i class="iconfont icon-xiala-tianchong-copy init iconRotate" title="打开"></i>
                <div class="line"></div>
            </a>
            <ul class="first_Drop aside_nav1">
                <!--开始下拉菜单科研论文-->
                <li class="sc_type" >
                    <i class="iconfont icon-1"></i>
                    <a href="ScientificPapers.jsp" class="title_mid">学术论文</a>
                </li>
                <!--结束下拉菜单科研论文-->

                <!--开始下拉菜单科研项目-->
                <li class="sc_type">
                    <i class="iconfont icon-2"></i>
                    <a href="ScientificProject.html" class="title_mid">科研项目</a>
                </li>
                <!--结束下拉菜单科研项目-->

                <!--开始下拉菜单平台详情(科研平台)-->
                <li class="sc_type" >
                    <i class="iconfont icon-3"></i>
                    <a href="ScientificTerrace.html" class="title_mid">科研平台</a>
                </li>
                <!--结束下拉菜单教改项目-->

                <!--开始下拉菜单纵向项目-->
                <li class="sc_type" >
                    <i class="iconfont icon-4"></i>
                    <a href="ScientificEndwise.html" class="title_mid">纵向项目</a>
                </li>
                <!--结束下拉菜单纵向项目-->

                <!--开始下拉菜著作成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-5"></i>
                    <a href="ScientificWork.html" class="title_mid">著作成果</a>
                </li>
                <!--结束下拉菜著作成果-->

                <!--开始下拉菜专利成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-61"></i>
                    <a href="ScientificPatent.html" class="title_mid">专利成果</a>
                </li>
                <!--结束下拉菜专利成果-->

                <!--开始网络文章成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-7"></i>
                    <a href="ScientificNetwork.html" class="title_mid">网络文章成果</a>
                </li>
                <!--结束网络文章成果-->

                <!--开始下拉菜单文体艺术成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-8"></i>
                    <a href="ScientificStyArt.html" class="title_mid">文体艺术成果</a>
                </li>
                <!--结束下拉菜单文体艺术成果-->

                <!--开始下拉菜科研成果奖-->
                <li class="sc_type" >
                    <i class="iconfont icon-9"></i>
                    <a href="ScientificPrize.html" class="title_mid">科研成果奖</a>
                </li>
                <!--结束下拉菜科研成果奖-->
            </ul>
        </li>
        <!--结束科研所有内容-->

        <!--开始教学成果-->
        <li class="scientific">
            <a href="javascript:void(0)" class="first_nav title_big">
                <i class="iconfont icon-jiaoxueguanli-copy"></i>
                <span>教学成果</span>
                <i class="iconfont icon-xiala-tianchong-copy"></i>
                <div class="line"></div>
            </a>
            <ul class="first_Drop aside_nav1">
                <!--开始下拉菜单教改论文-->
                <li class="sc_type" >
                    <i class="iconfont icon-1"></i>
                    <a href="EducationalPapers.html" class="title_mid">教改论文</a>
                </li>
                <!--结束下拉菜单教改论文-->

                <!--开始下拉菜单教改项目-->
                <li class="sc_type">
                    <i class="iconfont icon-2"></i>
                    <a href="EducationalProject.html" class="title_mid">教改项目</a>
                </li>
                <!--结束下拉菜单教改项目-->

                <!--开始下拉菜单教改平台-->
                <li class="sc_type" >
                    <i class="iconfont icon-3"></i>
                    <a href="EducationalTerrace.html" class="title_mid">教改平台</a>
                </li>
                <!--结束下拉菜单教改平台-->

                <!--开始下拉菜单纵向项目-->
                <li class="sc_type" >
                    <i class="iconfont icon-4"></i>
                    <a href="EducationalEndwise.html" class="title_mid">纵向项目</a>
                </li>
                <!--结束下拉菜单纵向项目-->

                <!--开始下拉菜著作成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-5"></i>
                    <a href="EducationalWork.html" class="title_mid">著作成果</a>
                </li>
                <!--结束下拉菜著作成果-->

                <!--开始下拉菜专利成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-61"></i>
                    <a href="EducationalPatent.html" class="title_mid">专利成果</a>
                </li>
                <!--结束下拉菜专利成果-->

                <!--开始网络文章成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-7"></i>
                    <a href="EducationalNetwork.html" class="title_mid">网络文章成果</a>
                </li>
                <!--结束网络文章成果-->

                <!--开始下拉菜单文体艺术成果-->
                <li class="sc_type" >
                    <i class="iconfont icon-8"></i>
                    <a href="EducationalStyArt.html" class="title_mid">文体艺术成果</a>
                </li>
                <!--结束下拉菜单文体艺术成果-->

                <!--开始下拉菜科教改果奖-->
                <li class="sc_type" >
                    <i class="iconfont icon-9"></i>
                    <a href="EducationalPrize.html" class="title_mid">教改成果奖</a>
                </li>
                <!--结束下拉菜科教改果奖-->
            </ul>
        </li>
        <!--结束教学成果-->

        <!--开始社会服务成果--->
        <li class="scientific">
            <a href="javascript:void(0)" class="first_nav title_big">
                <i class="iconfont icon-shehuituanti"></i>
                <span>社会服务成果</span>
                <i class="iconfont icon-xiala-tianchong-copy"></i>
                <div class="line"></div>
            </a>

            <ul class="first_Drop aside_nav1">
                <!--开始横向项目-->
                <li class="sc_type" >
                    <i class="iconfont icon-1"></i>
                    <a href="SocietyCrossrange.html" class="title_mid">横向项目</a>
                </li>
                <!--结束横向项目-->

                <!--开始入驻企业-->
                <li class="sc_type" >
                    <i class="iconfont icon-2"></i>
                    <a href="Societyenterprise.html" class="title_mid">入驻企业</a>
                </li>
                <!--结束入驻企业-->
            </ul>
        </li>
        <!--结束社会服务成果--->

        <!--开始学科建设成果-->
        <li class="scientific">
            <a href="javascript:void(0)" class="first_nav title_big">
                <i class="iconfont icon-kemu"></i>
                <span>学科建设成果</span>
                <i class="iconfont icon-xiala-tianchong-copy"></i>
                <div class="line"></div>
            </a>
            <ul class="first_Drop aside_nav1">
                <li class="sc_type" >
                    <i class="iconfont icon-1"></i>
                    <a href="SubjectMeeting.html" class="title_mid">参加会议</a>
                </li>
                <li class="sc_type" >
                    <i class="iconfont icon-2"></i>
                    <a href="SubjectLectures.html" class="title_mid">学术讲座</a>
                </li>
            </ul>
        </li>
        <!--结束学科建设成果-->
        <!--开始行政管理业绩-->
        <li class="scientific">
            <a href="javascript:void(0)" class="first_nav title_big">
                <i class="iconfont icon-hangzhengguanli"></i>
                <span>行政管理业绩</span>
                <i class="iconfont icon-xiala-tianchong-copy"></i>
                <div class="line"></div>
            </a>
            <ul class="first_Drop aside_nav1">
                <li class="sc_type" >
                    <i class="iconfont icon-1"></i>
                    <a href="Administration_01.html" class="title_mid">特殊审核</a>
                </li>
                <li class="sc_type" >
                    <i class="iconfont icon-2"></i>
                    <a href="Administration_01.html" class="title_mid">特殊审核</a>
                </li>
            </ul>
        </li>
        <!--结束行政管理业绩-->

        <!--开始其他-->
        <li class="scientific">
            <a href="javascript:void(0)" class="title_big">
                <i class="iconfont icon-more"></i>
                <span>其他</span>
                <i class="iconfont icon-xiala-tianchong-copy"></i>
                <div class="line"></div>
            </a>
        </li>
        <!--结束其他-->

    </ul>
</aside>
<!--结束侧边导航栏-->

<!--开始起始页面-->
<div class="content_rt fl">
    <div class="r_position">
        <i class="iconfont icon-luru"></i>
        <span>系统工能介绍</span>
    </div>
    <!--开始系统提示信息-->
    <div class="r_message">
        <div class="m_list m_1">
            <i></i>
            <div class="l_info">
                <span>100</span>
                <p>修改申请数</p>
            </div>
        </div>
        <div class="m_list m_2">
            <i></i>
            <div class="l_info">
                <span>400</span>
                <p>需要审核人数</p>
            </div>
        </div>
        <div class="m_list m_3">
            <i></i>
            <div class="l_info">
                <span>1500</span>
                <p>所用用户数</p>
            </div>
        </div>
        <div class="m_list m_4">
            <i></i>
            <div class="l_info">
                <span>100</span>
                <p>当前在线人数</p>
            </div>
        </div>
        <div class="m_list m_5">
            <i></i>
            <div class="l_info">
                <span>1005</span>
                <p>今日访问量</p>
            </div>
        </div>
    </div>
    <!--结束系统提示信息-->
    <div class="clearfix"></div>
    <!--开始用户须知-->
    <div class="message_info">
        <span>注意事项:</span>
        <p>1、不能随便攻击网站</p>
        <p>2、不能盗取别人密码</p>
        <p>3、如果出现bug请联系</p>
        <p>4、如果出现问题请联系</p>
    </div>
    <!--结束用户须知-->
</div>
<!--结束起始页面-->
</body>
</html>