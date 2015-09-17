package com.yanhom.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yanhom.dao.CategoryDao;
import com.yanhom.entity.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionfactory=null;
	public List<Category> getAllCategory() {
		String sql="from Category";
	    Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<Category> categorys=query.list();
		return categorys;
	}

}
