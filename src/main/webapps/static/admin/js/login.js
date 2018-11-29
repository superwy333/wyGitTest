layui.use(['form', 'layedit','layer'], function(){
	  var $ = layui.jquery
	  ,form = layui.form
	  ,layer = layui.layer
	  ,layedit = layui.layedit;
	  
	//自定义验证规则
/*	form.verify({
		user: function(value) {
			if(value.length < 6) {
				return '账号必须是6到12位';
			}
		},
		pass: [/(.+){6,12}$/, '密码必须6到12位'],
		verity: [/(.+){6}$/, '验证码必须是6位']
	});   */
	
	//监听提交
	form.on('submit(login)', function(data) {
	$.ajax({
		type:'GET',
		dateType:"json",
        contentType: "text/html;charset=UTF-8",
		/*url: "http://192.168.11.220:8080/zs-main/web/sysUserController.do?login",*/
        url: "http://192.168.11.124:8088/doLogin",
		data: data.field,
        beforeSend: function (XMLHttpRequest) {
            XMLHttpRequest.setRequestHeader("Access-Control-Allow-Origin", "http://localhost:8088");
            XMLHttpRequest.setRequestHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE ,PUT");
            XMLHttpRequest.setRequestHeader("Access-Control-Max-Age", "30");
            XMLHttpRequest.setRequestHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since,Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token,Authorization,deviceId,Access-Control-Allow-Origin,Access-Control-Allow-Headers,Access-Control-Allow-Methods");
            XMLHttpRequest.setRequestHeader("Access-Control-Allow-Credentials", "true");
            XMLHttpRequest.setRequestHeader("XDomainRequestAllowed", "1");
            /*XMLHttpRequest.setRequestHeader("${_csrf.parameterName}", "${_csrf.token}");*/
            //alert(111);
        },
		/*crossDomain: true,
		xhrFields: {
			withCredentials: true
		},*/
		
		success:function(data){
			if(data){
				
				$.cookie('userData', data);
				
			}
			var data = JSON.parse(data);
					layer.msg(data.msg,{
					offset:'15px',
					icon:1,
					time:1000,
					});
					if(data.success)//要加上去空格，防止内容里面有空格引起错误。
				{
					setTimeout(function(){
						location.href='index.html';
					},1000);
				}
		}
	});
	return false;
	});

});
