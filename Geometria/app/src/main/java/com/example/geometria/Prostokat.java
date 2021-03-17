package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prostokat extends AppCompatActivity {

    Button calculate;
    TextView result;
    EditText side1, side2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostokat);

        calculate = (Button) findViewById(R.id.buttonPro);
        side1 = (EditText) findViewById(R.id.editTextPro1);
        side2 = (EditText) findViewById(R.id.editTextPro2);
        result = (TextView) findViewById(R.id.textViewPro);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText((Double.parseDouble(side1.getText().toString())
                        * Double.parseDouble(side2.getText().toString())) + "");
            }
        });
    }
}
