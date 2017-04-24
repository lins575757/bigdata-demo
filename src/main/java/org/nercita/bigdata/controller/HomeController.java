package org.nercita.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(path = "/home/")
public class HomeController {

	@GetMapping(path = { "/", "/index" })
	public String home() {
		return "/index";
	}
}
