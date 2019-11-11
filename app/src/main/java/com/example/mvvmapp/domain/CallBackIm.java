package com.example.mvvmapp.domain;

import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;
import com.example.mvvmapp.repositry.MovieRepositry;

import io.reactivex.Observable;

public class CallBackIm implements CallBackInterface {
    private MovieRepositry response ;
    private Observable<Response> movieRespones;
    private  Observable<Details> movieDetails;

    public CallBackIm() {
        response = new MovieRepositry() ;
    }

    @Override
    public Observable<Response> callBackRespones() {
        movieRespones=response.getMovieRespones();

        return movieRespones;
    }

    @Override
    public Observable<Details> callbackDetails(int id) {
        movieDetails = response.getMovieDetails(id);
        return movieDetails;
    }


}
