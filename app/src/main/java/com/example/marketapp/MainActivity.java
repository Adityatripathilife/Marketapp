package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 1- AdapterView
    RecyclerView recyclerView2;

    // data source
    List<item> itemList;

    // 3- Adapter
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView2 = findViewById(R.id.recyclerView2);
        itemList = new ArrayList<>();
        item item1 = new item(R.drawable.fruit,"Fruits","Fresh fruit from garden");
        item item2 = new item(R.drawable.vegitables,"Vegetables","Delicious Vegetables");
        item item3 = new item(R.drawable.bread,"Breads","Wheat and Beans");
        item item4 = new item(R.drawable.milk,"Milk","Milk Shakes and Yogurt");
        item item5 = new item(R.drawable.beverage,"Beverges","Juice,Tean and Coffee");
        item item6 = new item(R.drawable.popcorn,"Snacks","Pop corn and Donuts");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager);





        myAdapter = new MyAdapter(itemList);
        recyclerView2.setAdapter(myAdapter);
    }
}