package com.tradennn1.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tradennn1.counter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container,new com.tradennn1.counter.FirstFragment()).commit();
    }
}