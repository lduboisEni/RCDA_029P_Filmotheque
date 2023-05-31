package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Review;
import fr.eni.movielibrary.bo.ServiceResult;

@Controller
@SessionAttributes({"loggedUser"})
public class MovieController {

	@Autowired
	MovieService movieService;
	
	public Movie findMovie(long id) {
		return movieService.getMovieById(id);
	}
	
	public List<Movie> showAllMovies(){
		return movieService.getAllMovies();
	}
	
	/*Pour afficher fiche publique d'un film
	 */
	@GetMapping("movie/{id}")
	public String movie(@PathVariable("id") int id, Model model) {
		
		// Récupérer une film mock
		Movie movie = movieService.getMovieById(id);
		
		// Envoyer dans le model
		model.addAttribute("movie", movie);
		
		// Preparer la model de donnée pour une review
		model.addAttribute("review", new Review());
		
		return "movie/movie-form";
	}

	
	@GetMapping("movie/add")
	public String addMovie(Model model) {
		
		if(model.getAttribute("loggedUser") == null) {
			
			return "redirect:/login";
		}
		
		// 1 : Envoyer les données dans le model pour la vue
		model.addAttribute("movie", new Movie());
		
		// Envoyer liste des genres
		model.addAttribute("genreOption", movieService.getGenres());
		
		model.addAttribute("participantOption", movieService.getParticipants());
		
		// 2 : Retourner la vue
		return "movie/add-form";
	}
	
	@PostMapping("movie/add")
	public String addMovie(@ModelAttribute ("movie") Movie movie, Model model) {
		
		ServiceResult result = movieService.addMovie(movie);
		
		
		if (result.isValid()) {
		
			return "redirect:/";
		}
		
		// Sinon
        // -- Envoyer le message d'erreur dans la vue
        model.addAttribute("errors", result.getErrors());
        
        // -- Afficher le formulaire
        return "movie/movie-form";
	}
	
	@GetMapping("/")
	public String showMovies(Model model) {		
		
		// 1 : Envoyer les données dans le model pour la vue
		model.addAttribute("movies", movieService.getAllMovies());
		
		// 2 : Retourner la vue
		return "movie/movies-list";

	}	
	
	@PostMapping("add-review/{id}")
	public String createMovie(@PathVariable("id") int id, @ModelAttribute("review") Review review, Model model) {
		// Récupérer
		ServiceResult result = movieService.addReview(review, id);
		
		// Si on trouve le film
		if (result.isValid()) {
			
			// -- Redirigier sur le film
			return String.format("redirect:/movie/%d", id);
		}
	
		// Erreur
		System.out.println(String.format("Erreurs : %s", result.getErrors()));
		
		return String.format("redirect:/");
	}
}

