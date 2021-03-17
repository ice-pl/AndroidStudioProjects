package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView kw = (TextView) findViewById(R.id.textViewKw);
        kw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Kwadrat.class);
                startActivity(i);
            }
        });


        TextView pr = (TextView)findViewById(R.id.textViewPr);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Prostokat.class);
                startActivity(i);
            }
        });


        TextView tr = (TextView)findViewById(R.id.textViewTr);
        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trojkat.class);
                startActivity(i);
            }
        });


        TextView ko = (TextView)findViewById(R.id.textViewKo);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Kolo.class);
                startActivity(i);
            }
        });


        TextView ro = (TextView)findViewById(R.id.textViewRo);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Romb.class);
                startActivity(i);
            }
        });


        TextView tp = (TextView)findViewById(R.id.textViewTp);
        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TrojkatProstokatny.class);
                startActivity(i);
            }
        });

    }
}
