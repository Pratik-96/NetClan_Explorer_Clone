package com.example.netclanexplorerclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclanexplorerclone.R;
import com.example.netclanexplorerclone.adapters.BusinessAdapter;
import com.example.netclanexplorerclone.adapters.ServiceAdapter;
import com.example.netclanexplorerclone.personalModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Businesses#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Businesses extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Businesses() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Businesses.
     */
    // TODO: Rename and change types and number of parameters
    public static Businesses newInstance(String param1, String param2) {
        Businesses fragment = new Businesses();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  =  inflater.inflate(R.layout.fragment_businesses, container, false);



        RecyclerView recyclerView = view.findViewById(R.id.bussinessRecyclerView);

        personalModel model [] = {
                new personalModel("TCS"," ","Hi Community! We have great deals for you",R.drawable.tcs),
                new personalModel("Swiggy"," ","Hi Community! We have great deals for you",R.drawable.swiggy),
                new personalModel("Zomato"," ","Hi Community! We have great deals for you",R.drawable.zomato),

        };

        BusinessAdapter businessAdapter = new BusinessAdapter(model);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(businessAdapter);


        return view;
    }
}