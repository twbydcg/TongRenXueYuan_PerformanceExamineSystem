 $("#type").change(function() {
        var val = $("#type").val();
        var opt = $("#periodical");
        var label=$("#label");
        if(parseInt(val)<13){
            label.hide();
            opt.hide();
            opt.html("<option value ='-1'  ></option>");
        }else {
            label.show();
            opt.show();

        }
        switch (val) {
            case "13":
                opt.html("<option value ='1'  >A类</option><option value ='2'  >B类</option><option value ='3'  >C类</option><option value ='4'  >D类</option>");
                break;
            case "14":
                opt.html("<option value ='1'  >1区</option><option value ='2'  >2区</option><option value ='3'  >3区</option><option value ='4'  >4区</option><option value ='5'  >5区</option>");
                break;
            case "15":
                opt.html("<option value ='1'  >源刊</option><option value ='2'  >会议收录</option>");
                break;
            case "16":
                opt.html("<option value ='1'  >IF<1</option><option value ='2'  >1<=IF<3</option><option value ='3'  >3<=IF<6</option><option value ='4'  >IF>=6</option>");
                break;
            default:
                break;
        }
    });