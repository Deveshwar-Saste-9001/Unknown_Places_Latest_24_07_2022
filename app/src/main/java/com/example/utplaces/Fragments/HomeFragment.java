package com.example.utplaces.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utplaces.Adapters.SliderAdapter;
import com.example.utplaces.R;
import com.example.utplaces.Adapters.CategoryAdaptor;
import com.example.utplaces.Models.CategoryModel;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerview, bannerSliderRecyclerView;
    private CategoryAdaptor categoryAdapter;

    private List<CategoryModel> categoryModelList;
    private List<Integer> sliderbannerlist=new ArrayList<>();
    private SliderAdapter sliderAdapter;
    private SliderView bannerSliderView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryRecyclerview = view.findViewById(R.id.categoryRecyclerView);
        categoryModelList = new ArrayList<>();
        bannerSliderView=view.findViewById(R.id.Banner_slider_slideview);
//        bannerSliderRecyclerView = view.findViewById(R.id.bannerslider);


        categoryModelList.add(new CategoryModel("@drawable/ic_home_black_24dp", "Home"));
        categoryModelList.add(new CategoryModel("@drawable/temple_category", "Religious"));
        categoryModelList.add(new CategoryModel("@drawable/forts_category", "Forts"));
        categoryModelList.add(new CategoryModel("@drawable/waterfall_category", "Waterfalls"));
        categoryModelList.add(new CategoryModel("@drawable/historical_category", "Historical"));
        categoryModelList.add(new CategoryModel("@drawable/tajmahal_category", "Wonders"));
        categoryModelList.add(new CategoryModel("@drawable/cave_category", "Caves"));
        categoryModelList.add(new CategoryModel("@drawable/hillsation_category", "Hill Stations"));
        categoryModelList.add(new CategoryModel("@drawable/dam_category", "Dams"));
        categoryModelList.add(new CategoryModel("@drawable/beach_category", "Beach"));
        categoryModelList.add(new CategoryModel("@drawable/wildlife_category", "wildlifes"));
        categoryModelList.add(new CategoryModel("@drawable/island_category", "Islands"));
        categoryModelList.add(new CategoryModel("@drawable/monument_category", "Monuments"));
        categoryModelList.add(new CategoryModel("@drawable/park_category", "Parks"));
        categoryModelList.add(new CategoryModel("@drawable/river_category", "Rivers"));
        categoryModelList.add(new CategoryModel("@drawable/educational_category", "Educational"));


        categoryAdapter = new CategoryAdaptor(categoryModelList);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerview.setLayoutManager(linearLayoutManager);
        categoryRecyclerview.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();


        sliderbannerlist.add(R.mipmap.raigad);
        sliderbannerlist.add(R.mipmap.hillstation);
        sliderbannerlist.add(R.mipmap.island);
        sliderbannerlist.add(R.mipmap.religiousjpg);
        sliderbannerlist.add(R.mipmap.sport);
        sliderbannerlist.add(R.mipmap.waterfall);
        sliderbannerlist.add(R.mipmap.wildlife);
        sliderbannerlist.add(R.mipmap.wallpaper2you_214876);
        sliderbannerlist.add(R.mipmap.wallpaper2you_214882);

        sliderAdapter=new SliderAdapter(sliderbannerlist);
        bannerSliderView.setSliderAdapter(sliderAdapter);
        bannerSliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        bannerSliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        bannerSliderView.startAutoCycle();










        return view;


    }
}
