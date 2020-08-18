package com.example.labrevision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent2 = getIntent();
        String Reader = intent2.getStringExtra("ReaderName");

        Toast toast = Toast.makeText(getApplicationContext(),"Welcome " + Reader + "...please enter what you read",Toast.LENGTH_SHORT);
        toast.show();
    }
}
