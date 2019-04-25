$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
			$(function() {
				$('.mySelect').select2();
			})
			
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
		});
		
		function projectInfo_save() {
			layer.msg('正在执行中...', {
				icon : 6
			});
			$.ajax({
				url : "/saveProjectInfo",
				type : 'POST',
				dataType : 'JSON',
				contentType : 'application/json',
				data : JSON.stringify($('#form-article-add').serializeObject()),
				success : function(data) {
					if (data.code == '1') {
						layer.msg('已保存!', {
							icon : 6
						});
					} else if (data.code == '-1') {
						layer.msg(data.message, {
							icon : 5
						});
					} else if (data.code == '001') {
						layer.msg('保存失败! 数据错误!', {
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