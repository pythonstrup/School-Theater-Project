package com.bigbell.st.web.dto.movie;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieDto {

	private String title;
	
	private int hour;
	
	private int minute;
	
	private int genreId;
	
	private String genre;
}
