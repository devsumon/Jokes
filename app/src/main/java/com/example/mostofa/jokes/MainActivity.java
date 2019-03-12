package com.example.mostofa.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button banglabutton, englishbutton, aboutbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banglabutton = (Button) findViewById(R.id.button_one);
        englishbutton = (Button) findViewById(R.id.button_two);
        aboutbutton = (Button) findViewById(R.id.button_three);


        banglabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbangla();
            }
        });
        englishbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenenglish();
            }
        });
        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenabout();
            }
        });

    }
    public  void openscrenbangla(){
        Intent intent = new Intent(this, bangla.class);
        startActivity(intent);
    }

    public  void openscrenenglish(){
        Intent intent = new Intent(this, english.class);
        startActivity(intent);
    }

    public  void openscrenabout(){
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }




}