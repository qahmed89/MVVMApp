package com.example.mvvmapp.repositry;

import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;
import com.example.mvvmapp.remote.Api;
import com.example.mvvmapp.remote.RetrofitClient;

import io.reactivex.Observable;

public class MovieRepositry {
    private  Api api;
    private Observable<Response> movieRespones ;
    private Observable<Details> movieDetails;


    public MovieRepositry() {
    }

    public Observable<Response> getMovieRespones() {
        api= RetrofitClient.getAPIServices();
        movieRespones=api.getMovies();
        return movieRespones;
    }
    public Observable<Details> getMovieDetails(int id){
        api=RetrofitClient.getAPIServices();
        movieDetails=api.getDetails(id);
        return movieDetails;
    }
}

