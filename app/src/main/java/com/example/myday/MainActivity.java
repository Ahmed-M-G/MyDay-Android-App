package com.example.myday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView daysList;
    private Intent intent;
    private ArrayList<Days> list = new ArrayList<>();
    private DaysAdapter daysAddapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daysList = findViewById(R.id.days_list);

        daysList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openNext(list.get(position));
            }
        });

        list.add(new Days(getString(R.string.Saturday)));
        list.add(new Days(getString(R.string.Sunday)));
        list.add(new Days(getString(R.string.Monday)));
        list.add(new Days(getString(R.string.Tuesday)));
        list.add(new Days(getString(R.string.Wednesday)));
        list.add(new Days(getString(R.string.Thursday)));
        list.add(new Days(getString(R.string.Friday)));
        daysAddapter = new DaysAdapter(list,this);
        daysList.setAdapter(daysAddapter);

    }


    private void openNext(Days name){
        intent = new Intent(MainActivity.this,Next.class);
        intent.putExtra(getString(R.string.intent_key),name);
        startActivity(intent);
    }
}