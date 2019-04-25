function logOut(num) {
	if (num==1) {
		layer.msg('确定切换当前账户？', {
			  time: 0 //不自动关闭
			  ,btn: ['确定', '取消']
			  ,yes: function(index){
				  $(location).attr('href', '/logOut');
			  }
			});
	}else{
		layer.msg('确定退出当前账户？', {
			  time: 0 //不自动关闭
			  ,btn: ['确定', '取消']
			  ,yes: function(index){
				  $(location).attr('href', '/logOut');
			  }
			});
	}
}