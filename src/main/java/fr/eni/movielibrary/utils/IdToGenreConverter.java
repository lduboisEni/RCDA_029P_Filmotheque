package fr.eni.movielibrary.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Genre;

@Component
public class IdToGenreConverter implements Converter<String, Genre> {
	
	@Autowired
	MovieService movieService;

	@Override
	public Genre convert(String id) {
		return movieService.getGenreById(Integer.parseInt(id));
	}

}
