package com.example.smartbpm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smartbpm.Fragments.Home_Fragment;
import com.example.smartbpm.Fragments.Insights_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    LinearLayout ll_hart_rate,ll_bp,ll_daily_challenge,ll_weight_bmi,ll_step_counter,ll_cholesterol,ll_blood_sugar,ll_food_scanner;
    BottomNavigationView bottomNavigationView;
    LinearLayout frame;
    ImageView img_hart_rate,img_bp,img_daily_challenge,img_weight_BMI,img_step_counter,img_cholesterol,img_blood_sugar,img_food_scanner;
    TextView tv_hart_rate,tv_bp,tv_daily_challenge,tv_weight_BMI,tv_step_counter,tv_cholesterol,tv_blood_suger,tv_food_scanner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        bottomNavigationView = findViewById(R.id.bottom_menu);
        frame=findViewById(R.id.mn_layout);

        ll_hart_rate = findViewById(R.id.ll_hart_rate);
        ll_bp = findViewById(R.id.ll_bp);
        ll_daily_challenge = findViewById(R.id.ll_daily_challenge);
        ll_weight_bmi = findViewById(R.id.ll_weight_bmi);
        ll_step_counter = findViewById(R.id.ll_step_counter);
        ll_cholesterol = findViewById(R.id.ll_cholesterol);
        ll_blood_sugar = findViewById(R.id.ll_blood_sugar);
        ll_food_scanner = findViewById(R.id.ll_food_scanner);

        img_hart_rate = findViewById(R.id.img_hart_rate);
        img_bp = findViewById(R.id.img_bp);
        img_daily_challenge = findViewById(R.id.img_daily_challenge);
        img_weight_BMI = findViewById(R.id.img_weight_BMI);
        img_step_counter = findViewById(R.id.img_step_counter);
        img_cholesterol = findViewById(R.id.img_cholesterol);
        img_blood_sugar = findViewById(R.id.img_blood_sugar);
        img_food_scanner = findViewById(R.id.img_food_scanner);

        tv_hart_rate = findViewById(R.id.tv_hart_rate);
        tv_bp = findViewById(R.id.tv_bp);
        tv_daily_challenge = findViewById(R.id.tv_daily_challenge);
        tv_weight_BMI = findViewById(R.id.tv_weight_BMI);
        tv_step_counter = findViewById(R.id.tv_step_counter);
        tv_cholesterol = findViewById(R.id.tv_cholesterol);
        tv_blood_suger = findViewById(R.id.tv_blood_suger);
        tv_food_scanner = findViewById(R.id.tv_food_scanner);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mn_layout, new Home_Fragment()).commit();
//                        Toast.makeText(HomeActivity.this, "HOME Screen", Toast.LENGTH_SHORT).show();

                    case R.id.insights:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mn_layout, new Insights_Fragment()).commit();
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