package com.example.android_studio_no10_2018receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(clickonbutton1);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(clickonbutton2);
        Button button3 = (Button)findViewById(R.id.button7);
        button3.setOnClickListener(clickonbutton3);
        Button button4 = (Button)findViewById(R.id.button8);
        button4.setOnClickListener(clickonbutton4);
        Button button5 = (Button)findViewById(R.id.button9);
        button5.setOnClickListener(clickonbutton5);
        Button button6 = (Button)findViewById(R.id.button10);
        button6.setOnClickListener(clickonbutton6);
    }
    private View.OnClickListener clickonbutton1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 1,2月發票");
            set.setText("1");
        }
    };
    private View.OnClickListener clickonbutton2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 3,4月發票");
            set.setText("2");
        }
    };
    private View.OnClickListener clickonbutton3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 5,6月發票");
            set.setText("3");
        }
    };
    private View.OnClickListener clickonbutton4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 7,8月發票");
            set.setText("4");
        }
    };
    private View.OnClickListener clickonbutton5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 9,10月發票");
            set.setText("5");
        }
    };
    private View.OnClickListener clickonbutton6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text = (TextView)findViewById(R.id.chosentext);
            TextView set = (TextView)findViewById(R.id.factor);
            text.setText("2018 11,12月發票");
            set.setText("6");
        }
    };

    public void AtoB(View v){
        TextView click_button = (TextView)findViewById(R.id.chosentext);
        TextView set = (TextView)findViewById(R.id.factor);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("month", click_button.getText().toString());
        bundle.putString("Monthnumber", set.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}