package com.wizroots.ytsapp.Interfaces;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.wizroots.ytsapp.DataModels.MovieModel;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by arun on 10/17/18.
 * Purpose -
 */

@Dao
public interface MovieModelDAO {

    @Query("select * from moviemodel")
    LiveData<List<MovieModel>> getAllMovies();

    @Insert(onConflict = REPLACE)
    void addMovie(MovieModel movieModel);
}
