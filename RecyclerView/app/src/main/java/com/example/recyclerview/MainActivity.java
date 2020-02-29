package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<TestItem> testList=new ArrayList<>();

        testList.add(new TestItem(R.drawable.one,"Random Text for Image One"));
        testList.add(new TestItem(R.drawable.two,"Random Text for Image Two"));
        testList.add(new TestItem(R.drawable.three,"Random Text for Image Three"));
        testList.add(new TestItem(R.drawable.four,"Random Text for Image Four"));
        testList.add(new TestItem(R.drawable.five,"Random Text for Image Five"));
        testList.add(new TestItem(R.drawable.six,"Random Text for Image Six"));
        testList.add(new TestItem(R.drawable.seven,"Random Text for Image Seven"));
        testList.add(new TestItem(R.drawable.eight,"Random Text for Image Eight"));
        testList.add(new TestItem(R.drawable.nine,"Random Text for Image Nine"));
        testList.add(new TestItem(R.drawable.ten,"Random Text for Image Ten"));


        //Config for RV
        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);
        adapter = new TestAdapter(testList);


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
