package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setDisplayShowCustomEnabled(true);
//        getLayoutInflater();
//        getLayoutInflater(inflater = this.getSystemService(Context) );
    }
}