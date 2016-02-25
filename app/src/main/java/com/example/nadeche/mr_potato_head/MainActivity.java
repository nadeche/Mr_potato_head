package com.example.nadeche.mr_potato_head;

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

    public void checkBoxChecked(View box){

        //is the box now checked?
        boolean checked = ((CheckBox) box).isChecked();
        ImageView body_part;

        //which box is checked or unchecked?
        switch (box.getId()) {
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

        if(checked)
            body_part.setVisibility(View.VISIBLE);
        else
            body_part.setVisibility(View.INVISIBLE);
    }
}
