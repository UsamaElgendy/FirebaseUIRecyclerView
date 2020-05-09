package com.example.firebaseuirecycleradapter.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseuirecycleradapter.R;

public class PostsViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public ImageView imageView;

    public PostsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.custom_post_textView);
        imageView = itemView.findViewById(R.id.custom_post_imageView);
    }
}
