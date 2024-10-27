package com.example.cuu_ho.MenuList.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.cuu_ho.MenuList.Fragment.ScheduleFragment;
import com.example.cuu_ho.MenuList.Fragment.RescueFragment;
import com.example.cuu_ho.MenuList.Fragment.ServiceFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ServiceFragment();
            case 1:
                return new ScheduleFragment();
            case 2:
                return new RescueFragment();
            default:
                return new ServiceFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
