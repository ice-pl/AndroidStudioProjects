package com.example.kolkokrzyzyk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView kom11,kom12,kom13;
    ImageView kom21,kom22,kom23;
    ImageView kom31,kom32,kom33;

    String last_player;
    String obraz;
    String pusty_obraz = "white";

    Button again;

    TextView winsX, winsO;

    int current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kom11 = (ImageView)findViewById(R.id.imageView11);
        kom12 = (ImageView)findViewById(R.id.imageView12);
        kom13 = (ImageView)findViewById(R.id.imageView13);

        kom21 = (ImageView)findViewById(R.id.imageView21);
        kom22 = (ImageView)findViewById(R.id.imageView22);
        kom23 = (ImageView)findViewById(R.id.imageView23);

        kom31 = (ImageView)findViewById(R.id.imageView31);
        kom32 = (ImageView)findViewById(R.id.imageView32);
        kom33 = (ImageView)findViewById(R.id.imageView33);

        kom11.setOnClickListener(this);
        kom12.setOnClickListener(this);
        kom13.setOnClickListener(this);

        kom21.setOnClickListener(this);
        kom22.setOnClickListener(this);
        kom23.setOnClickListener(this);

        kom31.setOnClickListener(this);
        kom32.setOnClickListener(this);
        kom33.setOnClickListener(this);

        winsX = (TextView)findViewById(R.id.textViewX);
        winsO = (TextView)findViewById(R.id.textViewO);

        winsX.setText("0");
        winsO.setText("0");

        again = (Button)findViewById(R.id.button1);
        again.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        if(last_player == "X") {
            last_player = "O";
            obraz = "circle_blue";
        }else{
            last_player = "X";
            obraz = "cross_red";
        }


        if (view.getId() == kom11.getId()){
            kom11.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom11.setTag(obraz);
        }
        if (view.getId() == kom12.getId()){
            kom12.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom12.setTag(obraz);
        }
        if (view.getId() == kom13.getId()){
            kom13.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom13.setTag(obraz);
        }
        if (view.getId() == kom21.getId()){
            kom21.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom21.setTag(obraz);
        }
        if (view.getId() == kom22.getId()){
            kom22.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom22.setTag(obraz);
        }
        if (view.getId() == kom23.getId()){
            kom23.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom23.setTag(obraz);
        }
        if (view.getId() == kom31.getId()){
            kom31.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom31.setTag(obraz);
        }
        if (view.getId() == kom32.getId()){
            kom32.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom32.setTag(obraz);
        }
        if (view.getId() == kom33.getId()){
            kom33.setImageResource(getResources().getIdentifier(obraz, "drawable", getPackageName()));
            kom33.setTag(obraz);
        }

        if (view.getId() == again.getId()) {
            kom11.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom12.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom13.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));

            kom21.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom22.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom23.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));

            kom31.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom32.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            kom33.setImageResource(getResources().getIdentifier(pusty_obraz, "drawable", getPackageName()));
            enable_all();
        }




        if (kom11.getTag() == kom12.getTag() && kom12.getTag() == kom13.getTag()){
            System.out.println("gorny rzad");
            System.out.println(last_player);
            winner();
        }
        if (kom21.getTag() == kom22.getTag() && kom22.getTag() == kom23.getTag()){
            System.out.println("srodkowy rzad");
            System.out.println(last_player);
            winner();
        }
        if (kom31.getTag() == kom32.getTag() && kom32.getTag() == kom33.getTag()){
            System.out.println("dolny rzad");
            System.out.println(last_player);
            winner();
        }

        if (kom11.getTag() == kom21.getTag() && kom21.getTag() == kom31.getTag()){
            System.out.println("lewa kolumna");
            System.out.println(last_player);
            winner();
        }
        if (kom12.getTag() == kom22.getTag() && kom22.getTag() == kom32.getTag()){
            System.out.println("srodkowa kolumna");
            System.out.println(last_player);
            winner();
        }
        if (kom13.getTag() == kom23.getTag() && kom23.getTag() == kom33.getTag()){
            System.out.println("prawa kolumna");
            System.out.println(last_player);
            winner();
        }

        if (kom11.getTag() == kom22.getTag() && kom22.getTag() == kom33.getTag()){
            System.out.println("NW.SE");
            System.out.println(last_player);
            winner();
        }
        if (kom13.getTag() == kom22.getTag() && kom22.getTag() == kom31.getTag()){
            System.out.println("SW.NE");
            System.out.println(last_player);
            winner();
        }



    }

    public void reset_tags(){
        kom11.setTag(11);
        kom12.setTag(12);
        kom13.setTag(13);

        kom21.setTag(21);
        kom22.setTag(22);
        kom23.setTag(23);

        kom31.setTag(31);
        kom32.setTag(32);
        kom33.setTag(33);
    }

    public void diasble_all(){
        kom11.setEnabled(false);
        kom12.setEnabled(false);
        kom13.setEnabled(false);

        kom21.setEnabled(false);
        kom22.setEnabled(false);
        kom23.setEnabled(false);

        kom31.setEnabled(false);
        kom32.setEnabled(false);
        kom33.setEnabled(false);
    }

    public void enable_all(){
        kom11.setEnabled(true);
        kom12.setEnabled(true);
        kom13.setEnabled(true);

        kom21.setEnabled(true);
        kom22.setEnabled(true);
        kom23.setEnabled(true);

        kom31.setEnabled(true);
        kom32.setEnabled(true);
        kom33.setEnabled(true);
    }

    public void winner() {

        if (last_player == "X") {
            current = Integer.parseInt(winsX.getText().toString());
            current = current + 1;
            winsX.setText(current + "");
            reset_tags();
            diasble_all();
        } else {
            current = Integer.parseInt(winsO.getText().toString());
            current = current + 1;
            winsO.setText(current + "");
            reset_tags();
            diasble_all();
        }
    }

}