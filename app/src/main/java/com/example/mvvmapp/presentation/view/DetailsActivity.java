package com.example.mvvmapp.presentation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mvvmapp.R;
import com.example.mvvmapp.databinding.ActivityDetailsBinding;
import com.example.mvvmapp.databinding.ActivityMainBinding;
import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.model.details.Details;
import com.example.mvvmapp.presentation.viewmodel.MovieViewModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class DetailsActivity extends AppCompatActivity {
    private MovieViewModel movieViewModel;
   TextView textView ;
    String xx;
    private ActivityDetailsBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent i = getIntent();
        textView=findViewById(R.id.text);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_details);
        int x =i.getIntExtra("id", 5);

        movieViewModel = new MovieViewModel(x);
        Observable<Details> movieDetails = movieViewModel.movieDetails;
        movieDetails.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Details>() {


                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(final Details details) {
                   activityMainBinding.text.setText(details.getData().getMovie().getImdbCode());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
