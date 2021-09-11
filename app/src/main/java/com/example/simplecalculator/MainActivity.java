package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.text.Layout;
import android.view.View;


import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView ok, zero, one, two, three, four, five, six, seven, eight, nine, minus, plus, equal, multiply, devide, percent, reset, dot;
    TextView tvinput, tvoutput, light, dark, light_dark;
    ImageButton clear, setting;
    String process;
    Dialog dialog;
    View tt;
    View bg;

    View bt;

    MediaPlayer mediaPlayer;
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dailog_box);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mediaPlayer = MediaPlayer.create(this, R.raw.tone);
        getSupportActionBar().hide();
        ok = dialog.findViewById(R.id.buttonok);
        light = dialog.findViewById(R.id.light);
        dark = dialog.findViewById(R.id.dark);
        light_dark = dialog.findViewById(R.id.light_dark);
        tt = findViewById(R.id.tt);
        bt = findViewById(R.id.bt);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        dot = findViewById(R.id.dot);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        devide = findViewById(R.id.devide);
        percent = findViewById(R.id.percent);
        clear = findViewById(R.id.clear);
        reset = findViewById(R.id.reset);
        equal = findViewById(R.id.equal);
        bg = findViewById(R.id.backgoundMain);

        tvinput = findViewById(R.id.inputText);
        tvoutput = findViewById(R.id.outputText);
        setting = findViewById(R.id.btn_setting);

        nine.setOnClickListener(this);
        eight.setOnClickListener(this);
        seven.setOnClickListener(this);
        six.setOnClickListener(this);
        five.setOnClickListener(this);
        four.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        minus.setOnClickListener(this);
        devide.setOnClickListener(this);
        percent.setOnClickListener(this);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        // change layout

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt.setBackgroundColor(Color.WHITE);
                bt.setBackgroundColor(Color.WHITE);
                reset.setTextColor(Color.BLACK);
                percent.setTextColor(Color.BLACK);
                devide.setTextColor(Color.BLACK);
                multiply.setTextColor(Color.BLACK);
                minus.setTextColor(Color.BLACK);
                plus.setTextColor(Color.BLACK);
                equal.setTextColor(Color.BLACK);
                zero.setTextColor(Color.BLACK);
                one.setTextColor(Color.BLACK);
                two.setTextColor(Color.BLACK);
                three.setTextColor(Color.BLACK);
                four.setTextColor(Color.BLACK);
                five.setTextColor(Color.BLACK);
                six.setTextColor(Color.BLACK);
                seven.setTextColor(Color.BLACK);
                eight.setTextColor(Color.BLACK);
                nine.setTextColor(Color.BLACK);
                dot.setTextColor(Color.BLACK);
                tvinput.setTextColor(Color.BLACK);
                tvoutput.setTextColor(Color.BLACK);

                clear.setBackgroundColor(Color.rgb(200, 200, 200));
                reset.setBackgroundColor(Color.rgb(200, 200, 200));
                percent.setBackgroundColor(Color.rgb(200, 200, 200));
                zero.setBackgroundColor(Color.rgb(200, 200, 200));
                one.setBackgroundColor(Color.rgb(200, 200, 200));
                two.setBackgroundColor(Color.rgb(200, 200, 200));
                three.setBackgroundColor(Color.rgb(200, 200, 200));
                four.setBackgroundColor(Color.rgb(200, 200, 200));
                five.setBackgroundColor(Color.rgb(200, 200, 200));
                six.setBackgroundColor(Color.rgb(200, 200, 200));
                seven.setBackgroundColor(Color.rgb(200, 200, 200));
                eight.setBackgroundColor(Color.rgb(200, 200, 200));
                nine.setBackgroundColor(Color.rgb(200, 200, 200));
                dot.setBackgroundColor(Color.rgb(200, 200, 200));
                tvinput.setBackgroundColor(Color.WHITE);
                tvoutput.setBackgroundColor(Color.WHITE);
                bg.setBackgroundColor(Color.WHITE);
                setting.setBackgroundColor(Color.WHITE);
                dialog.dismiss();

            }
        });

        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt.setBackgroundColor(Color.DKGRAY);
                bt.setBackgroundColor(Color.DKGRAY);
                reset.setTextColor(Color.WHITE);
                percent.setTextColor(Color.WHITE);
                devide.setTextColor(Color.WHITE);
                multiply.setTextColor(Color.WHITE);
                minus.setTextColor(Color.WHITE);
                plus.setTextColor(Color.WHITE);
                equal.setTextColor(Color.WHITE);
                zero.setTextColor(Color.WHITE);
                one.setTextColor(Color.WHITE);
                two.setTextColor(Color.WHITE);
                three.setTextColor(Color.WHITE);
                four.setTextColor(Color.WHITE);
                five.setTextColor(Color.WHITE);
                six.setTextColor(Color.WHITE);
                seven.setTextColor(Color.WHITE);
                eight.setTextColor(Color.WHITE);
                nine.setTextColor(Color.WHITE);
                dot.setTextColor(Color.WHITE);
                tvinput.setTextColor(Color.WHITE);
                tvoutput.setTextColor(Color.WHITE);

                clear.setBackgroundColor(Color.BLACK);
                reset.setBackgroundColor(Color.BLACK);
                percent.setBackgroundColor(Color.BLACK);
                zero.setBackgroundColor(Color.BLACK);
                one.setBackgroundColor(Color.BLACK);
                two.setBackgroundColor(Color.BLACK);
                three.setBackgroundColor(Color.BLACK);
                four.setBackgroundColor(Color.BLACK);
                five.setBackgroundColor(Color.BLACK);
                six.setBackgroundColor(Color.BLACK);
                seven.setBackgroundColor(Color.BLACK);
                eight.setBackgroundColor(Color.BLACK);
                nine.setBackgroundColor(Color.BLACK);
                dot.setBackgroundColor(Color.BLACK);
                tvinput.setBackgroundColor(Color.DKGRAY);
                tvoutput.setBackgroundColor(Color.DKGRAY);
                bg.setBackgroundColor(Color.DKGRAY);
                setting.setBackgroundColor(Color.DKGRAY);
                dialog.dismiss();
            }
        });
        light_dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt.setBackgroundColor(Color.WHITE);
                bt.setBackgroundColor(Color.BLACK);
                reset.setTextColor(Color.WHITE);
                percent.setTextColor(Color.WHITE);
                devide.setTextColor(Color.WHITE);
                multiply.setTextColor(Color.WHITE);
                minus.setTextColor(Color.WHITE);
                plus.setTextColor(Color.WHITE);
                equal.setTextColor(Color.WHITE);
                zero.setTextColor(Color.WHITE);
                one.setTextColor(Color.WHITE);
                two.setTextColor(Color.WHITE);
                three.setTextColor(Color.WHITE);
                four.setTextColor(Color.WHITE);
                five.setTextColor(Color.WHITE);
                six.setTextColor(Color.WHITE);
                seven.setTextColor(Color.WHITE);
                eight.setTextColor(Color.WHITE);
                nine.setTextColor(Color.WHITE);
                dot.setTextColor(Color.WHITE);
                tvinput.setTextColor(Color.BLACK);
                tvoutput.setTextColor(Color.BLACK);

                clear.setBackgroundColor(Color.BLACK);
                reset.setBackgroundColor(Color.BLACK);
                percent.setBackgroundColor(Color.BLACK);
                zero.setBackgroundColor(Color.BLACK);
                one.setBackgroundColor(Color.BLACK);
                two.setBackgroundColor(Color.BLACK);
                three.setBackgroundColor(Color.BLACK);
                four.setBackgroundColor(Color.BLACK);
                five.setBackgroundColor(Color.BLACK);
                six.setBackgroundColor(Color.BLACK);
                seven.setBackgroundColor(Color.BLACK);
                eight.setBackgroundColor(Color.BLACK);
                nine.setBackgroundColor(Color.BLACK);
                dot.setBackgroundColor(Color.BLACK);
                tvinput.setBackgroundColor(Color.WHITE);
                tvoutput.setBackgroundColor(Color.WHITE);
                bg.setBackgroundColor(Color.WHITE);
                setting.setBackgroundColor(Color.WHITE);
                dialog.dismiss();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mediaPlayer.start();

                    tvinput.setText("");
                    tvoutput.setText("");
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                try{
                    int end = tvoutput.length() - 1;
                    int begin = 0;
                    process = process.substring(begin, end);
                    tvoutput.setText(process);
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Enter any Value", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

                try {
                    process = tvoutput.getText().toString();
                    if (process.charAt(process.length() - 1) == '+' || process.charAt(process.length() - 1) == '-' || process.charAt(process.length() - 1) == 'x' || process.charAt(process.length() - 1) == '/'
                            || process.charAt(process.length() - 1) == '%')

                        process = tvoutput.getText().toString();
                    process = process.replace("x", "*");
                    process = process.replace("%", "/100*");
                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String finalResult = "";
                    try {
                        Scriptable scriptable = rhino.initStandardObjects();
                        finalResult = rhino.evaluateString(scriptable, process, "javaScript", 1, null).toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                        finalResult = "0";
                    }
                    tvinput.setTextSize(50);
                    tvinput.setText(finalResult);
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Enter any Value", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }

    @Override
    public void onClick(View view) {

        mediaPlayer.start();
        TextView text = (TextView) view;
        String tapedView = text.getTag().toString();


        process = tvoutput.getText().toString();
        tvoutput.setText(process + tapedView);


    }


}