package com.example.www.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText Name,Phone,Email;
    Spinner dstate,dcity;
    ArrayAdapter <String>  stateAdapter,cityadapter;

    String States[]={"Delhi","Punjab"};
    String Delhicity[]={"New Delhi","Purani Delhi","Noida"};
    String Punjabcity[]={"Moga","Mohali","SAS Nagar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name=(EditText)findViewById(R.id.nameet);
        Phone=(EditText)findViewById(R.id.phoneet);
        Email=(EditText)findViewById(R.id.emailet);

//        Intent i =getIntent();
//
//        String username = i.getStringExtra("name");
//        String userphone = i.getStringExtra("phone");
//        String useremail = i.getStringExtra("email");
//        String userstate = i.getStringExtra("state");
//        String usercity = i.getStringExtra("city");
//
//        Name.setText(username);
//        Phone.setText(userphone);
//        Email.setText(useremail);
//        dstate.getSelectedItem().equals(userstate);
//        dcity.getSelectedItem().equals(usercity);

        submit =(Button)findViewById(R.id.submitb);
        final Intent intent = new Intent(getApplicationContext(),next.class);

        dstate = (Spinner)findViewById(R.id.state) ;
        dcity =(Spinner)findViewById(R.id.city);

        stateAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,States);
        dstate.setAdapter(stateAdapter);

        dstate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    cityadapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,Delhicity);
                    dcity.setAdapter(cityadapter);
                }
                if(position==1){
                    cityadapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,Punjabcity);
                    dcity.setAdapter(cityadapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("name",Name.getText().toString());
                intent.putExtra("phone",Phone.getText().toString());
                intent.putExtra("email",Email.getText().toString());
                intent.putExtra("state",dstate.getSelectedItem().toString());
                intent.putExtra("city",dcity.getSelectedItem().toString());
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast.makeText(this,"You clicked "+item.toString(),Toast.LENGTH_LONG).show();

        switch(item.getItemId()){
            case R.id.setting:{
                Intent setting =new Intent(MainActivity.this,Settings.class);
                startActivity(setting);
            }
            case R.id.logout:{
                Toast.makeText(this,"logging you out",Toast.LENGTH_LONG).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
