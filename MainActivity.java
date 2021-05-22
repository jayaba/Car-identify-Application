package com.example.cwtry2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bt,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHint=new Intent(MainActivity.this,HintActivity.class);
                startActivity(intentHint);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMakeIdentify=new Intent(MainActivity.this,IdentifyCarImage.class);
                startActivity(intentMakeIdentify);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAdvanced=new Intent(MainActivity.this,AdvanceLevel.class);
                startActivity(intentAdvanced);
            }
        });
    }
}