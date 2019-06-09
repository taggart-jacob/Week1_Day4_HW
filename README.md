# Week1_Day4_HW

Problem: 
Create a calculator app to perform all the standard calculator operations like addition, subtraction, multiplication, divide etc. 
 -No edittexts
 -Changing the orientation to landscape(layout qualifier) will display now functionality (Scientific calculator)
 
Solution:

java file:

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

xml file:

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:background="drawable/shape"
        android:layout_above="@+id/topView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        />
    <GridLayout
        android:id="@+id/topView"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:columnCount="4"
        android:rowCount="5"
        android:orientation="horizontal"
        android:useDefaultMargins="true"
        android:layout_gravity="center">

        <Button
            android:background="drawable/shape"
            android:text="C"
            android:id="@+id/clear"/>

        <Button
            android:background="drawable/shape"
            android:text="^2"
            android:id="@+id/square"/>

        <Button
            android:background="drawable/shape"
            android:text="sq.rt"
            android:id="@+id/squareRoot"/>

        <Button
            android:background="drawable/shape"
            android:text="+"
            android:id="@+id/plus"/>

        <Button
            android:background="drawable/shape"
            android:text="7"
            android:id="@+id/seven"/>

        <Button
            android:background="drawable/shape"
            android:text="8"
            android:id="@+id/eight"/>

        <Button
            android:background="drawable/shape"
            android:text="9"
            android:id="@+id/nine"/>

        <Button
            android:background="drawable/shape"
            android:text="-"
            android:id="@+id/minus"/>

        <Button
            android:background="drawable/shape"
            android:text="4"
            android:id="@+id/four"/>

        <Button
            android:background="drawable/shape"
            android:text="5"
            android:id="@+id/five"/>

        <Button
            android:background="drawable/shape"
            android:text="6"
            android:id="@+id/six"/>

        <Button
            android:background="drawable/shape"
            android:text="x"
            android:id="@+id/multiply"/>

        <Button
            android:background="drawable/shape"
            android:text="1"
            android:id="@+id/one"/>

        <Button
            android:background="drawable/shape"
            android:text="2"
            android:id="@+id/two"/>

        <Button
            android:background="drawable/shape"
            android:text="3"
            android:id="@+id/three"/>

        <Button
            android:background="drawable/shape"
            android:text="/"
            android:id="@+id/divide"/>
        <Button
            android:background="drawable/shape"
            android:layout_gravity="fill_horizontal"
            android:layout_columnSpan="2"
            android:text="0"
            android:id="@+id/zero"/>
        <Button
            android:background="drawable/shape"
            android:text="."
            android:id="@+id/point"/>
        <Button
            android:background="drawable/shape"
            android:layout_gravity="fill_vertical"
            android:text="="
            android:id="@+id/equals"/>

    </GridLayout>

</RelativeLayout>


![Screen Shot 2019-06-07 at 1 28 38 PM](https://user-images.githubusercontent.com/51377398/59122307-73711a00-8928-11e9-81d3-1841d77f84fb.png)
