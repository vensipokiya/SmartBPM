package com.example.smartbpm.Home_Heart_rate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.smartbpm.R;

public class Blood_pressure_Activity extends AppCompatActivity {

    ImageView img_back;
    Button btn_bp_analyze,btn_history,btn_trends,btn_statistics,btn_set_alarms,btn_export_data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_pressure);

        img_back = findViewById(R.id.img_back);

        btn_bp_analyze = findViewById(R.id.btn_bp_analyze);
        btn_history = findViewById(R.id.btn_history);
        btn_trends = findViewById(R.id.btn_trends);
        btn_statistics = findViewById(R.id.btn_statistics);
        btn_set_alarms = findViewById(R.id.btn_set_alarms);
        btn_export_data = findViewById(R.id.btn_export_data);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}