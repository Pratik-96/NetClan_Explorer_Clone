package com.example.netclanexplorerclone.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.netclanexplorerclone.R;
import com.example.netclanexplorerclone.personalModel;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.ViewHolder> {


    private personalModel[] models;

    public ServiceAdapter(personalModel[] model){
        models = model;
    }
    @NonNull
    @Override
    public ServiceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_layout,parent,false);
        return new ServiceAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceAdapter.ViewHolder holder, int position) {
        holder.uname.setText(models[position].getName());
        holder.about.setText(models[position].getAbout());
        holder.description.setText(models[position].getDescription());
        holder.pfp.setImageResource(models[position].getImage());
    }

    @Override
    public int getItemCount() {
        return models.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView uname,description,about;
        ImageView pfp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            uname = itemView.findViewById(R.id.user_name);
            description = itemView.findViewById(R.id.description);
            about = itemView.findViewById(R.id.about);
            pfp = itemView.findViewById(R.id.pfp);


        }
    }
}