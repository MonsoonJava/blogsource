package com.yanhom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanhom.entity.Vistor;
import com.yanhom.service.VistorService;

@Controller
@RequestMapping("/vistor")
public class VistorController {
	
	@Autowired
	VistorService vs=null;
	@RequestMapping(value="/message")
	//String name,String email,String subject,String message
	public String leaveMessage(Vistor v,Model m){
		m.addAttribute("success", "");
		vs.add(v);
		m.addAttribute("success", "已收到，我会尽快回复亲的！");
		return "contact";
	}
	

}
