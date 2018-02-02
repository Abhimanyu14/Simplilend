package com.appz.abhi.simplilend;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomFragmentPageAdapter extends FragmentPagerAdapter {

    private static final int FRAGMENT_COUNT = 3;

    public CustomFragmentPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ServerApplicationFragment();
            case 1:
                return new ServerApplicationFragment();
            case 2:
                return new ServerApplicationFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Server Application";
            case 1:
                return "Local Application";
            case 2:
                return "Local Files";
        }
        return null;
    }
}
