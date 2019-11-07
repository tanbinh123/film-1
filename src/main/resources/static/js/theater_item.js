
//设置第一次进入页面选中目标
var dom1 = document.getElementById('movie-list').firstElementChild;
// console.log(dom1);
dom1.className = "movie active";
document.getElementById('show-list-container').firstElementChild.className = 'show-list active';
//用于更改日期
function changeDate(e) {
    var domDate = document.querySelectorAll('.dateContainer span');
    // var domList = document.querySelectorAll('.p-container div')
    for(var i = 0;i<domDate.length;i++){
        domDate[i].className = "date-item";
        // domList[i].className = "plist-container";
    }
    var movieId = e.id.substr(e.id.length-1,1);
    // console.log(movieId);
    // var pContainerId = 'p-container'+movieId;
    // var selectCondition = "."+pContainerId+" div";
    // console.log('selectCondition:'+selectCondition)
    var domPList = document.querySelectorAll('.p-container div');
    for(var i = 0;i <domPList.length;i++){
        domPList[i].className = 'plist-container';
    }
        document.getElementById(e.id).className = "date-item active";
    var plistContainerId = e.id+'_plist-container'
    console .log("plistContainerId:"+plistContainerId);
    document.getElementById(plistContainerId).className = 'plist-container active'
    //获取就是最后一个字符

    //plist-container也需要通过这个方法来改变display属性....暂时还没写..

}
function changeMovieActive(e) {

    //每次点击清空所有date-item样式
    var domDateContainer = document.querySelectorAll('.dateContainer span')
    for(var i = 0;i<domDateContainer.length;i++){
        domDateContainer[i].className = 'date-item';
    }


    var dom = document.querySelectorAll('.movie-list-container .movie-list div');
    for(var i = 0;i<dom.length;i++){
        console.log(dom[i]);
        dom[i].className = "movie";
    }

    var domshowList = document.querySelectorAll('.show-list-container .show-list');
    for(var i = 0;i<domshowList.length;i++){
        domshowList[i].className = 'show-list';
    }
    e.className = "movie active";
    var scheduleHeadId = 'movie'+e.id.substring(0,e.id.indexOf('-'));
    document.getElementById(scheduleHeadId).className = 'show-list active';

    console.log("处理之后的Id:"+scheduleHeadId);
    console.log("e.id= "+e.id);
    console.log("e.class= "+e.className);
    // var splicingDomId = 'dateContainerId'+e.id.substring(0,e.id.indexOf('-'));
    var defaultDomDate = document.getElementById('dateContainerId'+e.id.substring(0,e.id.indexOf('-')));
    // console.log("splicingDomId: "+splicingDomId);
    console.log("defaultDomDate: "+defaultDomDate.id);
    //每次点击imgList默认使第一个时间激活(选中)
    defaultDomDate.firstElementChild.className = 'date-item active'
    //点击电影图像后要默认把该电影第一个日期的plist显示出来
    var domPList = document.querySelectorAll('.p-container div');
    for(var i = 0;i <domPList.length;i++){
        domPList[i].className = 'plist-container';
    }
    var pContainerId = 'p-container'+e.id.substring(0,e.id.indexOf('-'));
    console.log("pContainerId"+pContainerId);
    document.getElementById(pContainerId).firstElementChild.className ='plist-container active';
}
function showSchedule() {
    var domId = document.querySelectorAll('.schedule_id_table td');
    console.log(domId);
    for(var i = 0;i<domId.length;i++){
        console.log(domId[i].id);
        var id = 'dateContainerId'+domId[i].id
        $.ajax({
            url:'/film/theater_get_scheduleDate',
            data:"movieId="+domId[i].id,
            method:'post',
            dataType:'json',
            async:false,
            success:function (data) {
                console.log("ajax successed!");
                var year;
                var month;
                var day;
                for(var j = 0;j<data.length;j++){
                    var convertDate = new Date(data[j]);
                    year = convertDate.getFullYear();
                    month = convertDate.getMonth()+1;
                    day = convertDate.getDate();
                    var date = year+"-"+month+"-"+day;
                    console.log("date: "+date);
                    console.log("id:"+id);
                    var tId = date+'_'+domId[i].id+'_tbody';
                    console.log("tbody的id:"+tId);
                    //有多少个日期就在电影对于的p-container下添加多少个plist-container
                    document.getElementById('dateContainerId'+domId[i].id).innerHTML += '<span class="date-item " id="'+date+'-'+domId[i].id+'" onclick="changeDate(this)">'+month+'月'+day+'</span>';
                    document.getElementById('p-container'+domId[i].id).innerHTML +='    <div class="plist-container" id="'+date+'-'+domId[i].id+'_plist-container'+'">\n' +
                        '        <table class="plist">\n' +
                        '            <thead>\n' +
                        '            <tr>\n' +
                        '                <th>放映时间</th>\n' +
                        '                <th>语言版本</th>\n' +
                        '                <th>放映厅</th>\n' +
                        '                <th>售价（元）</th>\n' +
                        '                <th>选座购票</th>\n' +
                        '            </tr>\n' +
                        '            </thead>\n' +
                        '            <tbody id="'+tId+'">\n' +
                        '            </tbody>\n' +
                        '        </table>\n' +
                        '    </div>'
                    //获取每个日期的排片表
                    //暂时只显示theaeterId为1的影院
                    $.ajax({
                        url:'/film/theater_get_schedule',
                        data:'movieId='+domId[i].id+"&theaterId=1"+"&dateTime="+date,
                        async:false,
                        dataType:'json',
                        success: function (data) {
                            console.log("schedule succeeded!");
                                console.log(data.length);
                            if(null!=data&&""!=data) {
                                var flag = 2
                                var domClass = '';
                                for (var i = 0; i < data.length; i++) {
                                    console.log("datatostring" + data[i].toString());
                                    var arr = eval(data[i]);
                                    console.log("arr:"+arr.toString())
                                    var beginDateTime = new Date(arr.scheduleBeginDateTime);
                                    //电影开始时间(例如:10:00)
                                    var beginTime = beginDateTime.getHours()+":"+beginDateTime.getMinutes();
                                    var EndDateTime = new Date(arr.scheduleEndDateTime);
                                    var endTime = EndDateTime.getHours()+":"+EndDateTime.getMinutes();
                                    if(flag%2==0){
                                        domClass = '';
                                    }else{
                                        domClass = '';
                                    }
                                    document.getElementById(tId).innerHTML +=
                                        '                        <tr class="'+domClass+'">\n' +
                                        '                            <td>\n' +
                                        '                                <span class="begin-time">'+beginTime+'</span>\n' +
                                        '                                <br>\n' +
                                        '                                <span class="end-time">'+endTime+'散场</span>\n' +
                                        '                            </td>\n' +
                                        '                            <td>\n' +
                                        '                                <span class="lang">'+arr.broadcastType+'</span>\n' +
                                        '                            </td>\n' +
                                        '                            <td>\n' +
                                        '                                <span class="hall">'+arr.hallName+'</span>\n' +
                                        '                            </td>\n' +
                                        '                            <td>\n' +
                                        '                                <span class="sell-price">'+arr.schedulePrice+'</span>\n' +
                                        '                            </td>\n' +
                                        '                            <td>\n' +
                                        '                                <a href="/film/seat_chooser?scheduleId='+arr.scheduleId+'" class="buy-btn normal">选座购票</a>\n' +
                                        '                            </td>\n' +
                                        '                        </tr>\n'
                                    flag++;
                                }
                            }
                        },
                        error:function () {
                            console.log("schedule failed!");
                        }
                    })
                }
            },
            error:function () {
                console.log("ajax failed!");
            }
        })

    }
}

showSchedule();
var domId = document.querySelectorAll('.schedule_id_table td');
var id = 'p-container'+domId[0].id;
var domPContainer = document.getElementById(id).firstElementChild.className = 'plist-container active';
document.getElementById('dateContainerId'+domId[0].id).firstElementChild.className = 'date-item active';





