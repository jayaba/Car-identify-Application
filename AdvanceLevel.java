package com.example.cwtry2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AdvanceLevel extends AppCompatActivity {
    ImageView ima1, ima2, ima3;
    EditText eda1, eda2, eda3;
    Button bta1, bta2;
    TextView t1,t2,t3,t4;

    int submitCount = 0;//to create

    Integer[] imges1 = {
            R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,
            R.drawable.serius1, R.drawable.serius2, R.drawable.serius3, R.drawable.serius5, R.drawable.serius6, R.drawable.avalon, R.drawable.camry, R.drawable.chr, R.drawable.corolla, R.drawable.prius,
            R.drawable.gla, R.drawable.glb, R.drawable.glc, R.drawable.gls, R.drawable.glv, R.drawable.edge, R.drawable.escape, R.drawable.explorer, R.drawable.gt, R.drawable.mustang,
            R.drawable.altima, R.drawable.leaf, R.drawable.maxima, R.drawable.sentra, R.drawable.versa,
    };

    Random random = new Random();
    int firstRanNumber = random.nextInt(23);

    int secondRanNumber = firstRanNumber + 3;
    int thirdRanNumber = secondRanNumber + 5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_level);



        bta2 = findViewById(R.id.buttonAd);// assign xml submit button to java class
        bta1 = findViewById(R.id.buttonAdvance);//assign next button to java class


        ima1 = findViewById(R.id.imageButtonAd1);
        ima2 = findViewById(R.id.imageButtonAd2);   //assign my imageview xml to java class
        ima3 = findViewById(R.id.imageButtonAd3);


        eda1 = findViewById(R.id.textViewad1);
        eda2 = findViewById(R.id.textViewad2);
        eda3 = findViewById(R.id.textViewad3);
        t1 = findViewById(R.id.textView6);  //assign edittexts and textfield to java class
        t2=findViewById(R.id.textView7);
        t3=findViewById(R.id.textView8);
        t4=findViewById(R.id.textView9);



        ima1.setImageResource(imges1[firstRanNumber]);
        ima2.setImageResource(imges1[secondRanNumber]);//set random images in my imageview
        ima3.setImageResource(imges1[thirdRanNumber]);


    }

    public void advancedNxt(View vw){
        finish();//destroy last activity
        Intent intentAdvanced=new Intent(this,AdvanceLevel.class);//to open new screen
        startActivity(intentAdvanced);
    }

    public void advanced(View v) {
int points=0;//that point user can score
        submitCount = submitCount + 1;






        String getUserInput1 = eda1.getText().toString().toLowerCase();
        String getUserInput2 = eda2.getText().toString().toLowerCase();
        String getUserInput3 = eda3.getText().toString().toLowerCase();

        if (firstRanNumber <= 4 && getUserInput1.equals("audi")) {
            String colorright = "<font color=#49FB00>AUDI</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;



        } else if (firstRanNumber <= 4 && !getUserInput1.contentEquals("audi")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (firstRanNumber > 4 && firstRanNumber <= 9 && getUserInput1.equals("bmw")) {
            String colorright = "<font color=#49FB00>BMW</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;

        } else if (firstRanNumber > 4 && firstRanNumber <= 9 && !getUserInput1.contentEquals("bmw")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;

        } else if (firstRanNumber > 9 && firstRanNumber <= 14 && getUserInput1.equals("toyota")) {
            String colorright = "<font color=#49FB00>TOYOTA</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;

        } else if (firstRanNumber > 9 && firstRanNumber <= 14 && !getUserInput1.contentEquals("toyota")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;

        } else if (firstRanNumber > 14 && firstRanNumber <= 19 && getUserInput1.equals("benz")) {
            String colorright = "<font color=#49FB00>BENZ</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;

        } else if (firstRanNumber > 14 && firstRanNumber <= 19 && !getUserInput1.contentEquals("benz")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (firstRanNumber > 19 && firstRanNumber <= 24 && getUserInput1.equals("ford")) {
            String colorright = "<font color=#49FB00>FORD</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;

        } else if (firstRanNumber > 19 && firstRanNumber <= 24 && !getUserInput1.contentEquals("ford")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (firstRanNumber > 24 && firstRanNumber <= 29 && getUserInput1.equals("nissan")) {
            String colorright = "<font color=#49FB00>NISSAN</font>";
            eda1.setText(Html.fromHtml(colorright));
            eda1.setEnabled(false);
            points++;

        } else if (firstRanNumber > 24 && firstRanNumber <= 29 && !getUserInput1.contentEquals("nissan")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda1.setText(Html.fromHtml(colorWrong));

            points--;

        }

        if (secondRanNumber <= 4 && getUserInput2.equals("audi")) {
            String colorright = "<font color=#49FB00>AUDI</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber <= 4 && !getUserInput2.contentEquals("audi")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));
            points--;

        } else if (secondRanNumber > 4 && secondRanNumber <= 9 && getUserInput2.equals("bmw")) {
            String colorright = "<font color=#49FB00>BMW</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber > 4 && secondRanNumber <= 9 && !getUserInput2.contentEquals("bmw")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));

            points--;

        } else if (secondRanNumber > 9 && secondRanNumber <= 14 && getUserInput2.equals("toyota")) {
            String colorright = "<font color=#49FB00>TOYOTA</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber > 9 && secondRanNumber <= 14 && !getUserInput2.contentEquals("toyota")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));

            points--;

        } else if (secondRanNumber > 14 && secondRanNumber <= 19 && getUserInput2.equals("benz")) {
            String colorright = "<font color=#49FB00>BENZ</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber > 14 && secondRanNumber <= 19 && !getUserInput2.contentEquals("benz")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (secondRanNumber > 19 && secondRanNumber <= 24 && getUserInput2.equals("ford")) {
            String colorright = "<font color=#49FB00>FORD</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber > 19 && secondRanNumber <= 24 && !getUserInput2.contentEquals("ford")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (secondRanNumber > 24 && secondRanNumber <= 29 && getUserInput2.equals("nissan")) {
            String colorright = "<font color=#49FB00>NISSAN</font>";
            eda2.setText(Html.fromHtml(colorright));
            eda2.setEnabled(false);
            points++;

        } else if (secondRanNumber > 24 && secondRanNumber <= 29 && !getUserInput2.contentEquals("nissan")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda2.setText(Html.fromHtml(colorWrong));

            points--;

        }


        if (thirdRanNumber <= 4 && getUserInput3.equals("audi")) {
            String colorright = "<font color=#49FB00>AUDI</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;


        } else if (thirdRanNumber <= 4 && !getUserInput3.contentEquals("audi")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (thirdRanNumber > 4 && thirdRanNumber <= 9 && getUserInput3.equals("bmw")) {
            String colorright = "<font color=#49FB00>BMW</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;

        } else if (thirdRanNumber > 4 && thirdRanNumber <= 9 && !getUserInput3.contentEquals("bmw")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));
            points--;
        } else if (thirdRanNumber > 9 && thirdRanNumber <= 14 && getUserInput3.equals("toyota")) {
            String colorright = "<font color=#49FB00>TOYOTA</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;

        } else if (thirdRanNumber > 9 && thirdRanNumber <= 14 && !getUserInput3.contentEquals("toyota")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));
            points--;


        } else if (thirdRanNumber > 14 && thirdRanNumber <= 19 && getUserInput3.equals("benz")) {
            String colorright = "<font color=#49FB00>BENZ</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;

        } else if (thirdRanNumber > 14 && thirdRanNumber <= 19 && !getUserInput3.contentEquals("benz")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));
            points--;



        } else if (thirdRanNumber > 19 && thirdRanNumber <= 24 && getUserInput3.equals("ford")) {
            String colorright = "<font color=#49FB00>FORD</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;

        } else if (thirdRanNumber > 19 && thirdRanNumber <= 24 && !getUserInput3.contentEquals("ford")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));

            points--;
        } else if (thirdRanNumber > 24 && thirdRanNumber <= 29 && getUserInput3.equals("nissan")) {
            String colorright = "<font color=#49FB00>NISSAN</font>";
            eda3.setText(Html.fromHtml(colorright));
            eda3.setEnabled(false);
            points++;

        } else if (thirdRanNumber > 24 && thirdRanNumber <= 29 && !getUserInput3.contentEquals("nissan")) {
            String colorWrong = "<font color=#FF1212>wrong</font>";
            eda3.setText(Html.fromHtml(colorWrong));

            points--;
        }
        if(points==3){
            t4.setText("Your Score :   3");
        }
        if(points==2){
            t4.setText("Your Score :   2");
        }if(points==-2) {
            t4.setText("Your Score :   1");
        }if(points==-1){
            t4.setText("Your Score :   1");
        }if(points==-3){
            t4.setText("Your Score :   0");
        }if(points==1){
            t4.setText("Your Score :   2");
        }



        if (submitCount == 3) {

            bta1.setVisibility(View.VISIBLE);
            bta2.setVisibility(View.INVISIBLE);




            if (firstRanNumber <= 4 && !getUserInput1.contentEquals("audi")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("audi");

            }
            if (firstRanNumber > 4 && firstRanNumber <= 9 && !getUserInput1.contentEquals("bmw")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("bmw");
            }

            if (firstRanNumber > 9 && firstRanNumber <= 14 && !getUserInput1.contentEquals("toyota")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("toyota");
            }
            if (firstRanNumber > 14 && firstRanNumber <= 19 && !getUserInput1.contentEquals("benz")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("benz");

            }
            if (firstRanNumber > 19 && firstRanNumber <= 24 && !getUserInput1.contentEquals("ford")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("ford");
            }

            if (firstRanNumber > 24 && firstRanNumber <= 29 && !getUserInput1.contentEquals("nissan")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t1.setText(Html.fromHtml(colorWrong));
                t1.setText("nissan");
            }



            if (secondRanNumber <= 4 && !getUserInput2.contentEquals("audi")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("audi");

            }
            if (secondRanNumber > 4 && secondRanNumber <= 9 && !getUserInput2.contentEquals("bmw")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("bmw");
            }

            if (secondRanNumber > 9 && secondRanNumber <= 14 && !getUserInput2.contentEquals("toyota")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("toyota");
            }
            if (secondRanNumber > 14 && secondRanNumber <= 19 && !getUserInput2.contentEquals("benz")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("benz");

            }
            if (secondRanNumber > 19 && secondRanNumber <= 24 && !getUserInput2.contentEquals("ford")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("ford");
            }

            if (secondRanNumber > 24 && secondRanNumber <= 29 && !getUserInput2.contentEquals("nissan")) {
                String colorWrong = "<font color=#FFE302>wrong</font>";
                t2.setText(Html.fromHtml(colorWrong));
                t2.setText("nissan");
            }


















            if (thirdRanNumber <= 4 && !getUserInput3.contentEquals("audi")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("audi");

            }
            if (thirdRanNumber > 4 && thirdRanNumber <= 9 && !getUserInput3.contentEquals("bmw")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("bmw");
            }

            if (thirdRanNumber > 9 && thirdRanNumber <= 14 && !getUserInput3.contentEquals("toyota")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("toyota");
            }
            if (thirdRanNumber > 14 && thirdRanNumber <= 19 && !getUserInput3.contentEquals("benz")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("benz");

            }
            if (thirdRanNumber > 19 && thirdRanNumber <= 24 && !getUserInput3.contentEquals("ford")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("ford");
            }

            if (thirdRanNumber > 24 && thirdRanNumber <= 29 && !getUserInput3.contentEquals("nissan")) {
                String colorWrong = "<font color=#FF1212>wrong</font>";
                eda1.setText(Html.fromHtml(colorWrong));
                t3.setText("nissan");
            }











        }






        }









}