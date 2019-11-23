package com.isetkelibia.basicfragment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.isetkelibia.basicfragment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyDynamicFragment extends Fragment {


    public MyDynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_dynamic, container, false);
    }

}
