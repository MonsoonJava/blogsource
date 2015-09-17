package com.yanhom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanhom.dao.VistorDao;
import com.yanhom.entity.Vistor;
import com.yanhom.service.VistorService;

@Service
public class VistorServiceImpl implements VistorService {

	@Autowired
    VistorDao vd=null;
	public void add(Vistor v) {
		vd.insert(v);
	}

}
