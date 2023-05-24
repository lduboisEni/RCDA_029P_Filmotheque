package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;

@Component("movieBean")
@Controller
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	public Movie findMovie(int i) {				
		return movieService.getMovieById(i);
	}

	public List<Movie> showAllMovies() {
		return movieService.getAllMovies();
	}
	
	

}
