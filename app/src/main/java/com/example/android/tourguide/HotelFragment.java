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


public class HotelFragment extends Fragment {

    public HotelFragment() {
    }

    public void onStart(){
        super.onStart();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.bellagio_title),
                R.drawable.bellagio,
                getString(R.string.bellagio_location),
                Integer.parseInt(getString(R.string.bellagio_review))));

        items.add(new Item(getString(R.string.luxor_title),
                R.drawable.luxor,getString(R.string.luxor_location),
                Integer.parseInt(getString(R.string.luxor_review))));

        items.add(new Item(getString(R.string.palazzo_title),
                R.drawable.palazzo,getString(R.string.palazzo_location),
                Integer.parseInt(getString(R.string.palazzo_review))));

        items.add(new Item(getString(R.string.wynn_title),
                R.drawable.wynn,getString(R.string.wynn_location),
                Integer.parseInt(getString(R.string.wynn_review))));

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