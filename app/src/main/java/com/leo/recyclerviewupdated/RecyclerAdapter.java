package com.leo.recyclerviewupdated;

import android.content.Context;
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
    private Context mContext;

    public RecyclerAdapter(User[] data,Context context) {
        this.data = data;
        this.mContext =context;
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

        holder.user_id_tv.setText(String.valueOf(user.getId()));
        holder.user_type_tv.setText(user.getType());
        holder.login_tv.setText(user.getLogin());
        Glide.with(mContext)
                .load(user.getAvatarUrl())
                .into(holder.avatar_imageview);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView user_id_tv;
        TextView user_type_tv;
        TextView login_tv;
        ImageView avatar_imageview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            user_id_tv =itemView.findViewById(R.id.user_id);
            login_tv =itemView.findViewById(R.id.user_login_id);
            user_type_tv =itemView.findViewById(R.id.user_type_id);
            avatar_imageview= (itemView.findViewById(R.id.user_image));
        }


    }
}
