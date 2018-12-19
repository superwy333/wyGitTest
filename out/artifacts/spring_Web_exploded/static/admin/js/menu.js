layui.use(['jquery'], function() {
    var $ = layui.jquery;
   $.ajax({
        url: "static/admin/datajson/menu.json",
        type:'GET',
        data:"getMenu",
		success:function(data){
            if (data.httpStatus == "OK"){
                var menuStr='';
                $.each(data.result, function(k,v) {
                    menuStr += "<li class=\"layui-nav-item\">";
                    if(v.children){
                        menuStr += "<a    href=\"javascript:;\"><i class=\"iconfontN "+v.icon+"\"></i>"+v.name+"<span class=\"layui-nav-more\"></span></a>";
                        menuStr += "<dl class=\"layui-nav-child\">";
                        $.each(v.children, function(ck,cv) {

                            menuStr += "<dd>";
                            if(cv.children){
                                menuStr += "<a href=\"javascript:;\">"+cv.name+"<span class=\"layui-nav-more\"></span></a>";
                                menuStr += "<dl class=\"layui-nav-child\">";
                                $.each(cv.children, function(sk,sv) {

                                    menuStr += "<dd><a data-url='"+sv.url+"' data-id='"+sv.id+"' data-text='"+sv.name+"'><span class=\"l-line\"></span>"+sv.name+"</a></dd>";

                                });
                                menuStr += "</dl>";
                            }else{
                                menuStr += "<a data-url='"+cv.url+"' data-id='"+cv.id+"' data-text='"+cv.name+"' href=\"javascript:;\">"+cv.name+"</a>";
                            }

                            menuStr += "</dd>";
                        });
                        menuStr += "</dl>";
                    }else{
						menuStr += "<a data-url='"+v.url+"' data-id='"+v.id+"' data-text='"+v.name+"'><i class=\"iconfontN "+v.icon+"\"></i>"+v.name+"</a>";
                    }
                    menuStr += "</li>";
                });

                $(".layui-nav-tree").html(menuStr);
            }
        }
	});
});
