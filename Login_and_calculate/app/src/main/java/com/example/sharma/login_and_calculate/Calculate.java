package com.example.sharma.login_and_calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;

import static java.lang.Integer.parseInt;

public class Calculate extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        EditText edttxt=(EditText) findViewById(R.id.edttxt);;
        Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,divide,mul,equal,allcut,cut;

        zero=(Button) findViewById(R.id.zero);
        one=(Button) findViewById(R.id.one);
        two =(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);
        six=(Button) findViewById(R.id.six);
        seven=(Button) findViewById(R.id.seven);
        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.multiply);
        divide=(Button) findViewById(R.id.divide);
        allcut=(Button) findViewById(R.id.allcut);
        cut=(Button) findViewById(R.id.cut);
        equal=(Button) findViewById(R.id.equal);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        divide.setOnClickListener(this);
        allcut.setOnClickListener(this);
        cut.setOnClickListener(this);
        equal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText edttxt=(EditText) findViewById(R.id.edttxt);;
        Button zero,one,two,three,four,five,six,seven,eight,nine,add,sub,divide,mul,equal,allcut,cut;

        int temp = 0;

        if(v.getId()==R.id.one){
            edttxt.setText(edttxt.getText().toString()+"1");
        }
        if(v.getId()==R.id.two){
            edttxt.setText(edttxt.getText().toString()+"2");
        }
        if(v.getId()==R.id.three){
            edttxt.setText(edttxt.getText().toString()+"3");
        }
        if(v.getId()==R.id.four){
            edttxt.setText(edttxt.getText().toString()+"4");
        }
        if(v.getId()==R.id.five){
            edttxt.setText(edttxt.getText().toString()+"5");
        }
        if(v.getId()==R.id.six){
            edttxt.setText(edttxt.getText().toString()+"6");
        }
        if(v.getId()==R.id.seven){
            edttxt.setText(edttxt.getText().toString()+"7");
        }
        if(v.getId()==R.id.eight){
            edttxt.setText(edttxt.getText().toString()+"8");
        }
        if(v.getId()==R.id.nine){
            edttxt.setText(edttxt.getText().toString()+"9");
        }
        if(v.getId()==R.id.zero){
            edttxt.setText(edttxt.getText().toString()+"0");
        }
        if(v.getId()==R.id.add){
            edttxt.setText(edttxt.getText().toString()+"+");
        }
        if(v.getId()==R.id.sub){
            edttxt.setText(edttxt.getText().toString()+"-");
        }
        if(v.getId()==R.id.multiply){
            edttxt.setText(edttxt.getText().toString()+"*");
        }
        if(v.getId()==R.id.divide){
            edttxt.setText(edttxt.getText().toString()+"/");
        }
        if(v.getId()==R.id.allcut){
            edttxt.setText("");
        }
        if(v.getId()==R.id.cut){
            String s=edttxt.getText().toString();
            edttxt.setText(s.substring(0,s.length()-1));
        }
        if(v.getId() == R.id.equal) {
            BigDecimal result = null;
            Expression expression = new Expression(edttxt.getText().toString());
            result = expression.eval();
            edttxt.setText(result.toString());
        }

    }
}
