package com.example.swiatla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    ArrayList<String> states = new ArrayList<String>(Arrays.asList("stop","ready","go","brake"));

    ImageView red, yellow, green;
    Button red_on, yellow_on, green_on;
    boolean previous_red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red_on = (Button)findViewById(R.id.buttonR);
        red_on.setOnClickListener(this);
        yellow_on = (Button)findViewById(R.id.buttonY);
        yellow_on.setOnClickListener(this);
        green_on = (Button)findViewById(R.id.buttonG);
        green_on.setOnClickListener(this);

        red = (ImageView)findViewById(R.id.imageViewR);
        yellow = (ImageView)findViewById(R.id.imageViewY);
        green = (ImageView)findViewById(R.id.imageViewG);

        red_on.setClickable(false);
        yellow_on.setClickable(true);
        green_on.setClickable(false);
        previous_red = true;

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == red_on.getId()){
            red.setImageResource(R.drawable.red_on);
            yellow.setImageResource(R.drawable.light_off);
            green.setImageResource(R.drawable.light_off);

            red_on.setClickable(false);
            yellow_on.setClickable(true);
            green_on.setClickable(false);
            previous_red = true;
        }
        if (v.getId() == yellow_on.getId()){
            yellow.setImageResource(R.drawable.yellow_on);
            green.setImageResource(R.drawable.light_off);
            if( previous_red == true){
                red_on.setClickable(false);
                yellow_on.setClickable(false);
                green_on.setClickable(true);
            }
            else{
                red_on.setClickable(true);
                yellow_on.setClickable(false);
                green_on.setClickable(false);
            }
        }

        if (v.getId() == green_on.getId()){
            red.setImageResource(R.drawable.light_off);
            yellow.setImageResource(R.drawable.light_off);
            green.setImageResource(R.drawable.green_on);

            red_on.setClickable(false);
            yellow_on.setClickable(true);
            green_on.setClickable(false);
            previous_red = false;
        }
    }

}