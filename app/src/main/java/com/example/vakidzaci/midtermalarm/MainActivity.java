package com.example.vakidzaci.midtermalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    MyAdapter myAdapter;
    ArrayList<AlarmItem> data = new ArrayList<>();
    Button btn;

    String[] strc = {"08:00", "13:00", "22:00","00:00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(linearLayoutManager);
        init();
        myAdapter = new MyAdapter();
        myAdapter.addContext(this);
        myAdapter.addItems(data);
        recyclerView.setAdapter(myAdapter);

    }


    public void init(){


        data.add(new AlarmItem("08:00","Wake up time",false));
        data.add(new AlarmItem("13:00","Launch time",true));
        data.add(new AlarmItem("22:00","Sleeping time",false));
        data.add(new AlarmItem("00:00","",false));


    }
}
