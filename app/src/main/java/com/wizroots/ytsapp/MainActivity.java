package com.wizroots.ytsapp;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wizroots.ytsapp.Adapters.MovieListAdapter;
import com.wizroots.ytsapp.DataModels.MovieModel;
import com.wizroots.ytsapp.ViewModels.MovieListViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LifecycleObserver {

    private MovieListViewModel movieListViewModel;
    private MovieListAdapter movieListAdapter;
    private RecyclerView MovierecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovierecyclerView = findViewById(R.id.recyclerVW);
        MovierecyclerView.setLayoutManager(new LinearLayoutManager(this));
        movieListAdapter = new MovieListAdapter(new ArrayList<MovieModel>());
        MovierecyclerView.setAdapter(movieListAdapter);

        movieListViewModel = ViewModelProviders.of(this).get(MovieListViewModel.class);
        movieListViewModel.getallMovies().observe(MainActivity.this, new Observer<List<MovieModel>>() {
            @Override
            public void onChanged(@Nullable List<MovieModel> movieModels) {
                movieListAdapter.addItems(movieModels);
            }
        });

    }
}
