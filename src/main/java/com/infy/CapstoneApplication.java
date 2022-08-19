package com.infy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.dto.DirectorDTO;
import com.infy.dto.MovieDTO;
import com.infy.service.MovieService;

@SpringBootApplication
public class CapstoneApplication {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext)SpringApplication.run(CapstoneApplication.class, args);
	    
		
		MovieService service = (MovieService)context.getBean("movieservice");
		//Insert 
		MovieDTO dto = new MovieDTO("BNC",LocalDate.now(),LocalDateTime.now());
		List<DirectorDTO> directorList = Arrays.asList(
				new DirectorDTO("abn", "vbn", "Mombai","abc@infosys.com",9876543210L),
				new DirectorDTO("xyz","vdg","Banglore","richard@infy.com",9089786734L)
				);
	
		
//		service.add(dto,directorList); 
		
		
        service.searchBasedOnTitle("BNC");
        
        
//        service.updateReleaseDate(LocalDate.of(2024, 6, 1), "ABC");
        
        
     
        System.out.println("================= Get all Directors from Movie Title ===================");
        
        service.getDirectorListFromTitle("BNC");
        
    
        System.out.println(" ===================Get all Movies from Director Name=============");
        service.getMovieListFromDirectorName("BNC");
        

        System.out.println(service.displayAll().toString());       
	}

}
