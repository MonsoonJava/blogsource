package com.yanhom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yanhom.dao.ArticalDao;
import com.yanhom.dao.CategoryDao;
import com.yanhom.entity.Artical;
import com.yanhom.entity.Category;
import com.yanhom.service.ArticalService;
import com.yanhom.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao cdao;
	
	public List<Category> getAllCategory() {
		return cdao.getAllCategory();
	}
	
}
