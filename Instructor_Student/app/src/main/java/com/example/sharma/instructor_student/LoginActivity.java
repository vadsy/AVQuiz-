package com.example.sharma.instructor_student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    Button login;

    String Instructoruname ="I";
    String Instructorpassw ="I";

    String Studentuname ="S";
    String Studentpassw ="S";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Intent Iintent = new Intent(LoginActivity.this,Instructor_Screen.class);
        final Intent Sintent = new Intent(LoginActivity.this,Student_screen.class);

        username=(EditText) findViewById(R.id.user);
        password=(EditText) findViewById(R.id.pass);
        login=(Button) findViewById(R.id.log_in);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Instructoruname.equals(username.getText().toString()) && Instructorpassw.equals(password.getText().toString())){
                    Iintent.putExtra("username",Instructoruname);
                    //Toast.makeText(getApplicationContext(),"A Instructor has been logged in",Toast.LENGTH_LONG).show();
                    startActivity(Iintent);
                }

                if(Studentuname.equals(username.getText().toString()) && Studentpassw.equals(password.getText().toString())){
                    Iintent.putExtra("username",Studentuname);
                    //Toast.makeText(getApplicationContext(),"A student has been logged in",Toast.LENGTH_LONG).show();
                    startActivity(Sintent);
                }
            }
        });

    }
}
