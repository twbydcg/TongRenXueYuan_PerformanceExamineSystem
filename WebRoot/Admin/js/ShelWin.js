/*
    Author:"Trboy"
    Time:2018-10-10
*/
'use strict';

/*
    window.open('1.新窗口的url','2.弹出窗口的名字非必填','3.新窗口的外观参数')
    弹出新窗口的命令及需要的参数；
        height      窗口高度；
        width       窗口宽度；
        top         窗口距离屏幕上方的象素值；
        left        窗口距离屏幕左侧的象素值；
        toolbar=no  是否显示工具栏，yes为显示；
        menubar，scrollbars 表示菜单栏和滚动栏。 1 0取值
        resizable=no 是否允许改变窗口大小，yes为允许；
        location=no 是否显示地址栏，yes为允许；
        status=no   是否显示状态栏内的信息，
        yes为允许；
*/


//js弹窗方法
window.onload = function () {
    function OpenWindow(htmUrl) {
        var url=htmUrl;
        var winName="信息详细页面";
        //screen.availWidth 整个浏览器宽度
        //窗口宽度,需要设置
        var awidth= Math.floor(screen.availWidth/1.4);
        //窗口高度,需要设置
        var aheight= Math.floor(screen.availHeight/1.5);
        //窗口顶部位置
        var atop=(screen.availHeight - aheight)/2+20;
        //窗口宽度位置
        var aleft=(screen.availWidth - awidth)/2+20;
        //新窗口的参数scrollbars=0,status=0,menubar=0,resizable=no,location=0
        var param0="scrollbars=1,status=no," +
            "toolbar=no,menubar=no,resizable=no,location=no";
        var params="top=" + atop + ",left=" + aleft + ",width=" + awidth + ",height=" + aheight + "," + param0 ;
        win = window.open(url,winName,params); //打开新窗口
        //新窗口获得焦点
        win.focus();
    }
};

