package com.example.zgadnij;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.text.TextUtils.isEmpty;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity{

//    int liczba = 56;
    Button calculate, restart;
    EditText liczba;
    TextView result;
    TextView counter;
//    TextView podglad;


    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate = (Button) findViewById(R.id.button);
        liczba = (EditText)findViewById(R.id.editTextTextLiczba);
        result = (TextView)findViewById(R.id.textView);
        counter = (TextView)findViewById(R.id.textView2);


        int min =-20;
        int max = 20;
        wylosowana(min, max);


        final int wylosowana = wylosowana(min, max);

        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                counter.setText(String.valueOf(count));

                if(TextUtils.isEmpty(liczba.getText().toString())) {
                    result.setText(" ..puste pole \nw próbie nr " + counter.getText() );
                    count--;
                    return;
                }

                int wstawiona = Integer.parseInt(liczba.getText().toString().replaceAll("[.,].*", ""));
                if(wstawiona < min || wstawiona > max) {
                    Toast.makeText(MainActivity.this, "losowane są \nliczby z zakresu \nod "+min+" do "+max,Toast.LENGTH_LONG).show();
                    liczba.setText("");
                    result.setText("");
                    count--;
                    return;
                }

                if(wstawiona == wylosowana) {
                    result.setText(" ..OK w próbie nr " + counter.getText());
                    liczba.setText("");
                }
                else if(wstawiona > wylosowana) {
                    result.setText(" ..za dużo");
                    liczba.setText("");
                }
                else {
                    result.setText(" ..za mało");
                    liczba.setText("");
                }
            }
        });


    }
        public int wylosowana(int min, int max){
            return new Random().nextInt((max - min) + 1) + min;
        }
}