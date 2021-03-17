package com.example.geometria;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import static java.lang.Math.PI;

public class Kolo extends AppCompatActivity {

    Button calculate;
    TextView result;
    EditText side, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolo);

        calculate = (Button) findViewById(R.id.buttonKol);
        side = (EditText) findViewById(R.id.editTextKol1);
        result = (TextView) findViewById(R.id.textViewKol);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText((Double.parseDouble(side.getText().toString())
                        * Double.parseDouble(side.getText().toString())*PI) + "");
            }
        });
    }
}