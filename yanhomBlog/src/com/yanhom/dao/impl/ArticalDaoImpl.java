package com.yanhom.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yanhom.dao.ArticalDao;
import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;

@Repository
public class ArticalDaoImpl implements ArticalDao {

	@Autowired
	SessionFactory sessionfactory;
	public List<Artical> getAll() {
		String sql="from Artical";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<Artical> articals=query.list();
		return articals;
	}

	public ArticalAndCategory getOne(String id) {
		String sql="select new com.yanhom.entity.ArticalAndCategory(a.articleId,a.articelTitle,a.articelContent,a.publishTime,a.userId,a.categoryId,c.categoryName,c.level) from Artical a,Category c where a.categoryId=c.categoryId and a.articleId="+Integer.parseInt(id);
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		ArticalAndCategory a=(ArticalAndCategory)query.uniqueResult();
		return a;
	}

	public List<Artical> queryByCategory(String id) {
		String sql="from Artical a where a.categoryId="+Integer.parseInt(id);
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<Artical> articals=query.list();
		return articals;
	}

	public List<ArticalAndCategory> queryAAC() {
		String sql="select new com.yanhom.entity.ArticalAndCategory(a.articleId,a.articelTitle,a.articelContent,a.publishTime,a.userId,a.categoryId,c.categoryName,c.level) from Artical a,Category c where a.categoryId=c.categoryId";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<ArticalAndCategory> a=query.list();
		return a;
	}

	public List<ArticalAndCategory> queryAAC(String id) {
		String sql="select new com.yanhom.entity.ArticalAndCategory(a.articleId,a.articelTitle,a.articelContent,a.publishTime,a.userId,a.categoryId,c.categoryName,c.level) from Artical a,Category c where a.categoryId=c.categoryId and a.categoryId="+Integer.parseInt(id);
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<ArticalAndCategory> a=query.list();
		return a;
	}

}
