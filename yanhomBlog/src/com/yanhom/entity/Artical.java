package com.yanhom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_article")
public class Artical {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer articleId;	
	@Column
	private String articelTitle;
	@Column
	private String articelContent;	
	@Column
	private String publishTime;
	@Column
	private String userId;
	@Column
	private Integer categoryId;
	
	public Artical() {
		super();
	}
	public Artical(Integer articleId, String articelTitle,
			String articelContent, String publishTime, String userId,
			Integer categoryId) {
		super();
		this.articleId = articleId;
		this.articelTitle = articelTitle;
		this.articelContent = articelContent;
		this.publishTime = publishTime;
		this.userId = userId;
		this.categoryId = categoryId;
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
	
}
