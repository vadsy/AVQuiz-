package com.example.www.countryandcities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cities extends AppCompatActivity {

    String IndiaCities []={"chandigarh","delhi","mumbai"};
    String USACities []={"New york","Los Angeles","Chicago"};
    String PakistanCities []={"karachi","lahore","faisalabad"};

    ListView second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        second =(ListView)findViewById(R.id.cities);
        Intent intent=getIntent();
        String countryname = intent.getStringExtra("Country");
        if(countryname.equals("India")){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,IndiaCities);
            second.setAdapter(adapter);
        }
        if(countryname.equals("USA")){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,USACities);
            second.setAdapter(adapter);
        }
        if(countryname.equals("Pakistan")){
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,PakistanCities);
            second.setAdapter(adapter);
        }
    }
}
