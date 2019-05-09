package com.leo.recyclerviewupdated;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<ModelClass>listModel;

    private User[] data;

    public RecyclerAdapter(User[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        User user = data[position];

        holder.id.setText(user.getId());
        holder.type.setText(user.getId());
        holder.avatar_imagae.setText(user.getAvatarUrl());
        holder.login.setText(user.getLogin());


    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView id, type,login,avatar_imagae;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id =itemView.findViewById(R.id.product_title);
            login =itemView.findViewById(R.id.product_price);
            type =itemView.findViewById(R.id.user_type);
            avatar_imagae =itemView.findViewById(R.id.user_image);
        }
    }
}
