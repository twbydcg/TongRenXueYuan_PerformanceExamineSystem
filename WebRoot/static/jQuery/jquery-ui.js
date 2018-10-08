
//将输入的颜色字符串转换成十进制数组
function getData(color) {
  var re = RegExp;
  if (/^#([0-9a-f]{2})([0-9a-f]{2})([0-9a-f]{2})$/i.test(color)) {
    //#rrggbb
    return [parseInt(re.$1,16),parseInt(re.$2,16),parseInt(re.$3,16)];
  } else if (/^#([0-9a-f])([0-9a-f])([0-9a-f])$/i.test(color)) {
    //#rgb
    return [parseInt(re.$1+re.$1,16),parseInt(re.$2+re.$2,16),parseInt(re.$3+re.$3,16)];
  } else if (/^rgb(.*),(.*),(.*)$/i.test(color)) {
    //rgb(n,n,n) or rgb(n%,n%,n%)
    if(re.$1.indexOf("%")>-1){
      return [parseInt(parseFloat(re.$1, 10) * 2.55),
          parseInt(parseFloat(re.$2, 10) * 2.55),
          parseInt(parseFloat(re.$3, 10) * 2.55)];
    }else{
       return [parseInt(re.$1),parseInt(re.$2),parseInt(re.$3)];
    }
  }
}

(function($){$.fn.shade = function(prop,color1,color2,mills){
	var count = mills/200;
	var data1 = getData(color1);
	var data2 = getData(color2);
	var red = data1[0],green = data1[1],blue = data1[2];
	var r = (data2[0]-data1[0])/count,g = (data2[1]-data1[1])/count,b = (data2[2]-data1[2])/count;
	obj_temp = $(this);
	for(var i=1;i<count+1;i++){
		setTimeout("$(obj_temp).css('"+prop+"','rgb("+parseInt(red+r*i+0.5)+","+
				parseInt(green+g*i+0.5)+","+parseInt(blue+b*i+0.5)+")');", i*200);
	}
}})(jQuery);