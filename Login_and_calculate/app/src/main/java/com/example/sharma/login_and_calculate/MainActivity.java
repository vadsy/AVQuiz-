package com.example.sharma.login_and_calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;

    Button login;

    String uname ="A";
    String passw ="A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(MainActivity.this,Calculate.class);

            username=(EditText) findViewById(R.id.user);
            password=(EditText) findViewById(R.id.pass);
            login=(Button) findViewById(R.id.log_in);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(uname.equals(username.getText().toString()) && passw.equals(password.getText().toString())){
                        Toast.makeText(getApplicationContext(),"You have been logged in",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                }
            });

    }
}
