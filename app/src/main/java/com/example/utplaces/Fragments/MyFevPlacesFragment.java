package com.example.utplaces.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.utplaces.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFevPlacesFragment extends Fragment {


    public MyFevPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_fev_places, container, false);
    }

}
