//猫腻图
var ni = {
					maoliang: 0,
					mao_public: function(index) {
						$(".nav-lunbo-zhong-long").animate({
							left: -800 * index
						}, 500);
						if (index > $("#zhong-button>li").length - 1) {
							$("#zhong-button>li").css("background-color", "#c8c8c8")
							$("#zhong-button>li").eq(0).css("background-color", "#487A6F")
						} else {
							$("#zhong-button>li").css("background-color", "#c8c8c8")
							$("#zhong-button>li").eq(index).css("background-color", "#487A6F")
						}
					},
					maojiaright: function() {
						ni.maoliang++;
						if (ni.maoliang > 4) {
							$(".nav-lunbo-zhong-long").css("left", "0");
							ni.maoliang = 1;
						}
						ni.mao_public(ni.maoliang);
						setTimeout(function() {
							$("#zhong-right").bind("click", ni.maojiaright);
						}, 500)
						$("#zhong-right").unbind("click");
					},
					maojialeft: function() {
						ni.maoliang--;
						if (ni.maoliang < 0) {
							ni.maoliang = 3;
							$(".nav-lunbo-zhong-long").css("left", "-3200px")
						}
						ni.mao_public(ni.maoliang);
						setTimeout(function() {
							$("#zhong-left").bind("click", ni.maojialeft);
						}, 500)
						$("#zhong-left").unbind("click");
					},
					maoxuan: function() {
						ni.maoliang = $(this).index();
						ni.mao_public(ni.maoliang);
						setTimeout(function() {
							$("#zhong-button>li").bind("mouseover", ni.maoxuan);
						}, 300)
						$("#zhong-button>li").unbind("mouseover");
					}

				}
				$("#zhong-button>li").bind("mouseover", ni.maoxuan);
				$("#zhong-right").bind("click", ni.maojiaright);
				$("#zhong-left").bind("click", ni.maojialeft);







				var nia = {
					maoliang: 0,
					mao_public: function(index) {
						$(".nav-lunbo-right-lunbo-ul").animate({
							left: -240 * index
						}, 500);
						if (index > $("#right-button>li").length - 1) {
							$("#right-button>li").css("background-color", "#c8c8c8")
							$("#right-button>li").eq(0).css("background-color", "#487A6F")
						} else {
							$("#right-button>li").css("background-color", "#c8c8c8")
							$("#right-button>li").eq(index).css("background-color", "#487A6F")
						}
					},
					maojiaright: function() {
						nia.maoliang++;
						if (nia.maoliang > 5) {
							$(".nav-lunbo-right-lunbo-ul").css("left", "0");
							nia.maoliang = 1;
						}
						nia.mao_public(nia.maoliang);
						setTimeout(function() {
							$("#right-right").bind("click", nia.maojiaright);
						}, 500)
						$("#right-right").unbind("click");
					},
					maojialeft: function() {
						nia.maoliang--;
						if (nia.maoliang < 0) {
							nia.maoliang = 4;
							$(".nav-lunbo-right-lunbo-ul").css("left", "-1200px")
						}
						nia.mao_public(nia.maoliang);
						setTimeout(function() {
							$("#right-left").bind("click", nia.maojialeft);
						}, 500)
						$("#right-left").unbind("click");
					},
					maoxuan: function() {
						nia.maoliang = $(this).index();
						nia.mao_public(nia.maoliang);
						setTimeout(function() {
							$("#right-button>li").bind("mouseover", nia.maoxuan);
						}, 300)
						$("#right-button>li").unbind("mouseover");
					}

				}
				$("#right-button>li").bind("mouseover", nia.maoxuan);
				$("#right-right").bind("click", nia.maojiaright);
				$("#right-left").bind("click", nia.maojialeft);


					var nib = {
						maoliang: 0,
						mao_public: function(index) {
							$(".nav-duzhe-left-bottom-bottom-ul").animate({
								left: -1000 * index
							}, 500);
							if (index > $("#duzhe-ul>li").length - 1) {
								$("#duzhe-ul>li").css("background-color", "#c8c8c8")
								$("#duzhe-ul>li").eq(0).css("background-color", "#487A6F")
							} else {
								$("#duzhe-ul>li").css("background-color", "#c8c8c8")
								$("#duzhe-ul>li").eq(index).css("background-color", "#487A6F")
							}
						},
						maojiaright: function() {
							nib.maoliang++;
							if (nib.maoliang > 3) {
								$(".nav-duzhe-left-bottom-bottom-ul").css("left", "0");
								nib.maoliang = 1;
							}
							nib.mao_public(nib.maoliang);
							setTimeout(function() {
								$("#duzhe-button-right").bind("click", nib.maojiaright);
							}, 500)
							$("#duzhe-button-right  ").unbind("click");
						},
						maojialeft: function() {
							nib.maoliang--;
							if (nib.maoliang < 0) {
								nib.maoliang = 2;
								$(".nav-duzhe-left-bottom-bottom-ul").css("left", "-3000px")
							}
							nib.mao_public(nib.maoliang);
							setTimeout(function() {
								$("#duzhe-button-left").bind("click", nib.maojialeft);
							}, 500)
							$("#duzhe-button-left").unbind("click");
						},
						maoxuan: function() {
							nib.maoliang = $(this).index();
							nib.mao_public(nib.maoliang);
							setTimeout(function() {
								$("#duzhe-ul>li").bind("mouseover", nib.maoxuan);
							}, 300)
							$("#duzhe-ul>li").unbind("mouseover");
						}
					
					}
					$("#duzhe-ul>li").bind("mouseover", nib.maoxuan);
					$("#duzhe-button-right").bind("click", nib.maojiaright);
					$("#duzhe-button-left").bind("click", nib.maojialeft);
					
					//轮播图片1
					var lun1index = 0;
					var ding1;
					lun1();
					
					function lun1() {
						ding1 = setInterval(function() {
							if (lun1index == 8) {
								lun1index = 0;
								lun1_public(lun1index);
							} else {
								lun1index++;
								lun1_public(lun1index);
							}
						}, 4000);
					}
					$(".nav-lunbo-zhong-ulb>li").hover(function() {
						clearInterval(ding1);
						lun1index = $(this).index();
						lun1_public(lun1index);
						lun1();
					}, function() {})
					
					function lun1_public(index) {
						$(".nav-lunbo-zhong-ula>li").css("z-index", "0");
						$(".nav-lunbo-zhong-ula>li").eq(index).css("z-index", "1");
						$(".nav-lunbo-zhong-ulb>li>a").css({
							"background-color": "#fff",
							"color": "#000"
						});
						$(".nav-lunbo-zhong-ulb>li>a").eq(index).css({
							"background-color": "#FF2832",
							"color": "#fff"
						});
					}
					