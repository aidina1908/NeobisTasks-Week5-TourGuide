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


public class ClubFragment extends Fragment {

    public ClubFragment() {
    }

    public void onStart(){
        super.onStart();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_listview, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.drais_title),
                R.drawable.drias,getString(R.string.drais_location),
                Integer.parseInt(getString(R.string.drais_review))));

        items.add(new Item(getString(R.string.hakkasan_title),
                R.drawable.hakkasan,getString(R.string.hakkasan_location),
                Integer.parseInt(getString(R.string.hakkasan_review))));

        items.add(new Item(getString(R.string.omnia_title),
                R.drawable.omnia,getString(R.string.omnia_location),
                Integer.parseInt(getString(R.string.omnia_review))));

        items.add(new Item(getString(R.string.xs_title),
                R.drawable.xs,getString(R.string.xs_location),
                Integer.parseInt(getString(R.string.xs_review))));

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