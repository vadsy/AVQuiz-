package com.example.sharma.instructor_student;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Student_screen extends AppCompatActivity {
    Button picupload,callingbutton;
    ImageView mypic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_screen);

        Intent i = getIntent();
        String username = i.getStringExtra("username");
        Toast.makeText(this,"Welcome "+username,Toast.LENGTH_LONG).show();

        picupload=(Button)findViewById(R.id.pbutton);
        callingbutton=(Button)findViewById(R.id.cbutton);

        mypic=(ImageView)findViewById(R.id.imageview);

        final Intent takepicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        picupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(takepicture,101);
            }
        });

        callingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0123456789"));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==101){
            if(requestCode==RESULT_OK){
                Bundle extrabundle =data.getExtras();
                Bitmap imageBitmap =(Bitmap)extrabundle.get("data");
                mypic.setImageBitmap(imageBitmap);
            }
            else if(resultCode==RESULT_CANCELED){
                Toast.makeText(this,"user cancelled uploading",Toast.LENGTH_LONG).show();
            }
        }
    }
}
