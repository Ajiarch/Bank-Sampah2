package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText txtemail, txtpass;
    public Button login;
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow_1);

    }

    public void login(View view) {
        txtemail = (EditText) findViewById(R.id.entry_email);
        txtpass = (EditText) findViewById(R.id.entry_password);
        login = (Button) findViewById(R.id.masukbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtemail.getText().toString().equals("admin") && txtpass.getText().toString().equals("admin")){
                    Intent login = new Intent(MainActivity.this, HomeActivity.class);
                    Toast toast = Toast.makeText(v.getContext(), "Login Berhasil", Toast.LENGTH_SHORT);
                    toast.show();
                    MainActivity.this.startActivity(login);
                }
                else {
                    Toast.makeText(MainActivity.this, "Email atau Password Salah atau Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");

        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"onResume");

        Toast.makeText(MainActivity.this, "Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"onPause");

        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"onStop");

        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"onDestroy");
    }

    public void pindah(View view) {
        setContentView(R.layout.activity_main);
    }

    public void lanjut(View view) {
        setContentView(R.layout.slideshow_2);
    }

    public void lanjut2(View view) {
        setContentView(R.layout.slideshow_3);
    }

    public void kembali(View view) {
        setContentView(R.layout.slideshow_1);
    }

    public void kembali2(View view) {
        setContentView(R.layout.slideshow_2);
    }
}
