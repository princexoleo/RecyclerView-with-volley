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

    public RecyclerAdapter(List<ModelClass> listModel) {
        this.listModel = listModel;
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

        holder.title.setText(listModel.get(position).getTitle());
        holder.price.setText(listModel.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.product_title);
            price =itemView.findViewById(R.id.product_price);
        }
    }
}
