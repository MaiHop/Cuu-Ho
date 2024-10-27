package com.example.cuu_ho.Persentation.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.MenuList.Adapter.ServiceAdapter;
import com.example.cuu_ho.Persentation.Adapter.DetailServiceAdapter;
import com.example.cuu_ho.R;
import com.example.cuu_ho.databinding.ActivityDetailServiceBinding;

public class DetailServiceActivity extends AppCompatActivity {
    ActivityDetailServiceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize();
        RecyclerView recyclerView = binding.rcvComplentDetailService;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DetailServiceAdapter detailServiceAdapter = new DetailServiceAdapter();
        recyclerView.setAdapter(detailServiceAdapter);
    }

    private void initialize() {
    }
}