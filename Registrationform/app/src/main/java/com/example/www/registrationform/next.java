package com.example.www.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class next extends AppCompatActivity {

    TextView name,phone,email,state,city;
    Button edit_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        name = (TextView)findViewById(R.id.name);
        phone = (TextView)findViewById(R.id.Phone);
        email = (TextView)findViewById(R.id.email);
        state = (TextView)findViewById(R.id.State);
        city = (TextView)findViewById(R.id.city);

        edit_details=(Button)findViewById(R.id.Editb) ;

        Intent intent =getIntent();

        final Intent i =new Intent(getApplicationContext(),MainActivity.class);

        String username = intent.getStringExtra("name");
        String userphone = intent.getStringExtra("phone");
        String useremail = intent.getStringExtra("email");
        String userstate = intent.getStringExtra("state");
        String usercity = intent.getStringExtra("city");

        name.setText(username);
        phone.setText(userphone);
        email.setText(useremail);
        state.setText(userstate);
        city.setText(usercity);

        edit_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("name",name.getText().toString());
                i.putExtra("phone",phone.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("state",state.getText().toString());
                i.putExtra("city",city.getText().toString());
                startActivity(i);
            }
        });
    }
}
