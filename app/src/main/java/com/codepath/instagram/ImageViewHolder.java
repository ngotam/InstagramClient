package com.codepath.instagram;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tammy.ngo on 12/3/2015.
 */
public class ImageViewHolder {

    TextView tvCaption;
    TextView tvUsername;
    TextView tvLikeCount;
    ImageView ivPhoto;

    public ImageViewHolder(View view) {
        tvCaption = (TextView)view.findViewById(R.id.tvCaption);
        tvUsername = (TextView)view.findViewById(R.id.tvUserName);
        tvLikeCount = (TextView)view.findViewById(R.id.tvLikeCount);
        ivPhoto = (ImageView)view.findViewById(R.id.ivPhoto);
    }
}
