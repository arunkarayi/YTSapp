package com.wizroots.ytsapp.DataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.wizroots.ytsapp.DataModels.MovieModel;
import com.wizroots.ytsapp.Interfaces.MovieModelDAO;

/**
 * Created by arun on 10/17/18.
 * Purpose -
 */

@Database(entities = {MovieModel.class}, version = 1)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase INSTANCE;

    public static MovieDatabase getDatabase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context,MovieDatabase.class,"movie_db").build();
        }
        return INSTANCE;
    }

    public abstract MovieModelDAO moviesdbList();
}
