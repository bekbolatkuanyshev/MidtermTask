package com.example.vakidzaci.midtermalarm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class TimeActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText;
    TimePicker timePicker;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        timePicker = (TimePicker)findViewById(R.id.timePicker);
        editText = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("time",getTime());
        intent.putExtra("msg", editText.getText().toString());
        setResult(1, intent);
        finish();
    }


    @SuppressLint("NewApi")
    public String getTime(){
        String str = "";
        str += "" + timePicker.getHour() + ":" + timePicker.getMinute();
        return str;
    }
}
