package com.bigbell.st.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping("/admin/")
	public String admin() {
		return "admin/admin";
	}
	
	@GetMapping("/admin/register/audience")
	public String register_audience() {
		return "admin/registerAudience";
	}
	
	@GetMapping("/admin/register/movie")
	public String register_movie() {
		return "admin/registerMovie";
	}
}
