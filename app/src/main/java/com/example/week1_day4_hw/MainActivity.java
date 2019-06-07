package com.example.week1_day4_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView topView;
    Button clear;
    Button square;
    Button squareRoot;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button equals;
    Button point;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topView = findViewById(R.id.topView);
        clear = findViewById(R.id.clear);
        square = findViewById(R.id.square);
        squareRoot = findViewById(R.id.squareRoot);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equals = findViewById(R.id.equals);
        point = findViewById(R.id.point);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        //setting the onClick listeners for all buttons
        clear.setOnClickListener(this);
        square.setOnClickListener(this);
        squareRoot.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equals.setOnClickListener(this);
        point.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

    }


    @Override
    public void onCLick(View vue) { String text;

        switch (vue.getId()) {
            case R.id.one:
                text = "1";
                break;

            case R.id.two:
                text = "2";
                break;

        }
    }

}
