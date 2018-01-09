package com.example.franc.theapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        Realm.getDefaultInstance();

        checkStartPoint();


    }

    protected void checkStartPoint(){

        /*
         *      Check starting point based on user progress
         */

        You u = new You();
        Intent first = new Intent(this, First.class);
        switch (u.getStartLevel()){

            case 1:
                startActivity(first);
                break;

            case 2:

                break;

            case 3:

                break;

        }

    }
}
