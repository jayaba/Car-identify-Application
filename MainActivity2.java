package com.example.cwtry2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    Button bt1,b1;
    ImageView img;
    Spinner sp;
    TextView t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Integer[] imges = {
                R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,
                R.drawable.serius1, R.drawable.serius2, R.drawable.serius3, R.drawable.serius5, R.drawable.serius6, R.drawable.avalon, R.drawable.camry, R.drawable.chr, R.drawable.corolla, R.drawable.prius,
                R.drawable.gla, R.drawable.glb, R.drawable.glc, R.drawable.gls, R.drawable.glv, R.drawable.edge, R.drawable.escape, R.drawable.explorer, R.drawable.gt, R.drawable.mustang,
                R.drawable.altima, R.drawable.leaf, R.drawable.maxima, R.drawable.sentra, R.drawable.versa,
        };


            bt1 = findViewById(R.id.button2);
            b1=findViewById(R.id.button1);
            img = findViewById(R.id.im1);
            sp=findViewById(R.id.spinner);
            t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
            ArrayAdapter<String> carAdapter=new ArrayAdapter<String>(MainActivity2.this,
                    android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.cars));
            carAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp.setAdapter(carAdapter);
            bt1.setOnClickListener(new View.OnClickListener() {
                
                @Override
                public void onClick(View v) {

Random randomMain=new Random();
int rNum=randomMain.nextInt(imges.length);
img.setImageResource(imges[rNum]);

ButtonText(bt1);

                    sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            t1.setText(" ");
                            t2.setText(" ");
                            t3.setText(" ");

                            if (rNum <= 4 && position==0) {

                                t1.setText("Correct");

                            }else if(rNum<=4 && position!=0){
                                t2.setText("Wrong");
                                t3.setText("this is AUDI");
                            }

                            else if (rNum > 5 && rNum <= 9 && position==1) {
                                t1.setText("Correct");

                            }else if (rNum > 5 && rNum <= 9 && position!=1) {
                                t2.setText("Wrong");
                                t3.setText("this is bmw");

                            }
                            else if (rNum > 9 && rNum <= 14 && position==2) {
                                t1.setText("Correct");

                            }  else if (rNum > 9 && rNum <= 14 && position!=2) {
                                t2.setText("Wrong");
                                t3.setText("this is toyota");

                            }

                            else if (rNum > 14 && rNum <= 19 && position==3) {
                                t1.setText("Correct");

                            }else if(rNum > 14 && rNum <= 19 && position!=3){
                                t2.setText("Wrong");
                                t3.setText("this is benz");
                            }

                            else if (rNum > 19 && rNum <= 24 && position==4) {
                                t1.setText("Correct");
                            }
                            else if (rNum > 19 && rNum <= 24 && position!=4) {
                                t2.setText("Wrong");
                                t3.setText("this is ford");
                            }
                            else if (rNum > 24 && rNum <= 29 && position==5) {
                                t1.setText("Correct");
                            }else if (rNum > 24 && rNum <= 29 && position!=5) {
                                t2.setText("Wrong");
                                t3.setText("this is nissan");
                            }


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }

                    });

                }



            });

        }
        public void ButtonText(View v){
            v.setEnabled(true);
            Button button=(Button) v;
            bt1.setText("NEXT");
    }
}