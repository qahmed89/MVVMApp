package com.example.mvvmapp.remote;

import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
     @GET("list_movies.json")
     Observable<Response> getMovies();
     @GET("movie_details.json?movie_id=")
     Observable<Details> getDetails(@Query("movie_id") int Id);
}
