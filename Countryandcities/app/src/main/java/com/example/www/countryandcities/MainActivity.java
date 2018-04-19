package com.example.www.countryandcities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Country []={"India","USA","Pakistan"};
    ListView first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first =(ListView)findViewById(R.id.countries);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Country);
        first.setAdapter(adapter);
        final Intent intent = new Intent(this,Cities.class);

        first.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(Country[position].equals("India")){
                    intent.putExtra("Country","India");
                    startActivity(intent);
                }
                if(Country[position].equals("Pakistan")){
                    intent.putExtra("Country","Pakistan");
                    startActivity(intent);
                }
                if(Country[position].equals("USA")){
                    intent.putExtra("Country","USA");
                    startActivity(intent);
                }
            }
        });
    }
}
