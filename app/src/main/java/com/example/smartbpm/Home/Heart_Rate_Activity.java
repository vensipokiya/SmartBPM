package com.example.smartbpm.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.smartbpm.Home_Heart_rate.Add_Manually_Activity;
import com.example.smartbpm.Home_Heart_rate.Measure_HeartRate_Activity;
import com.example.smartbpm.R;

public class Heart_Rate_Activity extends AppCompatActivity {

    ImageView img_back;
    Button btn_measure_now,btn_add_manually,btn_history,btn_trends,btn_statistics,btn_set_alarms,btn_export_data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate);

        Window window = Heart_Rate_Activity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(Heart_Rate_Activity.this, R.color.pink2));
        }

        img_back = findViewById(R.id.img_back);

        btn_measure_now = findViewById(R.id.btn_measure_now);
        btn_add_manually = findViewById(R.id.btn_add_manually);
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

        btn_measure_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Heart_Rate_Activity.this, Measure_HeartRate_Activity.class);
                startActivity(i);
            }
        });

        btn_add_manually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Heart_Rate_Activity.this, Add_Manually_Activity.class);
                startActivity(i);
            }
        });

    }
}