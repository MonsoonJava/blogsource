<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>关于我</title>
		<!-- meta -->
		<meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="/yanhomBlog/static/img/yan.jpg" />
	</head>

	<body id="page">
		<jsp:include flush="true" page="header.jsp"></jsp:include>

		<div class="content-body">
			<div class="container">
				<div class="row">
					<main class="col-md-8" id="mainx">
						<h1 class="page-title">About Me</h1>
						<article class="post" style="border-bottom:1px solid #e7e7e7;">
							<div class="entry-content clearfix">
								<figure class="img-responsive-center">
									<img class="img-responsive" src="/yanhomBlog/static/img/me.jpg" alt="Developer Image">
								</figure>
								<div class="line">
									<p> Who am I ?<br/>
									每个人都能写出自己的凡客体：<br/>
									爱编程，爱晚起，偶尔也忙到深夜<br/>
									喜欢学习，努力工作，也享受生活<br/>
									我酷爱技术，崇尚简单的快乐和幸福<br/>
									我不是码农，我是程序员<br/>
									我和你一样，为理想而奋斗</p>
	
	                                <p>
									<span class="title">GitHub:</span><br/>
									<span class="con">https://github.com/yanhom1314</span><br/>
									<span class="title">website:</span><br/>
									<span class="con">http://www.yanhom.cn</span><br/>
									<span class="title">E-mail:</span><br/>
									<span class="con">yanhom1314@foxmail.com</span><br/>
									<span class="title">qq:</span><br/>
									<span class="con">1772140053</p>
					          	</div>
					          	<div class="clear"></div>
								<div class="height-40px"></div>
								<!--  
								<h2 class="title text-center">Social</h2>
								<ul class="social">
									<li class="facebook"><a href="https://github.com/yanhom1314"><span class="ion-social-facebook"></span></a></li>
									<li class="twitter"><a href="#"><span class="ion-social-twitter"></span></a></li>
									<li class="google-plus"><a href="#"><span class="ion-social-googleplus"></span></a></li>
									<li class="tumblr"><a href="#"><span class="ion-social-tumblr"></span></a></li>
								</ul>
								-->
							</div>
						</article>
						<div class="pinglun">     
                         <!-- 评论框 start -->
	                        <div class="ds-thread" data-thread-key="about" data-title="about" data-url="http://yanhom.cn/about"></div>
                                <!-- 评论框 end -->
                                <!-- 公共JS代码 start (一个网页只需插入一次) -->
                                <script type="text/javascript">
                                       var duoshuoQuery = {short_name:"yanhom"};
	                              (function() {
		                         var ds = document.createElement('script');
		                         ds.type = 'text/javascript';ds.async = true;
		                         ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
		                         ds.charset = 'UTF-8';
		                         (document.getElementsByTagName('head')[0] 
		                         || document.getElementsByTagName('body')[0]).appendChild(ds);
	                              })();
	                        </script>
                             <!-- 公共JS代码 end -->
                             </div>
					</main>
							 
					<!-- right -->
	              	<jsp:include flush="true" page="right.jsp"></jsp:include>
				</div>
			</div>
		</div>
		
		<!-- footer -->
		<jsp:include flush="true" page="footer.jsp"></jsp:include>

		<!-- Mobile Menu -->
		<jsp:include flush="true" page="mobile.jsp"></jsp:include>
		
		
				 <!-- js -->
	    <script src="/yanhomBlog/static/js/jquery1.42.min.js"></script>
	    <script src="/yanhomBlog/static/js/bootstrap.min.js"></script>
	    <script src="/yanhomBlog/static/js/pace.min.js"></script>
	    <script src="/yanhomBlog/static/js/modernizr.custom.js"></script>
	    <script src="/yanhomBlog/static/js/script.js"></script>
	</body>
</html>
