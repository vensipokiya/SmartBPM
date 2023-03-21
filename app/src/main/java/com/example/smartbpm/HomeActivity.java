package com.example.smartbpm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView img_hart_rate,img_bp,img_daily_challenge,img_weight_BMI,img_step_counter,img_cholesterol,img_blood_sugar,img_food_scanner;
    TextView tv_hart_rate,tv_bp,tv_daily_challenge,tv_weight_BMI,tv_step_counter,tv_cholesterol,tv_blood_suger,tv_food_scanner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bottomNavigationView = findViewById(R.id.bottom_menu);

        img_hart_rate = findViewById(R.id.img_hart_rate);
        img_bp = findViewById(R.id.img_bp);
        tv_hart_rate = findViewById(R.id.tv_hart_rate);
        tv_bp = findViewById(R.id.tv_bp);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(HomeActivity.this, "HOME Screen", Toast.LENGTH_SHORT).show();

                    case R.id.insights:
                        Toast.makeText(HomeActivity.this, "INSIGHTS Screen", Toast.LENGTH_SHORT).show();

                    case R.id.profile:
                        Toast.makeText(HomeActivity.this, "PROFILE Screen", Toast.LENGTH_SHORT).show();

                    case R.id.setting:
                        Toast.makeText(HomeActivity.this, "SETTINGS Screen", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}