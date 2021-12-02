package com.capg.hollywood.mapstruct.mappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.capg.hollywood.beans.Movies;
import com.capg.hollywood.mapstruct.dto.MovieDto;

@Component
public class MovieMappersImpl implements IMovieMappers {
	
	
	final Logger LOGGER = LoggerFactory.getLogger(this.getClass());



	@Override
	public MovieDto movieToMovieDto(Movies movies) {
		// TODO Auto-generated method stub
		LOGGER.info("Mapper from movieToMovieDto is intialized");
		MovieDto movieDto = new MovieDto();
		movieDto.setId(movies.getId());
		movieDto.setName(movies.getName());
		movieDto.setCost(movies.getCost());
		LOGGER.info("Mapper from movieToMovieDto is terminated");
		return movieDto;
	}

	@Override
	public Movies MovieDtoTomovie(MovieDto movieDto) {
		// TODO Auto-generated method stub
		LOGGER.info("Mapper from MovieDtoTomovie is intialized");
		Movies movie = new Movies();
		movie.setId(movieDto.getId());
		movie.setName(movieDto.getName());
		movie.setCost(movieDto.getCost());
		LOGGER.info("Mapper from MovieDtoTomovie is terminated");
		return null;
	}

}
