package com.wizroots.ytsapp.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.wizroots.ytsapp.DataBase.MovieDatabase;
import com.wizroots.ytsapp.DataModels.MovieModel;

import java.util.List;

/**
 * Created by arun on 10/17/18.
 * Purpose -
 */

public class MovieListViewModel extends AndroidViewModel {

    private final LiveData<List<MovieModel>> listLiveData;
    private MovieDatabase movieDatabase;

    public MovieListViewModel(@NonNull Application application) {
        super(application);
        movieDatabase = MovieDatabase.getDatabase(this.getApplication());
        listLiveData = movieDatabase.moviesdbList().getAllMovies();
    }

    public LiveData<List<MovieModel>> getallMovies(){
        return listLiveData;
    }
}
