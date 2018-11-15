package com.example.matejapodravac.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.matejapodravac.myapplication.R;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    List<Object> dataList;

    public MyRecyclerAdapter(List<Object>myDataSet){
        dataList = myDataSet;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType){
        if (viewType == 0)
        {
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_layout, viewGroup, false);
            return new StudentViewHolder(view);
        }
        else
        {
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_layout, viewGroup, false);
            return new HeaderViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (viewType == 0)
        {

        }

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position){
        if (position==0)
        {
            return 0;
        }
        else return 1;
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView tvStudentIme;
        TextView tvStudentPrezime;
        public StudentViewHolder(@NonNull View itemView){
                super(itemView);
            tvStudentIme = itemView.findViewById(R.id.textViewIme);
            tvStudentPrezime = itemView.findViewById(R.id.textViewPrezime);
        }
    }
    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView tvHeader;
        public HeaderViewHolder(@NonNull View itemView){
            super(itemView);
            tvHeader = itemView.findViewById(R.id.textViewNaslov);
        }
    }
}