package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kwadrat extends AppCompatActivity {

    Button calculate;
    TextView result;
    EditText side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat);

        calculate = (Button) findViewById(R.id.buttonKwa);
        side = (EditText) findViewById(R.id.editTextKwa);
        result = (TextView) findViewById(R.id.textViewKwa);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText((Double.parseDouble(side.getText().toString())
                        * Double.parseDouble(side.getText().toString())) + "");
            }
        });
    }
}
