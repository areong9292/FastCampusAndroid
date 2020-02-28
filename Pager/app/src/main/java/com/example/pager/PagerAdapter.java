package com.example.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

// pager는 하나의 프라그먼트
// pagerAdapter는 이 프라그먼트를 올려주는 역할
public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public PagerAdapter(FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    // 포지션에 따라 별도의 UI 보여줄 것
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                FragmentOne fragmentOne = new FragmentOne();
                return fragmentOne;
            case 1:
                FragmentTwo fragmentTwo = new FragmentTwo();
                return fragmentTwo;
            case 2:
                FragmentThree fragmentThree = new FragmentThree();
                return fragmentThree;
            default:
                return null;
        }
    }

    @Override
    // Pager 갯수
    public int getCount()
    {
        return tabCount;
    }
}
