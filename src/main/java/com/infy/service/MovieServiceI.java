package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.dto.DirectorDTO;
import com.infy.dto.MovieDTO;
import com.infy.entity.Movie;

public interface MovieServiceI {

	
	//Add,searchBasedOnTitle or else Invalid Title,updateReleaseDate,deleteBasedOnMovieTitle,displayAllMovies
     void add(MovieDTO dto,List<DirectorDTO> directorDTO);
     void  searchBasedOnTitle(String title);
     void updateReleaseDate(LocalDate releaseDate,String movieTitle);
     void deleteBasedOnMovieTitle(String Title);
     List<Movie> displayAll();
     
     void getDirectorListFromTitle(String title);
     void getMovieListFromDirectorName(String name);
    
}
