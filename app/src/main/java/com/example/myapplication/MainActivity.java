package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnclick(View view) {
        EditText value = (EditText) findViewById(R.id.value);
        String dollars = value.getText().toString();
        Double doubledollars = Double.parseDouble(dollars);
        Double doubleInr = 75.04 * doubledollars;
        String toastText = "₹ " + doubleInr.toString() + "";

        Toast.makeText(this,toastText,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

