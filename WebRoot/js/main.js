
function cheked(a,index) {
    var elemt=$(a);//当前选择的对象
    var elemted=$(".active");//原来选择的对象
    
    $(".active-level3").removeClass("active-level3");
    $(".meun-level3").hide();
    elemted.removeClass("active");

    elemted.next("ul").hide();



    elemt.addClass("active");
    elemt.next("ul").show();


    var iframe=$("#myrame");
    switch (index) {
        case 1:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/ranking.html");break;
        case 2:break;
        case 3:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;
        case 4:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;
        case 5:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;
        case 6:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;
        case 7:break;
        case 8:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;
        case 9:$(".active-sub").removeClass("active-sub");iframe.attr("src","page/null.html");break;

    }
}

function subcheked(a,subIndex) {
    var elemt=$(a);//当前选择的对象
    var elemted=$(".active-sub");//原来选择的对象

    elemted.removeClass("active-sub");
    elemted.next("ul").hide();

    elemt.addClass("active-sub");
    elemt.next("ul").show();

    var iframe=$("#myrame");
    switch (subIndex) {
        case 1:iframe.attr("src","page/scientificPayoffs.jsp");break;
        case 2:iframe.attr("src","page/null.html");break;
        case 3:iframe.attr("src","page/null.html");break;
        case 4:iframe.attr("src","page/null.html");break;
        case 5:iframe.attr("src","page/null.html");break;
        case 6:iframe.attr("src","page/null.html");break;
        case 7:iframe.attr("src","page/null.html");break;
        case 8:iframe.attr("src","page/null.html");break;
        case 9:iframe.attr("src","page/null.html");break;
        case 10:iframe.attr("src","page/null.html");break;
        case 11:break;
        default:iframe.attr("src","page/null.html");break;
    }

}


function level3cheked(a,level3Index) {
    var elemt=$(a);//当前选择的对象
    var elemted=$(".active-level3");//原来选择的对象

    elemted.removeClass("active-level3");
    elemted.next("ul").hide();

    elemt.addClass("active-level3");
    elemt.next("ul").show();

    var iframe=$("#myrame");
    switch (level3Index) {
        case 1:iframe.attr("src","page/uploading-scientificPayoffs.jsp");break;
        case 2:break;
        case 3:break;
        case 4:break;
        case 5:break;
        case 6:break;
        case 7:break;
        case 8:break;
        case 9:break;
        case 10:break;
        default:break;
    }

}

function togglrMenu(btn) {
    var meun =$(".meun-max");
    var data;
    var btn=$(btn);
    if(meun.length > 0 ){
        meun.removeClass("meun-max");
        meun.addClass("meun-min");
        data = $(".data-min");
        data.removeClass("data-min");
        data.addClass("data-max");
        btn.html("显示菜单栏  <span class='glyphicon glyphicon-chevron-right'></span>");
    }else{
        meun =$(".meun-min");
        meun.removeClass("meun-min");
        meun.addClass("meun-max");
        data = $(".data-max");
        data.removeClass("data-max");
        data.addClass("data-min");
        btn.html("隐藏菜单栏  <span class='glyphicon glyphicon-chevron-left'></span>");
    }


}