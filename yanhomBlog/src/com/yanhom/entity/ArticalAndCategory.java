package com.yanhom.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ArticalAndCategory {
	
	private Integer articleId;	

	private String articelTitle;

	private String articelContent;	

	private String publishTime;

	private String userId;

	private Integer categoryId;

	private String categoryName;	

	private Integer level;

	public ArticalAndCategory() {
		super();
	}

	public ArticalAndCategory(Integer articleId, String articelTitle,
			String articelContent, String publishTime, String userId,
			Integer categoryId, String categoryName, Integer level) {
		super();
		this.articleId = articleId;
		this.articelTitle = articelTitle;
		this.articelContent = articelContent;
		this.publishTime = publishTime;
		this.userId = userId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.level = level;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getArticelTitle() {
		return articelTitle;
	}

	public void setArticelTitle(String articelTitle) {
		this.articelTitle = articelTitle;
	}

	public String getArticelContent() {
		return articelContent;
	}

	public void setArticelContent(String articelContent) {
		this.articelContent = articelContent;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	


}
