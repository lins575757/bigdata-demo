$(document).ready(function () {
	
	/*针对不同农业领域积累了海量数据资源-划过显示*/
	$(document).ready(function() {
		jQuery.jqtab = function(tabtit,tab_conbox,shijian) {
			$(tab_conbox).find("li").hide();
			$(tabtit).find("li:first").addClass("active").show(); 
			/*$(tab_conbox).find("li:first").show();*/
		
			$(tabtit).find("li").bind(shijian,function(){
			  $(this).addClass("active").siblings("li").removeClass("active"); 
				var activeindex = $(tabtit).find("li").index(this);
				$(tab_conbox).children().eq(activeindex).show().siblings().hide();
				return false;
			});
		
		};
		/*针对不同农业领域积累了海量数据资源-调用*/
		$.jqtab("#tabs","#tab_conbox","click");
		$.jqtab("#tabs","#tab_conbox","mouseenter");	

		/*成熟专业的服务工具-调用*/
		$.jqtab("#tabs2","#tab_conbox2","click");
		$.jqtab("#tabs2","#tab_conbox2","mouseenter");	
		/*网络传输解决方案-调用*/
		$.jqtab(".wlcs_jjfa_tit",".wlcs_jjfa_content","click");
		$.jqtab(".wlcs_jjfa_tit",".wlcs_jjfa_content","mouseenter");			
	});
});
