package com.leo.recyclerviewupdated;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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
        holder.login.setText(user.getLogin());
        Glide.with(holder.avatar_imageview.getContext())
                .load(user.getAvatarUrl())
                .into(holder.avatar_imageview);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView id;
        TextView type;
        TextView login;
        ImageView avatar_imageview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id =itemView.findViewById(R.id.product_title);
            login =itemView.findViewById(R.id.product_price);
            type =itemView.findViewById(R.id.user_type);
            avatar_imageview= (itemView.findViewById(R.id.user_image));
        }


    }
}
