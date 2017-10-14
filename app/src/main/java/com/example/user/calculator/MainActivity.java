package com.example.user.calculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText input1,input2;
    TextView output;

    Button buttonPlus,buttonSub,buttonMult,buttonDiv;

    String value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=(EditText) findViewById(R.id.num1);
        input2=(EditText) findViewById(R.id.num2);
        output=(TextView) findViewById(R.id.showOutput);


        buttonPlus = (Button) findViewById(R.id.plusButton);
        buttonSub = (Button) findViewById(R.id.subButton);
        buttonMult = (Button) findViewById(R.id.multButton);
        buttonDiv = (Button) findViewById(R.id.divButton);
        

        buttonPlus.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        value1=input1.getText().toString();
        value2=input2.getText().toString();

        double num1=Double.parseDouble(value1);
        double num2=Double.parseDouble(value2);


        double result;

        switch (v.getId()){
            case R.id.plusButton:
                result=num1+num2;
                output.setText(""+result);
                break;
            case R.id.subButton:
                result=num1-num2;
                output.setText(""+result);
                break;
            case R.id.multButton:
                result=num1*num2;
                output.setText("" + result);
                break;
            case R.id.divButton:
                result=num1/num2;
                output.setText("" + result);
                break;
            default:
                result=num1-num2;
                output.setText("Please Give Input First");
                break;

        }
    }


//    public void plus(View v){
//        value1=input1.getText().toString();
//        value2=input2.getText().toString();
//
//        double num1=Double.parseDouble(value1);
//        double num2=Double.parseDouble(value2);
//
//        double sum = num1+num2;
//        output.setText(""+sum);
//
//    }
//
//    public void subtrack(View v){
//        value1=input1.getText().toString();
//        value2=input2.getText().toString();
//
//        double num1=Double.parseDouble(value1);
//        double num2=Double.parseDouble(value2);
//
//        double sum = num1-num2;
//        output.setText(""+sum);
//    }
//    public void multiply(View v){
//        value1=input1.getText().toString();
//        value2=input2.getText().toString();
//
//        double num1=Double.parseDouble(value1);
//        double num2=Double.parseDouble(value2);
//
//        double sum = num1*num2;
//        output.setText(""+sum);
//
//    }
//    public void divisor(View v){
//        value1=input1.getText().toString();
//        value2=input2.getText().toString();
//
//        double num1=Double.parseDouble(value1);
//        double num2=Double.parseDouble(value2);
//
//        double sum = num1/num2;
//        output.setText(""+sum);
//    }

}
