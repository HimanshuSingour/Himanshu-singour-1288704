package com.infy.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;


import com.infy.entity.Movie;



public class MovieDTO {
	
	private Integer Movie_Id;


    private String Movie_Title;
    

	private LocalDate Date_Released;
	
	private LocalDateTime Movie_Running_Time;
	

	public Integer getMovie_Id() {
		return Movie_Id;
	}

	public void setMovie_Id(Integer movie_Id) {
		Movie_Id = movie_Id;
	}

	public String getMovie_Title() {
		return Movie_Title;
	}

	public void setMovie_Title(String movie_Title) {
		Movie_Title = movie_Title;
	}

	public LocalDate getDate_Released() {
		return Date_Released;
	}

	public void setDate_Released(LocalDate date_Released) {
		Date_Released = date_Released;
	}

	public LocalDateTime getMovie_Running_Time() {
		return Movie_Running_Time;
	}

	public void setMovie_Running_Time(LocalDateTime movie_Running_Time) {
		Movie_Running_Time = movie_Running_Time;
	}

	public MovieDTO(String movie_Title, LocalDate date_Released, LocalDateTime movie_Running_Time) {
		super();
		Movie_Title = movie_Title;
		Date_Released = date_Released;
		Movie_Running_Time = movie_Running_Time;
	}

	public MovieDTO(Integer movie_Id, String movie_Title, LocalDate date_Released, LocalDateTime movie_Running_Time) {
		super();
		Movie_Id = movie_Id;
		Movie_Title = movie_Title;
		Date_Released = date_Released;
		Movie_Running_Time = movie_Running_Time;
	}


	//ToString
	@Override
	public String toString() {
		return "Movie [Movie_Id=" + Movie_Id + ", Movie_Title=" + Movie_Title + ", Date_Released=" + Date_Released
				+ ", Movie_Running_Time=" + Movie_Running_Time + "]";
	}
	
    public static Movie convertDTOtoEntity(MovieDTO dto) {
		
    	Movie movie = new Movie();
    	movie.setMovie_Title(dto.getMovie_Title());
    	movie.setMovie_Running_Time(dto.getMovie_Running_Time());
    	movie.setDate_Released(dto.getDate_Released());

    	
    	return movie;
    	
    }
	

}
