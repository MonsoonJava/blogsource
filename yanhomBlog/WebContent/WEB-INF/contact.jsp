<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>联系我</title>

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
					<main class="col-md-12">
						<h1 class="page-title">Contact</h1>
						<article class="post">
						
							<div class="entry-content clearfix">
						
								<form action="/yanhomBlog/vistor/message" method="post" class="contact-form">
									<div class="row">
										<div class="col-md-6 col-md-offset-3">
											<div class="info"  style="margin-bottom:15px;"><span>${success}</span></div>
											<input type="text" name="name" placeholder="Name" required>
											<input type="email" name="email" placeholder="Email" required>
											<input type="text" name="subject" placeholder="Subject" required>
											<textarea name="message" rows="7" placeholder="Your Message" required></textarea>
											<button class="btn-send btn-5 btn-5b ion-ios-paperplane"><span>Drop Me a Line</span></button>
										</div>
									</div>	<!-- row -->
								</form>
							</div>
						</article>
					</main>
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
		<script type="text/javascript">
		$().ready(function () {
	        setTimeout(function () { $(".info").hide(); }, 3000);
	    });
	
		</script>
	</body>
</html>
