package com.infy.dto;
import com.infy.dto.DirectorDTO;
import com.infy.entity.Director;

public class DirectorDTO {

	

    private Integer Director_Id;
	private String firstName;
	private String lastName;
	private String Address;
	private String Email;
	private Long contactNumber;
	

	
	public DirectorDTO(String firstName, String lastName, String address, String email, Long contactNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Address = address;
		Email = email;
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Director [Director_Id=" + Director_Id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", Address=" + Address + ", Email=" + Email + ", contactNumber=" + contactNumber + "]";
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
	public static Director convertDTOToEntity(DirectorDTO dto) {
		  Director director  = new Director();
		  
		  director.setAddress(dto.getAddress());
		  director.setLastName(dto.getLastName());
		  director.setContactNumber(dto.getContactNumber());
		  director.setEmail(dto.getEmail());
		  director.setFirstName(dto.getFirstName());
		  return director;
		  
	}
}
