package com.example.assignment_2_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("abc","On create called");

    }

    @Override
    protected void onStart() {
        Log.d("abc","On start called");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("abc","On resume called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("abc","On pause called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("abc","On stop called");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("abc","On restart called");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("abc","On destroy called");
        super.onDestroy();
    }
}