package com.example.tuan11_fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2Adapter extends FragmentStateAdapter {
    public ViewPager2Adapter(@NonNull FragmentManager fragmentMangager, @NonNull Lifecycle lifecycle)
    {
        super(fragmentMangager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment (int position)
    {
        switch (position)
        {
            case 0:
                return new NewOrderFragment();
            default:
                return new NewOrderFragment();
        }

    }

    @Override
    public int getItemCount()
    {
        return 5;
    }
}
