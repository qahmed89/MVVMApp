package com.example.mvvmapp.model;

import java.util.Collection;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("movies")
	private List<MoviesItem> movies;

	@SerializedName("page_number")
	private int pageNumber;

	@SerializedName("movie_count")
	private int movieCount;

	@SerializedName("limit")
	private int limit;

	public void setMovies(List<MoviesItem> movies){
		this.movies = movies;
	}

	public List<MoviesItem> getMovies(){
		return movies;
	}

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setMovieCount(int movieCount){
		this.movieCount = movieCount;
	}

	public int getMovieCount(){
		return movieCount;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"movies = '" + movies + '\'' + 
			",page_number = '" + pageNumber + '\'' + 
			",movie_count = '" + movieCount + '\'' + 
			",limit = '" + limit + '\'' + 
			"}";
		}
}