package com.example.activity3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activity4.Welcome;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    public EditText email,password;
    public Button btsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.edEmail);
        password = findViewById(R.id.edPassword);
        btsignin = findViewById(R.id.btsignIn);

        btsignin.setOnClickListener(new View.OnClickListener() {
            private String muhammadnoorsaputro23;
            private Thread view;

            @Override
            public void onClick(View v) {
                if (view.getId() == R.id.btsignIn) {

                    String ambilemail = email.getText().toString().trim();
                    String ambilpassword = password.getText().toString().trim();

                    if (ambilemail.equals(muhammadnoorsaputro23) && ambilpassword.equals(123456)) {
                        Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, Welcome.class);
                        MainActivity.this.startActivity(getIntent());
                        finish();
                    } else {
                        //jika login gagal
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Email atau Password Anda salah!")
                                .setNegativeButton("Retry", null).create().show();
                    }
                }
            }
        });
    }
}


