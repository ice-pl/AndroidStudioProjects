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

    String red_states[] = new String[] {"red_on", "red_on", "light_off", "light_off"};
    String yellow_states[] = new String[] {"light_off", "yellow_on", "light_off", "yellow_on"};
    String green_states[] = new String[] {"light_off", "light_off", "green_on", "light_off"};


    ImageView red, yellow, green;
    Button red_on, yellow_on, green_on;

    Button next;
    int i = 0;

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

        next = yellow_on;

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == next.getId()) {
            i++;
            i=i%4;
            System.out.println(i);
            switch(i) {
                case 0:
                    next = yellow_on;
                    break;
                case 1:
                    next = green_on;
                    break;
                case 2:
                    next = yellow_on;
                    break;
                case 3:
                    next = red_on;
                    break;
            }
        }
        red.setImageResource(getResources().getIdentifier(red_states[i], "drawable", getPackageName()));
        yellow.setImageResource(getResources().getIdentifier(yellow_states[i], "drawable", getPackageName()));
        green.setImageResource(getResources().getIdentifier(green_states[i], "drawable", getPackageName()));

    }

}