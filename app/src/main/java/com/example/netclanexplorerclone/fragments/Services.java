package com.example.netclanexplorerclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.netclanexplorerclone.R;
import com.example.netclanexplorerclone.adapters.PersonalAdapter;
import com.example.netclanexplorerclone.adapters.ServiceAdapter;
import com.example.netclanexplorerclone.personalModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Services#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Services extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Services() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Services.
     */
    // TODO: Rename and change types and number of parameters
    public static Services newInstance(String param1, String param2) {
        Services fragment = new Services();
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
        View view =  inflater.inflate(R.layout.fragment_services, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.servicesRecyclerView);

        personalModel model [] = {
                new personalModel("Alex","Fresh Graduate | 0 Years of Experience","Hi Community! I am Available at your service",R.drawable.pic_1),
                new personalModel("Wright","Graduate | 0 Years of Experience","Hi Community! I am Available at your service",R.drawable.pic_4),
                new personalModel("James","Web Developer | 1 Years of Experience","Hi Community! I am Available at your service",R.drawable.pic_5),
                new personalModel("Alice","Android Developer | 3 Years of Experience","Hi Community! I am Available at your service",R.drawable.pic_2),
                new personalModel("Elizabeth","Graduate | 0 Years of Experience","Hi Community! I am Available at your service",R.drawable.pic_3)
        };

        ServiceAdapter serviceAdapter = new ServiceAdapter(model);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(serviceAdapter);


        return view;
    }
}