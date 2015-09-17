<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<aside class="col-md-4">
						<div class="widget widget-recent-posts">		
							<h3 class="widget-title">Recent Posts</h3>		
							<ul>
							<c:set var="sum" value="0"></c:set>
							<c:forEach items="${aac}" var="artical">
						    <c:if test="${sum<5}">
								<li>
									<a href="/yanhomBlog/article/${artical.articleId}/detail">${artical.articelTitle}</a>
								</li>
								<c:set var="sum" value="${sum+1}"></c:set>
							</c:if>
							</c:forEach>
					
					
							</ul>
						</div>
						<!--  
						<div class="widget widget-archives">		
							<h3 class="widget-title">Archives</h3>		
							<ul>
								<li>
									<a href="#">November 2014</a>
								</li>
								<li>
									<a href="#">September 2014</a>
								</li>
								<li>
									<a href="#">January 2013</a>
								</li>
							</ul>
						</div>
-->
						<div class="widget widget-category">		
							<h3 class="widget-title">Category</h3>		
							<ul>
							<c:forEach items="${categorys}" var="category">
								<li>
									<a href="/yanhomBlog/article/${category.categoryId}/type">${category.categoryName}</a><span>&nbsp;&nbsp;(${category.level})</span>
								</li>
							</c:forEach>
							</ul>
						</div>
						
						<div class="widget widget-category">		
							<h3 class="widget-title">友情链接</h3>		
							<ul>					
								<li>
									<a href="http://bbs.chinacloud.cn/archiver/showforum-16.aspx">Hadoop专区</a>
								</li>
								<li>
									<a href="http://lusongsong.com/daohang/">博客大全</a>
								</li>
								<li>
									<a href="http://github.com">github</a>
								</li>
								<li>
									<a href="http://nan.so/">南搜 nan.so</a>
								</li>
							</ul>
						</div>
					</aside>