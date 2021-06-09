package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    class number
    {
        int num;
        public boolean isTraingular()
        {
            int a=1;
            int traingular_number=1;

            while(traingular_number<num)
            {
                a++;
                traingular_number=traingular_number+a;
            }
            if(traingular_number==num)
            {
                return true;
            }
            else
                return false;
        }
        public boolean isSquare()
        {
            double squareRoot =Math.sqrt(num);
            if(squareRoot==Math.floor(squareRoot))
                return true;
            else return false;
        }
    }


    public void checkNumber(View view)
    {
        String message="";
        EditText input_number=findViewById(R.id.editTextNumber);
        if(input_number.getText().toString().isEmpty())
        {
            message="Please enter a number!";
        }
        else {
            number mynum = new number();
            mynum.num = Integer.parseInt(input_number.getText().toString());

            if (mynum.isSquare()) {
                if (mynum.isTraingular()) {
                    message = mynum.num + " is both a sqaure and triangular number";
                } else {
                    message = mynum.num + " is a sqaure number.";
                }
            } else if (mynum.isTraingular()) {
                message = mynum.num + "is a triangular number.";
            } else
                message = "It is neither traingular nor a square number";
        }
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}