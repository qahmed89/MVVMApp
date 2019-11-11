package com.example.mvvmapp.presentation.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.mvvmapp.domain.CallBackIm;
import com.example.mvvmapp.domain.CallBackInterface;
import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;

import io.reactivex.Observable;

public class MovieViewModel extends ViewModel {
private CallBackIm callBackIm;
public Observable<Response> movieResposne;
public Observable<Details> movieDetails;
int id ;

    public MovieViewModel(int id) {
        this.id = id;
        callBackIm=new CallBackIm();
        movieResposne=callBackIm.callBackRespones();
        movieDetails= callBackIm.callbackDetails(id);
    }


    public MovieViewModel() {
        callBackIm=new CallBackIm();
        movieResposne=callBackIm.callBackRespones();
    }


}
