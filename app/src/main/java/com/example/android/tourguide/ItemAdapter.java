package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    static class ViewHolder{
        TextView title;
        TextView location;
        ImageView image;
        ImageView review;
        TextView overview;
        TextView number;
        TextView website;

    }

    public ItemAdapter (Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }
    @Override

    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Item currentItem = getItem(position);

        ViewHolder holder = new ViewHolder();
        holder.title = listItemView.findViewById(R.id.title);
        holder.title.setText(currentItem.getTitle());

        holder.image = listItemView.findViewById(R.id.image);
        holder.image.setImageResource(currentItem.getImageResourceId());

        holder.location = listItemView.findViewById(R.id.location);
        holder.location.setText(currentItem.getLocation());

        showReview(listItemView, currentItem.getImageResourceId());

        holder.overview = listItemView.findViewById(R.id.overview);
        holder.overview.setText(currentItem.getOverview());

        holder.number = listItemView.findViewById(R.id.number);
        holder.number.setText(currentItem.getNumber());

        holder.website = listItemView.findViewById(R.id.website);
        holder.website.setText(currentItem.getWebSite());


        return listItemView;
    }

    private void showReview(View listview, int star) {
        ImageView imageViewStar1 = listview.findViewById(R.id.review_star1);
        ImageView imageViewStar2 = listview.findViewById(R.id.review_star2);
        ImageView imageViewStar3 = listview.findViewById(R.id.review_star3);
        ImageView imageViewStar4 = listview.findViewById(R.id.review_star4);
        ImageView imageViewStar5 = listview.findViewById(R.id.review_star5);
    }

}


