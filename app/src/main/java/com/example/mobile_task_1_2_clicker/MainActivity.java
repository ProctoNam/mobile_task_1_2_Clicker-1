package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button resetBtn;
    ImageButton minBtn;

    private long score = 0;
    private String str = " раз";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.button);
        resetBtn = (Button) findViewById(R.id.button2);
        minBtn =  (ImageButton) findViewById(R.id.button3);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if (score %10 < 5 && score%10 > 1)
                {
                    str = " раза";
                }
                if (score%100 > 10 && score%100 < 20)
                {
                    str= " раз";
                }
                String s = "Кнопа нажата " + score + str;
                str = " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener clickMin = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                if (score %10 > -5 && score%10 < -1)
                {
                    str = " раза";
                }
                if (score%100 < -10 && score%100 > -20)
                {
                    str= " раз";
                }
                String s = "Кнопа нажата " + score + str;
                str = " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        View.OnClickListener clickReset = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кнопа нажата " + score + " раз";
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };
        mainBtn.setOnClickListener(clickListener);
        resetBtn.setOnClickListener(clickReset);
        minBtn.setOnClickListener(clickMin);

    }
}

