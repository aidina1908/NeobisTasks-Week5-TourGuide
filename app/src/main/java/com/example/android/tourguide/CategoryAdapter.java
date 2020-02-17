package com.example.android.tourguide;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ClubFragment();
        } else if (position == 1) {
            return new CasinoFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new HotelFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){
        if(position == 0) {
            return mContext.getString(R.string.club);
        } else if (position == 1){
            return mContext.getString(R.string.restaurant);
        } else if (position == 2){
            return mContext.getString(R.string.casino);
        } else {
            return mContext.getString(R.string.hotel);

        }
    }

}
