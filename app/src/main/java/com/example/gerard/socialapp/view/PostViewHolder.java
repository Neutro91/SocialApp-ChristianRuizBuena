package com.example.gerard.socialapp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gerard.socialapp.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    public ImageView photo;
    public TextView author;
    public TextView content;
    public ImageView image;
    public ImageView like;
    public TextView numLikes;
    public TextView hora;
    public LinearLayout likeLayout;
    public ImageView drop;

    public PostViewHolder(View itemView) {
        super(itemView);

        photo = itemView.findViewById(R.id.photo);
        author = itemView.findViewById(R.id.author);
        content = itemView.findViewById(R.id.content);
        image = itemView.findViewById(R.id.image);
        like = itemView.findViewById(R.id.like);
        numLikes = itemView.findViewById(R.id.num_likes);
        hora=itemView.findViewById(R.id.hora);
        likeLayout = itemView.findViewById(R.id.like_layout);
        drop=itemView.findViewById(R.id.drop);

    }
}