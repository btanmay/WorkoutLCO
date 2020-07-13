package com.example.workoutlco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class lcoAdapter extends RecyclerView.Adapter<lcoAdapter.lcoViewHolder> {
private ArrayList<listItemCustomObj> mWorkoutList;


    public static class lcoViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ImageView mImageView;
        public lcoViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.textView);
        }
    }
    public lcoAdapter(ArrayList<listItemCustomObj> workoutList) {
        mWorkoutList = workoutList;
    }
    @NonNull
    @Override
    public lcoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        lcoViewHolder lvh = new lcoViewHolder(v);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull lcoViewHolder holder, int position) {
        listItemCustomObj currentItem = mWorkoutList.get(position);

        holder.mImageView.setImageResource(currentItem.getMimageResource());
        holder.mTextView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {
        return mWorkoutList.size();
    }
}
