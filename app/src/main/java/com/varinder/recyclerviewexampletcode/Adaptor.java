package com.varinder.recyclerviewexampletcode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptor extends RecyclerView.Adapter<Adaptor.CustomViewHolder> {

    private List<ModelClass> modelClassList;

    public Adaptor(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        int resources = modelClassList.get(position).getImageResoures();
        String title = modelClassList.get(position).getTitle();
        String body = modelClassList.get(position).getBody();
        holder.setData(resources, title, body);

    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView title, body;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);
        }

        private void setData(int image, String titleText, String bodyText){
            imageView.setImageResource(image);
            title.setText(titleText);
            body.setText(bodyText);
        }
    }
}
