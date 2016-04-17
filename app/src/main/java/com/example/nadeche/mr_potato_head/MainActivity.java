package com.example.nadeche.mr_potato_head;

/*
* Nadeche Studer
* nadeche.studer@gmail.com
* (Apologies for the project name. I stated the project in the previous course,
* it then had different requirements)
* */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /*Check which body parts should be displayed after orientation change
        * and display the body parts that are checked*/

        checkBoxChecked(findViewById(R.id.arms_check));
        checkBoxChecked(findViewById(R.id.ears_check));
        checkBoxChecked(findViewById(R.id.eyebrows_check));
        checkBoxChecked(findViewById(R.id.eyes_check));
        checkBoxChecked(findViewById(R.id.glasses_check));
        checkBoxChecked(findViewById(R.id.hat_check));
        checkBoxChecked(findViewById(R.id.mouth_check));
        checkBoxChecked(findViewById(R.id.mustache_check));
        checkBoxChecked(findViewById(R.id.nose_check));
        checkBoxChecked(findViewById(R.id.shoes_check));
    }

    //check which check box is checked or unchecked and display accordingly
    void checkBoxChecked(View check){

        //property
        ImageView body_part;

        //is the box now checked?
        boolean checked = ((CheckBox) check).isChecked();

        //which box is checked or unchecked and get the corresponding image id?
        switch (check.getId()) {
            case R.id.arms_check:
                body_part = (ImageView) findViewById(R.id.arms);
                break;
            case R.id.ears_check:
                body_part = (ImageView) findViewById(R.id.ears);
                break;
            case R.id.eyebrows_check:
                body_part = (ImageView) findViewById(R.id.eyebrows);
                break;
            case R.id.eyes_check:
                body_part = (ImageView) findViewById(R.id.eyes);
                break;
            case R.id.glasses_check:
                body_part = (ImageView) findViewById(R.id.glasses);
                break;
            case R.id.hat_check:
                body_part = (ImageView) findViewById(R.id.hat);
                break;
            case R.id.mouth_check:
                body_part = (ImageView) findViewById(R.id.mouth);
                break;
            case R.id.mustache_check:
                body_part = (ImageView) findViewById(R.id.mustache);
                break;
            case R.id.nose_check:
                body_part = (ImageView) findViewById(R.id.nose);
                break;
            case R.id.shoes_check:
                body_part = (ImageView) findViewById(R.id.shoes);
                break;
            default:
                return;
        }

        //display the checked or unchecked body part accordingly
        if(body_part != null) {
            if (checked)
                body_part.setVisibility(View.VISIBLE);
            else
                body_part.setVisibility(View.INVISIBLE);
        }

    }
}
