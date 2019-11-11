package com.example.mvvmapp.presentation.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvvmapp.R;
import com.example.mvvmapp.model.MoviesItem;
import com.example.mvvmapp.model.Response;
import com.example.mvvmapp.presentation.view.DetailsActivity;

import java.util.List;

import io.reactivex.Observer;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>  {
    List<MoviesItem> movieResonse;
    MoviesItem moviesItem;
    Context context;
    OnMovieclickListener onMovieclickListener;


    public CustomAdapter(List<MoviesItem> movieResonse, Context context, OnMovieclickListener onMovieclickListener) {
        this.movieResonse = movieResonse;
        this.context = context;
        this.onMovieclickListener = onMovieclickListener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomAdapter.CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false),onMovieclickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, final int position) {
       holder.title_movie.setText(movieResonse.get(position).getTitleEnglish());
        Glide.with(context).load(movieResonse.get(position).getMediumCoverImage()).into(holder.image_cover);
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent x = new Intent (context, DetailsActivity.class);
//                x.putExtra("id",movieResonse.get(position).getId());
//                context.startActivity(x);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return movieResonse.size();
    }



    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView image_cover;
        TextView title_movie;
        CardView cardView ;
        OnMovieclickListener onMovieclickListener;
        public CustomViewHolder(@NonNull View itemView,OnMovieclickListener onMovieclickListener) {
            super(itemView);
            image_cover=itemView.findViewById(R.id.cover_image);
            title_movie = itemView.findViewById(R.id.title_movie);
            cardView=itemView.findViewById(R.id.cardview);
            this.onMovieclickListener=onMovieclickListener;
            itemView.setOnClickListener(this);
        }



        @Override
        public void onClick(View v) {
onMovieclickListener.onMovieClick(getAdapterPosition());
        }
    }
    public interface  OnMovieclickListener{
        void onMovieClick(int Postion)  ;
    }
}
