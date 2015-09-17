package com.yanhom.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yanhom.dao.VistorDao;
import com.yanhom.entity.Vistor;

@Repository
public class VistorDaoImpl implements VistorDao {
	
	@Autowired
    SessionFactory sf=null;
	public void insert(Vistor v) {
		sf.getCurrentSession().save(v);
	}

}
