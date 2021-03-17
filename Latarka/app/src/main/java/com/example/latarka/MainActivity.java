package com.example.latarka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvLight;
    Button red, green, blue;
    int r=0, g=0,b=0, a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLight = (TextView)findViewById(R.id.textView);
        red = (Button)findViewById(R.id.button1);
        red.setOnClickListener(this);
        green = (Button)findViewById(R.id.button2);
        green.setOnClickListener(this);
        blue = (Button)findViewById(R.id.button3);
        blue.setOnClickListener(this);

        SeekBar s = (SeekBar)findViewById(R.id.seekBar);
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean bool){
                a = 100 - i;
                int backColor = Color.argb(a, r, g, b);
                tvLight.setBackgroundColor(backColor);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){
            }

        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == red.getId()){
            r = 255;
            g = 0;
            b = 0;
        }
        if (view.getId() == green.getId()){
            r = 0;
            g = 255;
            b = 0;
        }
        if (view.getId() == blue.getId()){
            r = 0;
            g = 0;
            b = 255;
        }
        int backColor = Color.argb(a,r,g,b);
        tvLight.setBackgroundColor(backColor);
    }


}