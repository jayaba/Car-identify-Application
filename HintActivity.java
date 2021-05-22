package com.example.cwtry2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class HintActivity extends AppCompatActivity {
    TextView t10, t11, t12;

    EditText eda10;
    Button bt1;
    ImageView ima2;
    Integer[] imges1 = {
            R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,
            R.drawable.serius1, R.drawable.serius2, R.drawable.serius3, R.drawable.serius5, R.drawable.serius6,
            R.drawable.avalon, R.drawable.camry, R.drawable.chr, R.drawable.corolla, R.drawable.prius,
            R.drawable.gla, R.drawable.glb, R.drawable.glc, R.drawable.gls, R.drawable.glv,
            R.drawable.edge, R.drawable.escape, R.drawable.explorer, R.drawable.gt, R.drawable.mustang,
            R.drawable.altima, R.drawable.leaf, R.drawable.maxima, R.drawable.sentra, R.drawable.versa,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);







        t10 = findViewById(R.id.textView10);
        t11 = findViewById(R.id.textView11);

        eda10 = findViewById(R.id.editText10);
        bt1 = findViewById(R.id.bt1);
        ima2 = findViewById(R.id.im2);
        t12 = findViewById(R.id.textView12);
        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
Random ranHint=new Random();
int ranHintNum=ranHint.nextInt(29);
ima2.setImageResource(imges1[ranHintNum]);

            }
        });
    }
}








