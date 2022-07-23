package com.example.utplaces.Adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utplaces.R;
import com.example.utplaces.Models.CategoryModel;

import java.util.List;

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {
private List<CategoryModel> categoryModelList;
private int lastPosition=-1;

    public CategoryAdaptor(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String icon = categoryModelList.get(position).getCategoryIcon();
        String title = categoryModelList.get(position).getTitle();
        holder.setCategory(title, position);
        holder.setCategoryicon(icon);
    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView categoryIcon;
        private TextView categoyTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryIcon=itemView.findViewById(R.id.category_icon);
            categoyTitle=itemView.findViewById(R.id.category_Title);
        }

        public void setCategory(String title, int position) {
            categoyTitle.setText(title);
        }

        public void setCategoryicon(String icon){

            int imageResource = itemView.getResources().getIdentifier(icon, null, itemView.getContext().getPackageName());

           Drawable res = itemView.getResources().getDrawable(imageResource);

            categoryIcon.setImageDrawable(res);
        }
    }
}
