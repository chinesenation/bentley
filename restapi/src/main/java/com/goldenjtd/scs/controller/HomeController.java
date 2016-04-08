/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenjtd.scs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author liangwang
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
	public String welcome(Model model){
		model.addAttribute("greeting", "test");
		return "welcome";
	}
}
