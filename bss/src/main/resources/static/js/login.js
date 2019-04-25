$(function() {
	// 定义serializeObject方法，序列化表单
	$.fn.serializeObject = function() {
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name]) {
				if (!o[this.name].push) {
					o[this.name] = [ o[this.name] ];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
	};
})

function login() {
	
	checkLoginForm();//表单验证
	$.ajax({
		url : "/login",
		type : 'POST',
		dataType : 'JSON',
		contentType : 'application/json',
		data : JSON.stringify($('#form1').serializeObject()),
		success : function(data) {
			if (data.code == '1') {
				$(location).attr('href', '/showIndex');
			} else if (data.code == '-1') {
				layer.msg('账户或密码不正确', {
					icon : 5
				});
			} else if (data.code == '001') {
				layer.msg('服务器内部错误', {
					icon : 5
				});
			}

		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			console.log('XMLHttpRequest:');
			console.log(XMLHttpRequest);
			layer.msg('网络异常！尝试刷新网页解决问题', {
				icon : 5
			});
		}
	});
}

function checkLoginForm(){
	
}

function register() {
	layer
			.open({
				type : 1,
				title : '创建账户',
				skin : 'layui-layer-demo',
				closeBtn : 1, // 不显示关闭按钮
				anim : 2,
				btn : [ '确认创建', '取消' ],
				yes : function(index, layero) {
					$.ajax({
						url : "/register",
						type : 'POST',
						dataType : 'JSON',
						contentType : 'application/json',
						data : JSON.stringify($('#form2').serializeObject()),
						success : function(data) {
							if (data.code == '1') {
								layer.msg('创建成功', {
									icon : 6
								});
								layer.close(index);
							}
							if(data.code == '-1'){
								layer.msg('密码与确认密码不一致', {
									icon : 5
								});
							}
							if(data.code == '-2'){
								layer.msg('请输入完整信息', {
									icon : 5
								});
							}
							if (data.code == '001'){
								layer.msg('服务器内部错误', {
									icon : 5
								});
							}
						},
						error : function(XMLHttpRequest, textStatus,
								errorThrown) {
							console.log('XMLHttpRequest:');
							console.log(XMLHttpRequest);
							layer.msg('网络异常！尝试刷新网页解决问题', {
								icon : 5
							});
						}
					});
				},
				content : '<form action="/register" method="post" id="form2"><input name="xm" placeholder="姓名" required="" type="text" ><input name="username" placeholder="用户名" required="" type="text" ><input name="password" placeholder="密码" required="" type="password"><input name="qrpassword" placeholder="确认密码" required="" type="password"><input name="phone" placeholder="电话(非必填)" required="" type="text" ><input name="email" placeholder="邮箱(非必填)" required="" type="email" ><input name="bz" placeholder="备注（非必填）" required="" type="text"></form>'
			});
}