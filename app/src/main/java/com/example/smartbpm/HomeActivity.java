package com.example.smartbpm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.example.smartbpm.Fragments.Home_Fragment;
import com.example.smartbpm.Fragments.Insights_Fragment;
import com.example.smartbpm.Fragments.Profile_Fragment;
import com.example.smartbpm.Fragments.Setting_Fragment;
import com.example.smartbpm.Home.Heart_Rate_Activity;
import com.example.smartbpm.Home_Heart_rate.Measure_HeartRate_Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
   FloatingActionButton floatingActionButton;


    Home_Fragment home_fragment = new Home_Fragment();
    Insights_Fragment insights_fragment = new Insights_Fragment();
    Profile_Fragment profile_fragment = new Profile_Fragment();
    Setting_Fragment setting_fragment = new Setting_Fragment();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Window window = HomeActivity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(ContextCompat.getColor(HomeActivity.this, R.color.lite_pink));
        }

        bottomNavigationView = findViewById(R.id.bottom_menu);
        frameLayout=findViewById(R.id.frameLayout);
        floatingActionButton=findViewById(R.id.heart_rate);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, home_fragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, home_fragment).commit();
                        return true;
                    case R.id.insights:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, insights_fragment).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, profile_fragment).commit();
                        return true;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, setting_fragment).commit();
                        return true;
                }
                return false;
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this,Heart_Rate_Activity.class);
                startActivity(i);
            }
        });
    }
}