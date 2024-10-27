package com.example.cuu_ho.Persentation.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.cuu_ho.MenuList.Adapter.ViewPagerAdapter;
import com.example.cuu_ho.R;
import com.example.cuu_ho.databinding.ActivityOrderListBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class OrderListActivity extends AppCompatActivity {
    ActivityOrderListBinding binding;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
    }
    private void initialize() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Set adapter cho ViewPager2
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        // Đồng bộ TabLayout với ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Dịch vụ");
                    break;
                case 1:
                    tab.setText("Đơn đặt lịch");
                    break;
                case 2:
                    tab.setText("Đơn cứu hộ");
                    break;
            }
        }).attach();

        for (int i = 0; i <= 3; i++) {
            TextView textView = (TextView) LayoutInflater.from(OrderListActivity.this).inflate(R.layout.table_title, null);
            if (binding.tabLayout.getTabAt(i) != null) {
                binding.tabLayout.getTabAt(i).setCustomView(textView);
            }
        }
        // Đặt padding/margin cho mỗi tab
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            View tab = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            params.setMargins(-18, 0, -18, 0); // Thay 16 bằng giá trị margin bạn muốn
            tab.requestLayout();
        }

    }


}