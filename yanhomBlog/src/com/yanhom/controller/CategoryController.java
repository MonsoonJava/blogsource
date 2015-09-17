package com.yanhom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yanhom.entity.Category;
import com.yanhom.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService cs=null;
	
	@RequestMapping(value="/category")
	public String queryAllArtical(Model m){
		List<Category> categorys=cs.getAllCategory();
		m.addAttribute("categorys", categorys);
		return "/index";
	}
}
