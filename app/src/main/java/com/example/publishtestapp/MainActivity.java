package com.example.publishtestapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testframework.Worker;

public class MainActivity extends AppCompatActivity {

    private Worker worker = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        worker = new Worker(this);
        worker.init("some data");
    }
}
