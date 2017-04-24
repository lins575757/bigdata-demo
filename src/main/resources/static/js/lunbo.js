$(document).ready(function () {

	/* 解决方案-图片滚动效果 */
	$(window).resize(function() {
	  var W2=$(".slide-container").width()/5;
	  $(".slide-item").css({
	  	"width":W2+"px",
	  	"height":"420px"
	  })
	});
	var W2=$(".slide-container").width()/5;
	$(".slide-item").css({
		"width":W2+"px",
		"height":"420px"
	})
	$(".slide-container").slide({

		titCell: "",

		mainCell: ".slide-body ul",

		autoPage: true,

		effect: "leftLoop",

		autoPlay: true,

		vis: 5

	});
	/*面向行业和公共提供精准数据服务-轮播*/
	$(".sjfw_box").slide({
		titCell: "",
		mainCell: ".sjfw_list1",
		autoPage: true,
		effect: "leftLoop",
		autoPlay: true,
		vis: 3
	});
	/*面向行业和公共提供精准数据服务-划过展开*/
     $(".subGroup").find(".subGroup_box1").mouseover(function(){
     		$(this).addClass("current").siblings().removeClass("current");
     	})
	/* 解决方案-鼠标悬停图片效果 */
	/*$(".mr_zhe_hover").css("top", $('.mr_zhe').eq(0).height());
	$('.mr_zhe').mouseout(function (e) {
		if ((e.pageX < $(this).offset().left || e.pageX > ($(this).offset().left + $(this).width())) || (e.pageY < $(this).offset().top || e.pageY > ($(this).offset().top + $(this).height()))) {

			$(this).find('.mr_zhe_i').show();
			$(this).find('.mr_zhe_hover').hide().stop().animate({ top: '190px' }, { queue: false, duration: 590 });
			return false;
		}
		$(this).find('.mr_zhe_i').show();
			$(this).find('.mr_zhe_hover').hide().stop().animate({ top: '190px' }, { queue: false, duration: 590 });
			return false;
	});
	$('.mr_zhe').mouseover(function (event) {
		$(this).find('.mr_zhe_i').hide();
		$(this).find('.mr_zhe_hover').show().stop().animate({ top: '190px' }, { queue: false, duration: 590 });
		return false;
	});*/

	/* 鼠标悬停图片效果 */
	$(".mr_zhe_hover").css("top", $('.mr_zhe').eq(0).height());
	$("li").mouseout(function (e) {

		if ((e.pageX < $(this).offset().left || e.pageX > ($(this).offset().left + $(this).width())) || (e.pageY < $(this).offset().top || e.pageY > ($(this).offset().top + $(this).height()))) {

			$(this).find('.mr_zhe_i').show();

			$(this).find('.mr_zhe_hover').hide().stop().animate({ top: '375px' }, { queue: false, duration: 190 });

			return false;

		}
	});
	$('.mr_zhe').mouseover(function (event) {

		$(this).find('.mr_zhe_i').hide();

		$(this).find('.mr_zhe_hover').show().stop().animate({ top: '190px' }, { queue: false, duration: 190 });

		return false;
	});
});
