package com.codepath.instagram;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by tammy.ngo on 12/1/2015.
 */
public class InstagramPhotosAdapter extends ArrayAdapter<InstagramPhoto> {

    public InstagramPhotosAdapter(Context context, List<InstagramPhoto> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    // use template to display photo

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        InstagramPhoto photo = getItem(position);
        ImageViewHolder viewHolder = null;
        // check if we using recycle view, if not need to inflate
        if (convertView == null ) {
            //create a new view from template
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_photo, parent, false);
            viewHolder = new ImageViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ImageViewHolder)convertView.getTag();
        }

        viewHolder.tvUsername.setText(photo.username);
        viewHolder.tvLikeCount.setText(Integer.toString(photo.likesCount) + " likes");
        viewHolder.tvCaption.setText(photo.caption);

       // clear imageview
        viewHolder.ivPhoto.setImageResource(android.R.color.transparent);
        //insert image using picasso
        Picasso.with(getContext()).load(photo.imageUrl).into(viewHolder.ivPhoto);

        return convertView;

    }



}



