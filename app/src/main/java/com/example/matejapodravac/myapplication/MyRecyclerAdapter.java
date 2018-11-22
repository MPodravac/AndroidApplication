package com.example.matejapodravac.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.matejapodravac.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    List<Object> dataList;
    private ArrayList mDataList;

    public MyRecyclerAdapter(ArrayList myDataSet){
        mDataList = myDataSet;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType){
        if (viewType == 0)
        {
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_layout, viewGroup, false);
            return new StudentViewHolder(view);
            /*
            * TextView headerviewholder = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_layout, viewGroup, false);
            * HeaderViewHolder headerView = new HeaderViewHolder(headerviewholder);
            * return headerView;
            * */
        }
        else
        {
            View view = (View) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_layout, viewGroup, false);
            return new HeaderViewHolder(view);

            /*
             * TextView studentviewholder = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_layout, viewGroup, false);
             * HeaderViewHolder studentviewholder = new StudentViewHolder(studentviewholder);
             * return studentviewholder;
             * */
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (position == 0) {
            HeaderViewHolder headerviewholder = (HeaderViewHolder) viewHolder;
        }
        else
        {
            StudentViewHolder studentviewholder = (StudentViewHolder) viewHolder;
        }

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
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
        public StudentViewHolder(@NonNull View ContentView){
                super(ContentView);
            tvStudentIme = ContentView.findViewById(R.id.textViewIme);
            tvStudentPrezime = ContentView.findViewById(R.id.textViewPrezime);
        }
    }
    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView tvHeader;
        public HeaderViewHolder(@NonNull View headerView){
            super(headerView);
            tvHeader = itemView.findViewById(R.id.textViewNaslov);
        }
    }
}