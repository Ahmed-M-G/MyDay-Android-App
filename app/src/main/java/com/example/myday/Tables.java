package com.example.myday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class Tables extends AppCompatActivity {

    private Intent get;
    private TextView res;
    private String s = "";
    private TableLayout t1,t2,t3;
    private RelativeLayout free_d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        res = findViewById(R.id.r);
        t1 = findViewById(R.id.tab1);
        t2 = findViewById(R.id.tab2);
        t3 = findViewById(R.id.tab3);
        free_d = findViewById(R.id.free_day);

        get = getIntent();
        s = get.getStringExtra(getString(R.string.intent_key_next));
        res.setText(s);

        if (s.equals(getString(R.string.Sunday))) {
            t1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);
            free_d.setVisibility(View.GONE);
        }
        else if (s.equals(getString(R.string.Tuesday))) {
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.VISIBLE);
            t3.setVisibility(View.GONE);
            free_d.setVisibility(View.GONE);
        }
        else if (s.equals(getString(R.string.Thursday))) {
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.VISIBLE);
            free_d.setVisibility(View.GONE);
        }
        else
        {
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);
            free_d.setVisibility(View.VISIBLE);
        }
    }
}