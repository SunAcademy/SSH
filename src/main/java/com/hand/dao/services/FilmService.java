package com.hand.dao.services;

import java.util.List;

import com.hand.pojo.Film1;

public interface FilmService {
	public abstract List<Film1> listFilms();
	public abstract void delete(Short film_id);

}
