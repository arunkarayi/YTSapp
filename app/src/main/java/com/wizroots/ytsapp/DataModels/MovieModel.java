package com.wizroots.ytsapp.DataModels;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by arun on 10/17/18.
 * Purpose -
 */

@Entity
public class MovieModel {

    @PrimaryKey(autoGenerate = true)
    public int id;

    private String title;
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MovieModel(int id, String title, int year) {

        this.id = id;
        this.title = title;
        this.year = year;
    }
}
