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
import com.example.netclanexplorerclone.personalModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Personal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Personal extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Personal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Personal.
     */
    // TODO: Rename and change types and number of parameters
    public static Personal newInstance(String param1, String param2) {
        Personal fragment = new Personal();
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
        View v =  inflater.inflate(R.layout.fragment_personal, container, false);


        RecyclerView recyclerView = v.findViewById(R.id.personalRecyclerView);

        personalModel model [] = {
                new personalModel("Alex","Pune | Student","Hi Community! I am open to new connections",R.drawable.pic_1),
                new personalModel("Wright","Mumbai | Computer Engineer","Hi Community! I am open to new connections",R.drawable.pic_4),
                new personalModel("James","Banglore | Web Developer","Hi Community! I am open to new connections",R.drawable.pic_5),
                new personalModel("Alice","Delhi | Android Developer","Hi Community! I am open to new connections",R.drawable.pic_2),
                new personalModel("Elizabeth","New York | Student","Hi Community! I am open to new connections",R.drawable.pic_3)
        };

        PersonalAdapter personalAdapter = new PersonalAdapter(model);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(personalAdapter);


        return  v;
    }
}