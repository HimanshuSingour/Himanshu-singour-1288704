package com.infy.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Director {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Director_Id;
	@Column(length=100)
	private String firstName;
	@Column(length=50)
	private String lastName;
	@Column(length=150)
	private String Address;
	@Column(length=100)
	private String Email;
	
	private Long contactNumber;
	
	

	@ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(name = "MovieDirector",
	  inverseJoinColumns=@JoinColumn(name = "movie_Id", referencedColumnName = "Movie_Id"),
	  joinColumns = @JoinColumn(name= "Director_Id", referencedColumnName = "Director_Id"))
	private List<Movie> movies;
	
	
	
	public List<Movie> getMovies() {
		return movies;
	}


	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}


	public Director(String firstName, String lastName, String address, String email, Long contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Address = address;
		Email = email;
		this.contactNumber = contactNumber;
	}


	public Director() {
		
	}
	
	
	@Override
	public String toString() {
		return "Director \n[Director_Id=" + Director_Id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", Address=" + Address + ", Email=" + Email + ", contactNumber=" + contactNumber + "]\n";
	}

	public Integer getDirector_Id() {
		return Director_Id;
	}
	public void setDirector_Id(Integer director_Id) {
		Director_Id = director_Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
