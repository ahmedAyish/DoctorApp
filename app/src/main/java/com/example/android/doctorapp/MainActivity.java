package com.example.android.doctorapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new splash().execute();

    }
    private class splash extends AsyncTask{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            View v = findViewById(R.id.splash);
            v.setVisibility(View.VISIBLE);
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            try{
                Thread.sleep(4000);
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            View v = findViewById(R.id.splash);
            v.setVisibility(View.GONE);
        }
    }
}
