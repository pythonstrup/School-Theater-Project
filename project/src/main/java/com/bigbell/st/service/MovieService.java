package com.bigbell.st.service;

import java.sql.Time;

import org.springframework.stereotype.Service;

import com.bigbell.st.domain.movie.Movie;
import com.bigbell.st.domain.movie.MovieRepository;
import com.bigbell.st.web.dto.movie.MovieDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieService {

	private final MovieRepository movieRepository;
	
	public void 영화등록(MovieDto movieDto) {
		
		Movie movie = new Movie();
		
		movie.setGenre(movieDto.getGenre());
		movie.setGenreId(movieDto.getGenreId());
		Time time = new Time(movieDto.getHour(), movieDto.getMinute(), 0);
		movie.setRuntime(time);
		movie.setTitle(movieDto.getTitle());
		
		movieRepository.save(movie);
	}

}
