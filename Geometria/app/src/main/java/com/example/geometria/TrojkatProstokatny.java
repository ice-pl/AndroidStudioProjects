package com.example.geometria;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class TrojkatProstokatny extends AppCompatActivity {

    Button calculate;
    TextView result;
    EditText side, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trojkat_prostokatny);

        calculate = (Button) findViewById(R.id.buttonTrp);
        side = (EditText) findViewById(R.id.editTextTrp1);
        height = (EditText) findViewById(R.id.editTextTrp2);
        result = (TextView) findViewById(R.id.textViewTrp);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText((Double.parseDouble(side.getText().toString())
                        * Double.parseDouble(height.getText().toString())*0.5) + "");
            }
        });
    }
}