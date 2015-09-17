<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>yanhom博客-首页</title>
		<!-- meta -->
		<meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link rel="shortcut icon" href="/yanhomBlog/static/img/yan.jpg" />
	</head>
	<body>
	    <jsp:include flush="true" page="header.jsp"></jsp:include>
	
		<div class="content-body">
			<div class="container">
				<div class="row">
					<main class="col-md-8" id="mainx">
					<c:forEach items="${aac}" var="artical">
						<article class="post">
							<header class="entry-header">
								<h1 class="entry-title">
									<a href="/yanhomBlog/article/${artical.articleId}/detail">${artical.articelTitle}</a>
								</h1>
								<div class="entry-meta">
									<span class="post-category"><a href="/yanhomBlog/article/${artical.categoryId}/type">${artical.categoryName}</a></span>
			
									<span class="post-date"><a href="javascript:void(0)"><time class="entry-date" datetime="2012-11-09T23:15:57+00:00">${artical.publishTime}</time></a></span>
			
									<span class="post-author"><a href="javascript:void(0)">${artical.userId}</a></span>
			
			                        <a href="/yanhomBlog/article/${artical.articleId}/detail">
                                       <span class="comments-link ds-thread-count" data-thread-key="${artical.articelTitle}" data-count-type="comments"></span>
                                    </a>
								</div>
							</header>
							<div class="entry-content clearfix">
								<div class="figcaption">${artical.articelContent}</div>
								<div class="read-more cl-effect-14">
									<a href="/yanhomBlog/article/${artical.articleId}/detail" class="more-link">Continue reading <span class="meta-nav">→</span></a>
								</div>
							</div>
						</article>
					</c:forEach>
					</main>
					<!-- right -->
	              	<jsp:include flush="true" page="right.jsp"></jsp:include>
				</div>
			</div>
		</div>
		
		
		<div class="pinglun" style="display: none;">     
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
