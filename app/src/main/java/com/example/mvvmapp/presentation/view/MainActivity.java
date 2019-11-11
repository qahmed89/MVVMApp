package com.example.mvvmapp.presentation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Toast;

import com.example.mvvmapp.R;
import com.example.mvvmapp.databinding.ActivityMainBinding;
import com.example.mvvmapp.model.MoviesItem;
import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.presentation.adapter.CustomAdapter;
import com.example.mvvmapp.presentation.viewmodel.MovieViewModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements CustomAdapter.OnMovieclickListener{
    private ActivityMainBinding activityMainBinding;
    private MovieViewModel movieViewModel;
    private CustomAdapter customAdapter;
    List<MoviesItem> movies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        movies=new ArrayList<>();
        movieViewModel = new MovieViewModel();
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.recycleview.setLayoutManager(layoutManager);
        activityMainBinding.recycleview.setHasFixedSize(true);
        customAdapter = new CustomAdapter(movies ,MainActivity.this,this);
        Toast.makeText(MainActivity.this, "next", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "complete", Toast.LENGTH_SHORT).show();
        call();
    }

    private void call() {
        Observable<Response> movieResposne = movieViewModel.movieResposne;
        movieResposne.subscribeOn(Schedulers.io()).
       observeOn(AndroidSchedulers.mainThread())
       .subscribe(new Observer<Response>() {
            @Override
            public void onSubscribe(Disposable d) {
                Toast.makeText(MainActivity.this, "asd"+d.toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNext(Response response) {
                movies.addAll(response.getData().getMovies());
                activityMainBinding.recycleview.setAdapter(customAdapter);


            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onComplete() {

            }
        });

    }

    @Override
    public void onMovieClick(int Postion) {
     Intent i = new Intent(this,DetailsActivity.class);
     i.putExtra("id",movies.get(Postion).getId());
     startActivity(i);
    }
}
