package com.example.theconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view){
        EditText dollerAmount = (EditText) findViewById(R.id.dollerAmount);
        String dollars = dollerAmount.getText().toString();
        Double doubleDollers = Double.parseDouble(dollars);
        Double doubleInr = 74.37 * doubleDollers;
        String toastText = "= " + doubleInr.toString() + " $";

        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}