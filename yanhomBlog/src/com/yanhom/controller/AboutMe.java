package com.yanhom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanhom.entity.Artical;
import com.yanhom.entity.ArticalAndCategory;
import com.yanhom.entity.Category;
import com.yanhom.service.ArticalService;
import com.yanhom.service.CategoryService;

@Controller
@RequestMapping("/about")
public class AboutMe {
	
	@Autowired
	ArticalService as=null;
	
	@Autowired
	CategoryService cs=null;
	
	@RequestMapping(value="/aboutMe")
	public String aboutMe(Model m)
	{
		List<ArticalAndCategory> aac=as.getAAC();
		m.addAttribute("aac", aac);
		List<Category> categorys=cs.getAllCategory();
		m.addAttribute("categorys", categorys);
		return "about";
	}
	
	@RequestMapping(value="/contactMe")
	public String contactMe()
	{
		return "contact";
	}

}
