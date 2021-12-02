package com.example.pertemuan2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adapter extends FragmentStatePagerAdapter {
    public Adapter(FragmentManager fm){
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Home tab1 = new Home();
                return tab1;
            case 1:
                Search tab2 = new Search();
                return tab2;
            case 2:
                Leaderboards tab3 = new Leaderboards();
                return tab3;
            case 3:
                History tab4 = new History();
                return tab4;
            case 4:
                Profile tab5 = new Profile();
                return tab5;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                Home tab1 = new Home();
                return "Home";
            case 1:
                Search tab2 = new Search();
                return "Search";
            case 2:
                Leaderboards tab3 = new Leaderboards();
                return "Leaderboards";
            case 3:
                History tab4 = new History();
                return "History";
            case 4:
                Profile tab5 = new Profile();
                return "Profile";
        }
        return null;
    }
}