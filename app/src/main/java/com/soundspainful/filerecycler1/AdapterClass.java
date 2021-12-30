package com.soundspainful.filerecycler1;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    private final ArrayList<FileObject> data;

    public AdapterClass(ArrayList<FileObject> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, null);

        int height = parent.getMeasuredHeight() / 3;
        int width = parent.getMeasuredWidth();

        view.setLayoutParams(new RecyclerView.LayoutParams(width, height));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {

        holder.name.setText(data.get(position).fileName);
        holder.body.setText(data.get(position).fileBody);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public TextView name;
        public TextView body;
        public View fileItemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tvFileName);
            body = itemView.findViewById(R.id.tvFileBody);
            fileItemView = itemView;

        }

    }
}
