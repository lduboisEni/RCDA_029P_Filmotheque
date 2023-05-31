package fr.eni.movielibrary.bll;

import java.util.List;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;
import fr.eni.movielibrary.bo.Review;
import fr.eni.movielibrary.bo.ServiceResult;

public interface MovieService {
	
	public List<Movie> getAllMovies();	
	public Movie getMovieById(long id);
	
	public List<Genre> getGenres();	
	public Genre getGenreById(long id);
	
	public List<Participant> getParticipants();	
	public Participant getParticipantById(long id);
	
	public ServiceResult addMovie(Movie movie);	
	
	public ServiceResult addReview(Review review, int id);
	void saveMovie(Movie movie);

}
