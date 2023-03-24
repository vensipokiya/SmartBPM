package com.example.smartbpm.Home_Heart_rate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.smartbpm.R;

public class Heart_Rate_Activity extends AppCompatActivity {

    ImageView img_back;
    Button btn_measure_now,btn_add_manually,btn_history,btn_trends,btn_statistics,btn_set_alarms,btn_export_data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate);

        img_back = findViewById(R.id.img_back);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}