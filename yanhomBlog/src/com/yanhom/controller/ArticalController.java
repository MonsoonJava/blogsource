package com.yanhom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;
import com.yanhom.entity.Category;
import com.yanhom.service.ArticalService;
import com.yanhom.service.CategoryService;

@Controller
@RequestMapping("/article")
public class ArticalController {
	
	@Autowired
	ArticalService as=null;
	
	@Autowired
	CategoryService cs=null;
	
	@RequestMapping(value="/article")
	public String queryAllArtical(Model m){
		
		List<Category> categorys=cs.getAllCategory();
		List<ArticalAndCategory> aac=as.getAAC();
		m.addAttribute("aac", aac);
		m.addAttribute("categorys", categorys);
		return "/index";
	}
	
	@RequestMapping(value="/all")
	public String queryAllHistory(Model m){
		List<ArticalAndCategory> aac=as.getAAC();
		m.addAttribute("aac", aac);
		List<Category> categorys=cs.getAllCategory();
		m.addAttribute("categorys", categorys);
		return "/all";
	}
	
	@RequestMapping(value="/{id}/detail",method=RequestMethod.GET)
	public String getOne(@PathVariable String id,Model m)
	{
		List<ArticalAndCategory> aac=as.getAAC();
		m.addAttribute("aac", aac);
		ArticalAndCategory artical=as.getOne(id);
		List<Category> categorys=cs.getAllCategory();
		m.addAttribute("categorys", categorys);
		m.addAttribute("artical", artical);
		return "/single";
	}
	
	@RequestMapping(value="/{id}/type",method=RequestMethod.GET)
	public String queryByCategory(@PathVariable String id,Model m){
		
		List<ArticalAndCategory> aac=as.getAAC(id);
		m.addAttribute("aac", aac);
		List<Category> categorys=cs.getAllCategory();
		m.addAttribute("categorys", categorys);
		return "/index";
	}
}
