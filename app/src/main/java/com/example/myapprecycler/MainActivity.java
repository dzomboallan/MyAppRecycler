package com.example.myapprecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> list;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        populateList();
        myAdapter = new MyAdapter(this, list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }

    private void populateList() {
        list = new ArrayList<>();
        list.add(new Model("Calendar", R.drawable.calender));
        list.add(new Model("Facebook", R.drawable.facebook));
        list.add(new Model("Twitter", R.drawable.twitter));
        list.add(new Model("Google", R.drawable.download));
        list.add(new Model("Calendar", R.drawable.calender));
        list.add(new Model("Facebook", R.drawable.facebook));
        list.add(new Model("Twitter", R.drawable.twitter));
        list.add(new Model("Google", R.drawable.download));
        list.add(new Model("Calendar", R.drawable.calender));
        list.add(new Model("Facebook", R.drawable.facebook));
        list.add(new Model("Twitter", R.drawable.twitter));
        list.add(new Model("Google", R.drawable.download));
        list.add(new Model("Calendar", R.drawable.calender));
        list.add(new Model("Facebook", R.drawable.facebook));
        list.add(new Model("Twitter", R.drawable.twitter));
        list.add(new Model("Google", R.drawable.download));
    }
}