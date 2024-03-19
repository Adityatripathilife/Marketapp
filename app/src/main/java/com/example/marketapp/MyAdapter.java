package com.example.marketapp;

import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
  private final List<item> itemList;

    public MyAdapter(List<item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // responsible for creating view holder for your items
        View  itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Binds the data from your dataset to the views within the view holder
        item item1 = itemList.get(position);
        holder.title.setText(item1.getItemName());
        holder.description.setText(item1.getItemDesc());
        holder.imageView.setImageResource(item1.getItemImg());


    }

    @Override
    public int getItemCount() {
       // Returns the total number of items in your dataset

        return itemList.size();
    }


    public static class MyViewHolder extends
            RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;
        TextView description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            title = itemView.findViewById(R.id.title_txt);
            description = itemView.findViewById(R.id.description_text);

        }
    }
}
