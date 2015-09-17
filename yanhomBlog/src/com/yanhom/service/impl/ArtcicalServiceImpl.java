package com.yanhom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yanhom.dao.ArticalDao;
import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;
import com.yanhom.service.ArticalService;

@Service
public class ArtcicalServiceImpl implements ArticalService {

	@Autowired
	ArticalDao adao;

	public List<Artical> getAllArtical() {
		return adao.getAll();
	}

	public ArticalAndCategory getOne(String id) {
		return adao.getOne(id);
	}

	public List<Artical> queryByCategory(String id) {
		return adao.queryByCategory(id);
	}

	public List<ArticalAndCategory> getAAC() {
		return adao.queryAAC();
	}

	public List<ArticalAndCategory> getAAC(String id) {
		 return adao.queryAAC(id);
	}
	
}
