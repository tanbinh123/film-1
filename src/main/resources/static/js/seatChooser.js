var domRow = document.querySelectorAll('.seats-wrapper .row');
//遍历行数/添加座位
for(var i = 0;i<domRow.length;i++){
    var rowIndex = domRow[i].id.substring(0,domRow[i].id.indexOf('-'));
    console.log('rowIndex:'+rowIndex);
    console.log("domRow[i].id:"+domRow[i].id);
    var divRowId = domRow[i].id
    $.ajax({
        url:'/film/get_row_seat',
        data:'theater=1&hallId=1&row='+rowIndex,
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

}
function dismissWarning() {
    document.getElementById('warning').style.display = 'none';
}