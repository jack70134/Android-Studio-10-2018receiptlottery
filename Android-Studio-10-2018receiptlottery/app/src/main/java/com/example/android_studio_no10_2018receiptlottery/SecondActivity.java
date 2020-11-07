package com.example.android_studio_no10_2018receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pageB();
    }
    public void goback(View v){
        finish();
    }
    private void pageB(){
        int number;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            String mouth = bundle.getString("month");
            number = Integer.parseInt(bundle.getString("Monthnumber"));
            TextView text = (TextView)findViewById(R.id.chosnmonth);
            text.setText(mouth);
            if (number == 1){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("000" + "\n" + "001" + "\n" + "002" + "\n" + "003" + "\n" + "004");
            }
            else if (number == 2){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("100" + "\n" + "101" + "\n" + "102" + "\n" + "103" + "\n" + "104");
            }
            else if (number == 3){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("200" + "\n" + "201" + "\n" + "202" + "\n" + "203" + "\n" + "204");
            }
            else if (number == 4){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("300" + "\n" + "301" + "\n" + "302" + "\n" + "303" + "\n" + "304");
            }
            else if (number == 5){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("400" + "\n" + "401" + "\n" + "402" + "\n" + "403" + "\n" + "404");
            }
            else if (number == 6){
                TextView win = (TextView)findViewById(R.id.List);
                win.setText("500" + "\n" + "501" + "\n" + "502" + "\n" + "503" + "\n" + "504");
            }
        }
    }
    public void BtoC(View v){
        EditText editText = (EditText)findViewById(R.id.editview1);
        Intent intent = new Intent(this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("winNumber", editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}