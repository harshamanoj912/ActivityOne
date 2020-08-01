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

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("lifecycle",  "onStart() called" );
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("lifecycle",  "onResume() called" );
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("lifecycle",  "onStop() called" );
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("lifecycle",  "onDestroy() called" );
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("lifecycle",  "onPause() called" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("lifecycle",  "onRestart() called" );
    }

}