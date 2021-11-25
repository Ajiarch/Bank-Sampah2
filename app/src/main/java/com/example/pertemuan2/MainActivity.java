package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow_1);
    }

    public void login(View view) {
        Button button=(Button)findViewById(R.id.Masukbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, HomeActivity.class);
                Toast toast = Toast.makeText(v.getContext(), "Login Berhasil", Toast.LENGTH_SHORT);
                toast.show();
                setContentView(R.layout.home);
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
