package com.acadview.www.aq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Catalog extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        recyclerView = (RecyclerView)findViewById(R.id.rv);
        ItemData itemdatas[]= {new ItemData("Java",R.drawable.javao1)
                ,new ItemData("Python",R.drawable.python)
                ,new ItemData("Machine Learning",R.drawable.machinelearning)
                ,new ItemData("PHP",R.drawable.php)
                ,new ItemData("Android",R.drawable.android)};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter =new MyAdapter(itemdatas);
        recyclerView.setAdapter(myAdapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
