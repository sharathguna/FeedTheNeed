package com.example.alientrunkcall.feedtheneed;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int len=1000;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mi = new Intent(MainActivity.this, Menu.class);
                MainActivity.this.startActivity(mi);
                MainActivity.this.finish();
            }
        }, len);*/
        b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent j=new Intent(MainActivity.this,Choose.class);
                startActivity(j);
            }

        });
    }
}
