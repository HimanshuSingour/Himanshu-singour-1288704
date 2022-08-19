package com.infy.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.*;


@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Movie_Id;

	@Column(length=100)
    private String Movie_Title;
    

	private LocalDate Date_Released;
	
	private LocalDateTime Movie_Running_Time;
	
	@ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(name = "MovieDirector",
	  joinColumns=@JoinColumn(name = "movie_Id", referencedColumnName = "Movie_Id"),
	  inverseJoinColumns = @JoinColumn(name= "Director_Id", referencedColumnName = "Director_Id"))
	private List<Director> directors;

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

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

	public Movie(Integer movie_Id, String movie_Title, LocalDate date_Released, LocalDateTime movie_Running_Time) {
		super();
		Movie_Id = movie_Id;
		Movie_Title = movie_Title;
		Date_Released = date_Released;
		Movie_Running_Time = movie_Running_Time;
	}


	public Movie() {
		// TODO Auto-generated constructor stub
	}

	//ToString
	@Override
	public String toString() {
		return "Movie \n[Movie_Id=" + Movie_Id + ", Movie_Title=" + Movie_Title + ", Date_Released=" + Date_Released
				+ ", Movie_Running_Time=" + Movie_Running_Time + "]\n";
	}


	
}
