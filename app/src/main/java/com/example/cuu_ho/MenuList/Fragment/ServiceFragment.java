package com.example.cuu_ho.MenuList.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cuu_ho.Domain.Response.ServiceResponse;
import com.example.cuu_ho.MenuList.Adapter.ServiceAdapter;
import com.example.cuu_ho.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_service_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rcv_order_service_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<ServiceResponse> serviceResponseList = Arrays.asList(
                new ServiceResponse("Service 1", "Description 1", 100),
                new ServiceResponse("Service 2", "Description 2", 200),
                new ServiceResponse("Service 3", "Description 3", 300)
        );
        ServiceAdapter serviceAdapter = new ServiceAdapter(serviceResponseList);
        recyclerView.setAdapter(serviceAdapter);
        return view;
    }
}
