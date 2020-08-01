package com.it19208718.ActivityOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtMgs2 = findViewById(R.id.tvMsg2);

        txtMgs2.setText(R.string.Msg2);


        Log.i("lifecycle",  "onCreate() called" );

    }



}