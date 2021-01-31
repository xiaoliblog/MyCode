$(function() {

				$(".guanbi").click(function() {
					$(".bottomfixed").css({
						"display": "none"
					})
				})

				$(".menu-one-left-ul>li").hover(function() {
					var index = $(this).index();
					$(".menu-one-left-ul>li>a").eq(index).css({
						"font-size": "15px",
						"border": "2px #ff2832 solid",
						"border-right": "0",
						"width": "180px",
						"background-color": "#fff"
					});
				}, function() {
					var index = $(this).index();
					$(".menu-one-left-ul>li>a").css({
						"font-size": "13px",
						"border": "2px #f9f9f9 solid",
						"border-right": "0",
						"width": "178px",
						"background-color": "#ffffff00"
					});
				})
				$(".menu-one-left").hover(function() {
					$(".menu-one-left-ul").stop(true, true).slideDown(0);
				}, function() {
					$(".menu-one-left-ul").stop(true, true).slideUp(200);
				})
				$(".logo-shopcar>a:nth-child(1)").hover(function() {
					$(".logo-shopcar>a:nth-child(1)>img").attr("src", "img/car1.png");
				}, function() {
					$(".logo-shopcar>a:nth-child(1)>img").attr("src", "img/car.png");
				})
			})