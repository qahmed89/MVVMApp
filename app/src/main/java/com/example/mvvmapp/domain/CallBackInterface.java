package com.example.mvvmapp.domain;


import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;

import io.reactivex.Observable;

public interface CallBackInterface {
    Observable<Response> callBackRespones();
    Observable<Details> callbackDetails(int id);
}
