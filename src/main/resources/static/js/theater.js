
var area = '';
//var area = null 与var area = '' 不同
//null是对象类型，表示空对象，alert(typeof(null)); 会输出object
//" "是一个空格的字符串，     alert(typeof(" "));会输出string
var brand = '';

function app_download_in() {
    document.getElementById('download-icon').style.display='inline-block';
    document.getElementById('app-download').style.borderLeft="1 px solid transparent";
    document.getElementById('app-download').style.borderRight="1 px solid transparent";
}
function app_download_out() {
    document.getElementById('download-icon').style.display='none';
}
function dateClick(e){
    var dom = document.querySelectorAll('.tags li');
    for(var i=0;i<7;i++){
        dom[i].className = " ";
    }
    console.log(dom);
    document.getElementById(e).className="active";
}
function theaterClick(e){
    var dom = document.querySelectorAll(".theater li");
    for(var i = 0;i<dom.length;i++){
        dom[i].className = "";
    }
    document.getElementById(e.name).className="active";
    console.log(e.text);
    brand = e.text;
    sendAjax();

}
function areaClick(e){
    var dom = document.querySelectorAll(".area li");
    for(var i = 0;i<dom.length;i++){
        dom[i].className = "";
    }
    document.getElementById(e.name).className="active";
    console.log(e.text);
    area = e.text;
    sendAjax();
}
function setTheaterEmpty() {
    var dom = document.querySelectorAll(".theater li");
    for(var i = 0;i<dom.length;i++){
        dom[i].className = "";
    }
    document.getElementById("theaterAll").className="active";
    brand = "";
    sendAjax();
}
function setAreaEmpty() {
    var dom = document.querySelectorAll(".area li");
    for(var i = 0;i<dom.length;i++){
        dom[i].className = "";
    }
    document.getElementById("areaAll").className="active";
    area = "";
    sendAjax();
}

function sendAjax(){
    $.ajax({
        url:'/film/getTheater',
        method:'post',
        data:'area='+area+'&brand='+brand,
        success:function (data) {
            console.log("ajax successfully return");
            console.log(data.toString());
            if(null!=data&&""!=data){
                document.getElementById("container-cinema-cell").innerHTML = " ";
                for(var i = 0;i<data.length;i++){
                    //eval函数用于将Json对象解析成字符串
                    var arr = eval(data[i]);
                    // console.log("返回的list:"+data.toString());

                    document.getElementById("container-cinema-cell").innerHTML +="<div class=\"cinema-cell\">\n" +
                        "                    <div class=\"cinema-info\">\n" +
                        "                        <a href=\"javascript:void(0);\" class=\"cinema-name\">"+arr.theaterName+"</a>\n" +
                        "                        <p class=\"cinema-address\">地址："+arr.theaterSpecficLocation+"</p>\n" +
                        "                    </div>\n" +
                        "                    <div class=\"buy-btn\">\n" +
                        "                        <a href=\"#\">选座购票</a>\n" +
                        "                    </div>\n" +
                        "                    <div class=\"price\">\n" +
                        "                        <span class=\"rmb red\">￥</span>\n" +
                        "                        <span class=\"price-num red\">\n" +
                        "                        <span class=\"broadway\">31.4</span>\n" +
                        "                    </span>\n" +
                        "                        <span>起</span>\n" +
                        "                    </div>\n" +
                        "                </div>";
                }
            }else{
                //添加无元素
                console.log("false")
                document.getElementById("container-cinema-cell").innerHTML = " ";
                document.getElementById("container-cinema-cell").innerHTML = "<div class=\"no-cinemas\">抱歉，没有找到相关结果，请尝试用其他条件筛选。</div>"
            }

        },
        error:function () {
            console.log("ajax fail");
        }

    })
}
function getNextDate(year,month,day) {
    if(day==31){
        month+=1;
        day=1;
        console.log("A")
    }else if(day==30){
        if(month==4||month==6||month==9||month==11){
            month+=1;
            day=1;
            console.log("B")
        }else {
            day+=1;
        }
    }else if(month==2&&year%4==0&&year%100!==0&&day==29){
        //是闰年
        month+=1;
        day=1;
        console.log("C")
    }else if(month==2&&day==28){
        //不是闰年
        month+=1;
        day=1;
        console.log("D")
    }else{
        day+=1;
    }
    return  date = {'day':day,'month':month};
}
function getDate(){
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth()+1;
    var day = date.getDate();
    console.log(year+"-"+month+"-"+day);
    document.getElementById("dates").innerHTML+=" <li class=\"active\" id="+month+"-"+day+"><a href=\"javascript:void(0);\" name="+month+"-"+day+" onclick='dateClick(this.name)'>今天"+month+"月"+day+"号</a></li>"

    for (var i=0;i<6;i++){
        var date2 = getNextDate(year,month,day);
        month = date2['month'];
        console.log(month);
        day = date2['day'];
        console.log(day);
        console.log(date2['month']+"-"+date2['day']);
        document.getElementById('dates').innerHTML+="<li id="+date2['month']+"-"+date2['day']+"><a href=\"javascript:void(0);\" name="+date2['month']+"-"+date2['day']+" onclick='dateClick(this.name)'>"+date2['month']+"-"+date2['day']+"</a></li>"
    }
}

sendAjax();
getDate();

