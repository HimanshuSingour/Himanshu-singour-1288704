package com.infy.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.entity.Movie;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie,Integer> {
   
	
	 @Query("from Movie m where m.Movie_Title=?1")
	  public Optional<Movie> findByMovie_Title(String title);
	  
	  
	 @Query("from Movie m where m.Movie_Title like CONCAT('%',?1,'%')")
	  public List<Movie> findByMovie_TitleLike(String title) ;
	  
	 @Modifying
	 @Query("delete from Movie m where m.Movie_Title=?1 ")
	 public Integer deleteByMovie_Title(String title);
	 
	 @Modifying
	 @Query("update Movie e set e.Date_Released=?1 where e.Movie_Title=?2")
	 public Integer updateMovieWithGivenReleaseDate(LocalDate date,String title);
	
	 
//	 List director's details based on the movie title
	 @Query(value="	 SELECT m.* FROM Movie m JOIN movie_director md ON m.Movie_Id = md.Movie_Id JOIN Director d ON d.Director_Id = md.Director_Id  where d.first_name=?1",nativeQuery=true)
	 public  List<Movie> searchMovieListFromDirectorName(String title);
	 
}
