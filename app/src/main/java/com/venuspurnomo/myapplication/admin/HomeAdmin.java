package com.venuspurnomo.myapplication.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.venuspurnomo.myapplication.R;

public class HomeAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        getSupportActionBar().hide();
    }
}