package com.example.deepu.dogwiteration1.drawerFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deepu.dogwiteration1.PlantRelevant.PlantFirstPage;
import com.example.deepu.dogwiteration1.R;

/**
 * Created by qingyunhe on 27/08/2017.
 * This is a blank page, working as a container for plant list and plant detail page
 */

public class Plant extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.plant, container, false);
        getFragmentManager().beginTransaction().
                add(R.id.plant_main_page, new PlantFirstPage(), "plantMainPage").
                commit();
        getActivity().setTitle("Toxic and non-toxic plant");
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(hidden){

        }else {
            getActivity().setTitle("Toxic and non-toxic plant");
            getActivity().invalidateOptionsMenu();
        }
    }
}
