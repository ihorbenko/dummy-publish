package com.example.testframework;

import android.app.Activity;
import android.util.Log;

public class Worker {

    private Activity activity = null;

    public Worker(Activity someActivity) {
        this.activity = someActivity;
    }

    public void init(String config) {
        Log.i("INIT", String.format("Config is:", config));
    }
}
