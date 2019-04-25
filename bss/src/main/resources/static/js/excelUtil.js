	//导入Excel
	function importExcel(){
		var uploadEventFile = $("#uploadEventFile")[0].files;

		if (!uploadEventFile || uploadEventFile.length <= 0) {
			layer.msg('请选择上传的文件!', {
				icon : 5
			});
			return;
		}

		var formData = new FormData();
		formData.append('file', uploadEventFile[0]);

		$.ajax({
			url : "/excel/import",
			type : 'POST',
			contentType: false,
			data : formData,
			processData: false,
			dataType: 'formData',
			success : function(data) {
				if (data.code=="001"){
					layer.msg('服务器内部异常!', {
						icon : 5
					});
				}else if (data) {
					layer.msg('导入成功,请刷新页面!', {
						icon : 6
					});
					$("#uploadEventFile")[0].files = [];
				} else {
					layer.msg('导入失败!', {
						icon : 5
					});
				}
			}
		});
		
	}
