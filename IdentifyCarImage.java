package com.example.cwtry2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class IdentifyCarImage extends AppCompatActivity {
    ImageView imb1, imb2, imb3;
    Button bt1;
    TextView t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify_car_image);


        Integer[] imges1 = {
                R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7,
                R.drawable.serius1, R.drawable.serius2, R.drawable.serius3, R.drawable.serius5, R.drawable.serius6, R.drawable.avalon, R.drawable.camry, R.drawable.chr, R.drawable.corolla, R.drawable.prius,
                R.drawable.gla, R.drawable.glb, R.drawable.glc, R.drawable.gls, R.drawable.glv, R.drawable.edge, R.drawable.escape, R.drawable.explorer, R.drawable.gt, R.drawable.mustang,
                R.drawable.altima, R.drawable.leaf, R.drawable.maxima, R.drawable.sentra, R.drawable.versa,
        };


        final String[] brands = {"AUDI", "BMW", "TOYOTA", "BENZ", "FORD", "NISSAN"};

        imb1 = findViewById(R.id.imageButton1);
        imb2 = findViewById(R.id.imageButton2);
        imb3 = findViewById(R.id.imageButton3);
        bt1 = findViewById(R.id.button);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int firstRanNumber = random.nextInt(9)+1;


                int secondRanNumber = firstRanNumber + 10;
                int thirdRanNumber = secondRanNumber + 9;

                imb1.setImageResource(imges1[firstRanNumber]);
                imb2.setImageResource(imges1[secondRanNumber]);
                imb3.setImageResource(imges1[thirdRanNumber]);


                int correctRanNumber = random.nextInt(2);//to place correct image

                if (correctRanNumber == 0) {

                    if (firstRanNumber <= 4) {
                        String brandName = brands[0];
                        t4.setText(brandName);
                    } else if (firstRanNumber > 5 && firstRanNumber <= 9) {
                        String brandName = brands[1];
                        t4.setText(brandName);
                    } else if (firstRanNumber > 9 && firstRanNumber <= 14) {
                        String brandName = brands[2];
                        t4.setText(brandName);
                    } else if (firstRanNumber > 14 && firstRanNumber <= 19) {
                        String brandName = brands[3];
                        t4.setText(brandName);
                    } else if (firstRanNumber > 19 && firstRanNumber <= 24) {
                        String brandName = brands[4];
                        t4.setText(brandName);
                    } else if (firstRanNumber > 24 && firstRanNumber <= 29) {
                        String brandName = brands[5];
                        t4.setText(brandName);
                    }
                }
                if (correctRanNumber == 1) {

                    if (secondRanNumber <= 4) {
                        String brandName = brands[0];
                        t4.setText(brandName);
                    } else if (secondRanNumber > 5 && secondRanNumber <= 9) {
                        String brandName = brands[1];
                        t4.setText(brandName);
                    } else if (secondRanNumber > 9 && secondRanNumber <= 14) {
                        String brandName = brands[2];
                        t4.setText(brandName);
                    } else if (secondRanNumber > 14 && secondRanNumber <= 19) {
                        String brandName = brands[3];
                        t4.setText(brandName);
                    } else if (secondRanNumber > 19 && secondRanNumber <= 24) {
                        String brandName = brands[4];
                        t4.setText(brandName);
                    } else if (secondRanNumber > 24 && secondRanNumber <= 29) {
                        String brandName = brands[5];
                        t4.setText(brandName);
                    }
                }

                if (correctRanNumber == 2) {

                    if (thirdRanNumber <= 4) {
                        String brandName = brands[0];
                        t4.setText(brandName);
                    } else if (thirdRanNumber > 5 && thirdRanNumber <= 9) {
                        String brandName = brands[1];
                        t4.setText(brandName);
                    } else if (thirdRanNumber > 9 && thirdRanNumber <= 14) {
                        String brandName = brands[2];
                        t4.setText(brandName);
                    } else if (thirdRanNumber > 14 && thirdRanNumber <= 19) {
                        String brandName = brands[3];
                        t4.setText(brandName);
                    } else if (thirdRanNumber > 19 && thirdRanNumber <= 24) {
                        String brandName = brands[4];
                        t4.setText(brandName);
                    } else if (thirdRanNumber > 24 && thirdRanNumber <= 29) {
                        String brandName = brands[5];
                        t4.setText(brandName);
                    }
                }
                String getValueOfBrand = (String) t4.getText();
                imb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (firstRanNumber <= 4) {
                            if (getValueOfBrand == "AUDI") {
                                String color1="<font color=#49FB00>Correct</font>";
                                t5.setText(Html.fromHtml(color1));

                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));
                            }

                        }
                        if (firstRanNumber > 4 && firstRanNumber <= 9) {
                            if (getValueOfBrand == "BMW") {
                                String color1="<font color=#49FB00>Correct</font>";
                                t5.setText(Html.fromHtml(color1));
                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));
                            }

                        }

                    }
                });

                imb2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (secondRanNumber > 9 && secondRanNumber <= 14) {
                            if (getValueOfBrand == "TOYOTA") {
                                String color1="<font color=#1AD200>Correct</font>";
                                t5.setText(Html.fromHtml(color1));
                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));
                            }
                        }
                        if (secondRanNumber > 14 && secondRanNumber <= 19) {
                            if (getValueOfBrand == "BENZ") {
                                String color1="<font color=#1AD200>Correct</font>";
                                t5.setText(Html.fromHtml(color1));
                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));
                            }

                        }

                    }
                });

                imb3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (thirdRanNumber > 19 && thirdRanNumber <= 24) {
                            if (getValueOfBrand == "FORD") {
                                String color1="<font color=#1AD200>Correct</font>";
                                t5.setText(Html.fromHtml(color1));
                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));
                            }

                        }
                        if (thirdRanNumber > 24 && thirdRanNumber <= 29) {
                            if (getValueOfBrand == "NISSAN") {
                                String color1="<font color=#1AD200>Correct</font>";
                                t5.setText(Html.fromHtml(color1));
                            } else {
                                String color2="<font color=#FF0303>Sorry You Are Wrong</font>";
                                t5.setText(Html.fromHtml(color2));

                            }

                        }

                    }
                });
            }
        });



    }}


