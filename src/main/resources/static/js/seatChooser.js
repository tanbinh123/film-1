//以下方法用于获得地址栏参数
//http://www.runoob.com/index.php?id=1&image=awesome.jpg
// 调用 getQueryVariable("id") 返回 1
// 调用 getQueryVariable("image") 返回 "awesome.jpg"
function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){return pair[1];}
    }
    return(false);
}
console.log('getQueryVariable(hallId):'+getQueryVariable('hallId'));
var hallId = getQueryVariable('hallId');
var scheduleId = getQueryVariable('scheduleId');
var domRow = document.querySelectorAll('.seats-wrapper .row');
//遍历行数/添加座位
for(var i = 0;i<domRow.length;i++){
    var rowIndex = domRow[i].id.substring(0,domRow[i].id.indexOf('-'));
    console.log('rowIndex:'+rowIndex);
    console.log("domRow[i].id:"+domRow[i].id);
    var divRowId = domRow[i].id
    $.ajax({
        url:'/film/get_row_seat',
        data:'theater=1&hallId='+hallId+'&row='+rowIndex,
        dataType:'json',
        async:false,
        success: function (data) {
            console.log("ajax succeed!");
            for(var i = 0;i<data.length;i++ ){
                var arr = eval(data[i]);
                if (arr.seatExist==1){
                    document.getElementById(divRowId).innerHTML +='<span class="seat selectable" onclick="selectSeat(this)" id="'+arr.seatId+'" data-row="'+arr.seatRow+'" data-col="'+arr.seatCol+'""></span>'
                }else{
                    document.getElementById(divRowId).innerHTML +='<span class="no-seat"  id="'+arr.seatId+'"></span>'
                }

            }
        },
        error: function(){
            console.log("ajax fail!");
        }
    })
}
//在这里查询出那些座位已经被选了/样式设置为sold
$.ajax({
    url:'/film/find_selected_seat',
    method:'post',
    data:'scheduleId='+scheduleId,
    dataType:'json',
    success:function (data) {
        if (null!=data){
            //空值处理
            for(var i = 0;i<data.length;i++){
                var arr = eval(data[i]);
                var seatId = arr.seatId;
                document.getElementById(seatId).className = 'seat sold';
                //接触onclick事件绑定
                document.getElementById(seatId).onclick = function () {};
                console.log('seat selected data:'+data[i]);
            }
        }
        console.log('添加已售座位成功!');
    },
    error:function () {
        console.log('selected ajax fail');
    }
})

function selectSeat(e) {

    //在进行所有操作之前先判定一下点击对象的className是不是 seat sold

    //通过node元素.getAttribute('data-*')的方式获取到data-*里的内容
    console.log(e.getAttribute('data-row'));
    console.log(e.getAttribute('data-col'));
    var eRow = e.getAttribute('data-row');
    var eCol = e.getAttribute('data-col');
    if (e.className=='seat selectable'){

        e.className = 'seat selected';
        var domSelectedNum = document.querySelectorAll('.seats-wrapper .row .selected');
        console.log('domSelectedNum',domSelectedNum.length);
        //点击之后将ticket-info下的子元素改变类名
        document.getElementById('no-ticket').style.display = 'none';
        document.getElementById('has-ticket').style.display = 'block';
        if(domSelectedNum.length<5){
            document.getElementById('ticket-container').innerHTML +='<span class="ticket" data-row="'+eRow+'" data-col="'+eCol+'" id="'+eRow+'-'+eCol+'">'+eRow+'排'+eCol+'座</span>';
        }
        //如果domSelectedNum=5就不行要跳出提示
        if(domSelectedNum.length==5){
            document.getElementById('tips').textContent = '一次最多只能购买四张票';
            document.getElementById('warning').style.display = 'block';
            e.className = 'seat selectable';
        }
    }else{
        e.className = 'seat selectable';
        var domSelectedNum = document.querySelectorAll('.seats-wrapper .row .selected');
        console.log('domSelectedNum',domSelectedNum.length);
        //要删除的dom元素
        var dom = document.getElementById(eRow+'-'+eCol);
        //原生js要删除某一node元素就必须找到其父元素然后使用removechild('xxx')移除自己
        dom.parentNode.removeChild(dom);
        if(domSelectedNum.length==0){
            document.getElementById('no-ticket').style.display = 'block';
            document.getElementById('has-ticket').style.display = 'none';
        }
    }
    var selected = document.querySelectorAll('.seats-wrapper .row .selected');
    var singlePrice = document.getElementById('single-price').getAttribute('data-price');
    console.log('singlePrice:'+singlePrice);
    var totalPrice = selected.length * singlePrice;
    console.log("totalprice:"+totalPrice);
    //设置总价
    document.getElementById('total-price').textContent = totalPrice;


}
function dismissWarning() {
    document.getElementById('warning').style.display = 'none';
}

function submit() {
    var seatIds = new Array();
    var domSelectedNum = document.querySelectorAll('.seats-wrapper .row .selected');
    if (domSelectedNum.length == 0){
        document.getElementById('tips').textContent = '请先选择座位';
        document.getElementById('warning').style.display = 'block';
    }else{
        for (var i = 0;i<domSelectedNum.length;i++){
            var seatId = domSelectedNum[i].id;
            var seatRow = domSelectedNum[i].getAttribute('data-row');
            var seatCol = domSelectedNum[i].getAttribute('data-col');
            seatIds.push(seatId)
            console.log('-------------------------');
            console.log('座位Id:'+seatId);
            console.log('座位:'+seatRow+'行-'+seatCol+'座');
            console.log('-------------------------');
        }
        console.log('seatIds:'+seatIds.toString());
        //ajax将seatIds传到后台/并跳转
        //ajax传数组data:{seatIds:seatIds
        //ajax传复杂参数时:
        /*
            data:{
                seatIds:seatIds,                    ---seatIds是Integer[]
                scheduleId:scheduleId               ---scheduleId是Integer
            },
         */

        $.ajax({
            url:'/film/order_prepare',
            method:'post',
            dataType:'json',
            data:{
                seatIds:seatIds,
                scheduleId:scheduleId
            },
            async:false,
            traditional: true,
            success:function (data) {
                console.log('ajax success')
                // window.location.reload();
            },
            error:function () {
                console.log("ajax fail");
                // window.location.reload();
            }
        })
    }
}
