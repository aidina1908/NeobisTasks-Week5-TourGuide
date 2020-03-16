package com.example.android.tourguide;


import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class CasinoFragment extends Fragment {
    private Context mContext;

    public CasinoFragment() {
    }

    public void onStart(){
        super.onStart();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        RequestOptions requestOptions = new RequestOptions().error(R.mipmap.ic_launcher_round);

        items.add(new Item(getString(R.string.aria_title),
                R.drawable.aria,getString(R.string.aria_location),
                Integer.parseInt(getString(R.string.aria_review))));


        items.add(new Item(getString(R.string.cosmopolitan_title),
                R.drawable.cosmopolitan,getString(R.string.cosmopolitan_location),
                Integer.parseInt(getString(R.string.cosmopolitan_review))));

        items.add(new Item(getString(R.string.encor_title),
                R.drawable.encore,getString(R.string.encor_location),
                Integer.parseInt(getString(R.string.encor_review))));

        items.add(new Item(getString(R.string.mandalay_bay_title),
                R.drawable.mandalaybay,
                getString(R.string.mandalay_bay_location),
                Integer.parseInt(getString(R.string.mandalay_bay_review))));

        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item currentItem = items.get(i);

            Intent itemDetailIntent = new Intent(getContext(), ItemDetails.class);

            itemDetailIntent.putExtra(getString(R.string.intent_extra_item_title),
                    currentItem.getTitle());

            startActivity(itemDetailIntent);

            }
     });
        return rootView;
    }
}