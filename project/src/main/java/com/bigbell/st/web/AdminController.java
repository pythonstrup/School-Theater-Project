package com.bigbell.st.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bigbell.st.domain.movie.Movie;
import com.bigbell.st.service.MovieService;
import com.bigbell.st.web.dto.movie.MovieDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class AdminController {

	private final MovieService movieService;
	
	@GetMapping("/admin")
	public String admin() {
		return "admin/admin";
	}
	
	@GetMapping("/admin/register/audience")
	public String audience() {
		return "admin/registerAudience";
	}
	
	@GetMapping("/admin/register/movie")
	public String movie() {
		return "admin/registerMovie";
	}
	
	@PostMapping("/admin/register/movie")
	public String register_movie(MovieDto movieDto) {
		movieService.영화등록(movieDto);
		
		return "redirect:/admin";
	}
}
