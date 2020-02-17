package com.example.android.tourguide;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
    }

    public void onStart(){
        super.onStart();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.burger_king_title),
                R.drawable.burgerking,getString(R.string.burger_king_location),
                Integer.parseInt(getString(R.string.burger_king_review))));

        items.add(new Item(getString(R.string.gordon_ramsey_title),
                R.drawable.gordonramsey,getString(R.string.gordon_ramsey_location),
                Integer.parseInt(getString(R.string.gordon_ramsey_review))));

        items.add(new Item(getString(R.string.mon_ami_title),
                R.drawable.monami,getString(R.string.mon_ami_location),
                Integer.parseInt(getString(R.string.mon_ami_review))));

        items.add(new Item(getString(R.string.minus_five_title),
                R.drawable.minusfive,getString(R.string.mon_ami_location),
                Integer.parseInt(getString(R.string.minus_five_review))));

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