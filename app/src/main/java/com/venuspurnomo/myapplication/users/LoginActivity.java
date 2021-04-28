package com.venuspurnomo.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.venuspurnomo.myapplication.R;
import com.venuspurnomo.myapplication.admin.HomeAdmin;

public class LoginActivity extends AppCompatActivity {
    Button btnRegister;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnRegister = (Button) findViewById(R.id.btRegister);
        btnLogin = (NoboButton) findViewById(R.id.btLogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdmin.class);
                startActivity(i);
                finish();
            }
        });
    }
}