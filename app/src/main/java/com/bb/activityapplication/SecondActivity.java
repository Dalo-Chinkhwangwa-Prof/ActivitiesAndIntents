package com.bb.activityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String VALUE_KEY = "SecondActivity.key";
    private static final String TAG = "TAG_X" ;

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);


        String fromMain = getIntent().getStringExtra(VALUE_KEY);

        textView.setText(fromMain);
        Log.d(TAG, "onCreate: B");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: B");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: B");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: B");
    }
}
