package com.example.mostofa.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bangla extends AppCompatActivity {

    private Button banglabutton1,banglabutton2,banglabutton3,banglabutton4,banglabutton5,banglabutton6,banglabutton7,banglabutton8,banglabutton9,banglabutton10,banglabutton11,banglabutton12,banglabutton13,banglabutton14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        banglabutton1 = (Button) findViewById(R.id.banglaid1);
        banglabutton2 = (Button) findViewById(R.id.banglaid2);
        banglabutton3 = (Button) findViewById(R.id.banglaid3);
        banglabutton4 = (Button) findViewById(R.id.banglaid4);
        banglabutton5 = (Button) findViewById(R.id.banglaid5);
        banglabutton6 = (Button) findViewById(R.id.banglaid6);
        banglabutton7 = (Button) findViewById(R.id.banglaid7);
        banglabutton8 = (Button) findViewById(R.id.banglaid8);
        banglabutton9 = (Button) findViewById(R.id.banglaid9);
        banglabutton10 = (Button) findViewById(R.id.banglaid10);
        banglabutton11 = (Button) findViewById(R.id.banglaid11);
        banglabutton12 = (Button) findViewById(R.id.banglaid12);
        banglabutton13 = (Button) findViewById(R.id.banglaid13);
        banglabutton14 = (Button) findViewById(R.id.banglaid14);
        banglabutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton1();
            }


        });
        banglabutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton2();
            }


        });
        banglabutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton3();
            }


        });
        banglabutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton4();
            }


        });
        banglabutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton5();
            }


        });
        banglabutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton6();
            }


        });
        banglabutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton7();
            }


        });
        banglabutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton8();
            }


        });
        banglabutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton9();
            }


        });
        banglabutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton10();
            }


        });
        banglabutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton11();
            }


        });
        banglabutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton12();
            }


        });
        banglabutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton13();
            }


        });
        banglabutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscrenbanglabutton14();
            }


        });

    }
    public  void openscrenbanglabutton1(){
        Intent intent = new Intent(this, banglaid1.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton2(){
        Intent intent = new Intent(this, banglaid2.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton3(){
        Intent intent = new Intent(this, banglaid3.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton4(){
        Intent intent = new Intent(this, banglaid4.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton5(){
        Intent intent = new Intent(this, banglaid5.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton6(){
        Intent intent = new Intent(this, banglaid6.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton7(){
        Intent intent = new Intent(this, banglaid7.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton8(){
        Intent intent = new Intent(this, banglaid8.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton9(){
        Intent intent = new Intent(this, banglaid9.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton10(){
        Intent intent = new Intent(this, banglaid10.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton11(){
        Intent intent = new Intent(this, banglaid11.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton12(){
        Intent intent = new Intent(this, banglaid12.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton13(){
        Intent intent = new Intent(this, banglaid13.class);
        startActivity(intent);
    }
    public  void openscrenbanglabutton14(){
        Intent intent = new Intent(this, banglaid14.class);
        startActivity(intent);
    }
}

