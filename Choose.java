package com.example.alientrunkcall.feedtheneed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Choose extends AppCompatActivity {
        Button b1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        b1=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent j=new Intent(Choose.this,Citybutton.class);
                        startActivity(j);
                    }

                });





    }
}
