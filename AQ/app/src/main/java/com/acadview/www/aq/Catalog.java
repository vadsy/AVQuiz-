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
        ItemData itemdatas[]= {new ItemData("Java",R.drawable.java_trans)
                ,new ItemData("Python",R.drawable.python_trans)
                ,new ItemData("Machine Learning",R.drawable.machine_trans)
                ,new ItemData("PHP",R.drawable.php_trans)};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter =new MyAdapter(itemdatas);
        recyclerView.setAdapter(myAdapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
