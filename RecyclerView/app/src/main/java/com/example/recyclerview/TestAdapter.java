package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {
    private ArrayList<TestItem> mTestList;

    //1
    public static  class TestViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;

        //2
        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            //4
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);

        }
    }
    //6
    public  TestAdapter(ArrayList<TestItem> testList){
      mTestList=testList;

    }


    //3
    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //5
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        TestViewHolder testViewHolder=new TestViewHolder(view);
        return testViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        //7
        TestItem currentItem = mTestList.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {
        return mTestList.size();
    }


}
