package com.example.utplaces.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utplaces.Models.HorizontalPlaceModel;
import com.example.utplaces.R;

import java.util.List;

public class HorizontalPlaceAdaptor extends RecyclerView.Adapter<HorizontalPlaceAdaptor.ViewHolder> {
    private List<HorizontalPlaceModel> horizontalPlaceModelList;

    public HorizontalPlaceAdaptor(List<HorizontalPlaceModel> horizontalPlaceModelList) {
        this.horizontalPlaceModelList = horizontalPlaceModelList;
    }

    @NonNull
    @Override
    public HorizontalPlaceAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.place_image_itemview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalPlaceAdaptor.ViewHolder holder, int position) {
        int image=horizontalPlaceModelList.get(position).getImageResource();
        String title=horizontalPlaceModelList.get(position).getPlaceTitle();
                holder.setData(image, title);

    }

    @Override
    public int getItemCount() {
        return horizontalPlaceModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView placeImage;
        private TextView placeTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage=itemView.findViewById(R.id.place_imageview);
            placeTitle=itemView.findViewById(R.id.place_title);
        }

        public void setData(int image,String title){
            placeImage.setImageResource(image);
            placeTitle.setText(title);
        }



    }
}
