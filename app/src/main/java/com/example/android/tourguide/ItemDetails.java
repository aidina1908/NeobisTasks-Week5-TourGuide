package com.example.android.tourguide;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ItemDetails extends AppCompatActivity {

    final ArrayList<Item> mItems = new ArrayList<Item>();

    public ItemDetails() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        String itemTitle = getIntent().getStringExtra(getString(R.string.intent_extra_item_title));

        setTitle(itemTitle);

        initItems(mItems);

        int currentItemIndex = getItemIndexByTitle(itemTitle);

        inflateLayout(currentItemIndex);

        //TextView location = findViewById(R.id.item_location);
        //final String locationMap = "geo:0,0?=" + location;

       /* location.setOnClickListener (new View.OnClickListener(){
            public void OnClick(View view){
                Uri uri1 = Uri.parse(locationMap);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,uri1);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }

    private void inflateLayout(int index) {
        ImageView itemImage = findViewById(R.id.item_image);
        itemImage.setImageResource(mItems.get(index).getImageResourceId());

        TextView itemTitle = findViewById(R.id.item_title);
        itemTitle.setText(mItems.get(index).getTitle());

        TextView itemLocation = findViewById(R.id.item_location);
        itemLocation.setText(mItems.get(index).getLocation());

        TextView itemOverview = findViewById(R.id.item_overview);
        itemOverview.setText(mItems.get(index).getOverview());

        TextView itemNumber = findViewById(R.id.item_number);
        itemNumber.setText(mItems.get(index).getNumber());

        TextView itemWebsite = findViewById(R.id.item_website);
        itemWebsite.setText(mItems.get(index).getWebSite());

    }

    private int getItemIndexByTitle(String title) {
        try {
            for (int i = 0; i < mItems.size(); i++) {
                Item currentItem = mItems.get(i);
                String currentTitle = currentItem.getTitle();
                if (title.equals(currentTitle)) {
                    return i;
                }
            }
        } catch (Error error) {
        }
        return -1;
    }

    private void initItems(ArrayList<Item> items) {

        items.add(new Item(getString(R.string.drais_title),
                R.drawable.drias,
                getString(R.string.drais_location),
                Integer.parseInt(getString(R.string.drais_review)),
                getString(R.string.drais_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.omnia_title),
                R.drawable.omnia,
                getString(R.string.omnia_location),
                Integer.parseInt(getString(R.string.omnia_review)),
                getString(R.string.omnia_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.hakkasan_title),
                R.drawable.hakkasan,
                getString(R.string.hakkasan_location),
                Integer.parseInt(getString(R.string.hakkasan_review)),
                getString(R.string.hakkasan_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.xs_title),
                R.drawable.xs,
                getString(R.string.xs_location),
                Integer.parseInt(getString(R.string.xs_review)),
                getString(R.string.xs_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.burger_king_title),
                R.drawable.burgerking,
                getString(R.string.burger_king_location),
                Integer.parseInt(getString(R.string.burger_king_review)),
                getString(R.string.burger_king_overview),
                getString(R.string.burger_king_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.gordon_ramsey_title),
                R.drawable.gordonramsey,
                getString(R.string.gordon_ramsey_location),
                Integer.parseInt(getString(R.string.gordon_ramsey_review)),
                getString(R.string.gordon_ramsey_overview),
                getString(R.string.gordon_ramsey_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.mon_ami_title),
                R.drawable.monami,
                getString(R.string.mon_ami_location),
                Integer.parseInt(getString(R.string.mon_ami_review)),
                getString(R.string.mon_ami_overview),
                getString(R.string.mon_ami_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.minus_five_title),
                R.drawable.minusfive,
                getString(R.string.minus_five_location),
                Integer.parseInt(getString(R.string.minus_five_review)),
                getString(R.string.minus_five_overview),
                getString(R.string.minus_five_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.aria_title),
                R.drawable.aria,
                getString(R.string.aria_location),
                Integer.parseInt(getString(R.string.aria_review)),
                getString(R.string.aria_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.cosmopolitan_title),
                R.drawable.cosmopolitan,
                getString(R.string.cosmopolitan_location),
                Integer.parseInt(getString(R.string.cosmopolitan_review)),
                getString(R.string.cosmopolitan_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.encor_title),
                R.drawable.encore,
                getString(R.string.encor_location),
                Integer.parseInt(getString(R.string.encor_review)),
                getString(R.string.encor_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.mandalay_bay_title),
                R.drawable.mandalaybay,
                getString(R.string.mandalay_bay_location),
                Integer.parseInt(getString(R.string.mandalay_bay_review)),
                getString(R.string.mandalay_bay_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.wynn_website)));

        items.add(new Item(getString(R.string.bellagio_title),
                R.drawable.bellagio,
                getString(R.string.bellagio_location),
                Integer.parseInt(getString(R.string.bellagio_review)),
                getString(R.string.omnia_overview),
                getString(R.string.bellagio_phone),
                getString(R.string.bellagio_website)));

        items.add(new Item(getString(R.string.luxor_title),
                R.drawable.luxor,
                getString(R.string.luxor_location),
                Integer.parseInt(getString(R.string.luxor_review)),
                getString(R.string.omnia_overview),
                getString(R.string.luxor_phone),
                getString(R.string.luxor_website)));

        items.add(new Item(getString(R.string.palazzo_title),
                R.drawable.palazzo,
                getString(R.string.palazzo_location),
                Integer.parseInt(getString(R.string.palazzo_review)),
                getString(R.string.omnia_overview),
                getString(R.string.palazzo_phone),
                getString(R.string.palazzo_website)));

        items.add(new Item(getString(R.string.wynn_title),
                R.drawable.wynn,
                getString(R.string.wynn_location),
                Integer.parseInt(getString(R.string.wynn_review)),
                getString(R.string.omnia_overview),
                getString(R.string.wynn_phone),
                getString(R.string.wynn_website)));

    }
}
