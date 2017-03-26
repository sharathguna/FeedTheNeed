package com.example.alientrunkcall.feedtheneed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Citybutton extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citybutton);
        b1 = (Button) findViewById(R.id.ban);
        b2 = (Button) findViewById(R.id.mum);
        b3 = (Button) findViewById(R.id.del);
        b4 = (Button) findViewById(R.id.kol);
        b5 = (Button) findViewById(R.id.hyd);
        b6 = (Button) findViewById(R.id.che);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Citybutton.this, Bangalore.class);
                startActivity(j);
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Citybutton.this,Mumbai.class);
                startActivity(j);
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Citybutton.this,Delhi.class);
                startActivity(j);
            }

        });
    }
}
