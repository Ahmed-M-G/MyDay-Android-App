package com.example.myday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Next extends AppCompatActivity {
    
    private Days days;
    private TextView title,fac,daily;
    private String dayName;
    private Intent sendDayName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        title = findViewById(R.id.r);
        fac = findViewById(R.id.faculty_btn);
        daily = findViewById(R.id.daily_routine_btn);

        days = (Days) getIntent().getSerializableExtra(getString(R.string.intent_key));
        dayName = days.getDayName();

        title.setText(dayName);


        fac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDayName = new Intent(Next.this, Tables.class);
                sendDayName.putExtra(getString(R.string.intent_key_next), dayName);
                startActivity(sendDayName);
            }
        });
        //========================================================================
        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDayName = new Intent(Next.this, Tables.class);
                sendDayName.putExtra(getString(R.string.intent_key_next), dayName);
                startActivity(sendDayName);
            }
        });

    }
}