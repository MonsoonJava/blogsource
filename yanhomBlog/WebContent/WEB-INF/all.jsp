<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>所有文章</title>
		<!-- meta -->
		<meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link rel="shortcut icon" href="/yanhomBlog/static/img/yan.jpg" />
	    <style type="text/css">
	       #mainx .entry-title a{font-size:14px;}
	    </style>
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
								<h1 class="entry-title" style="margin-bottom: 3px;line-height: 0.9;padding:0px;">
									 <span class="alltime">${artical.publishTime}</span>
									<a href="/yanhomBlog/article/${artical.articleId}/detail">
									  ${artical.articelTitle}
									</a>
								</h1>							
							</header>				
						</article>
					</c:forEach>
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
