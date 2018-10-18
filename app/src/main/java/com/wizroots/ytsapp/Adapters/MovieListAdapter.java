package com.wizroots.ytsapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wizroots.ytsapp.DataModels.MovieModel;
import com.wizroots.ytsapp.R;

import java.util.List;

/**
 * Created by arun on 10/17/18.
 * Purpose -
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.Holder>{

    List<MovieModel> movieModelList;

    public MovieListAdapter(List<MovieModel> movieModelList) {
        this.movieModelList = movieModelList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.movie_list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.name.setText(movieModelList.get(position).getTitle());
        holder.year.setText(movieModelList.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return movieModelList.size();
    }

    public void addItems(List<MovieModel> movieModelList){
        this.movieModelList = movieModelList;
        notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView name;
        TextView year;

        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.movie_name);
            year = itemView.findViewById(R.id.movie_year);
        }
    }
}
