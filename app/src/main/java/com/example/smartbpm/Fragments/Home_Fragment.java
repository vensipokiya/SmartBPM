package com.example.smartbpm.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.smartbpm.Home.Blood_Sugar_Activity;
import com.example.smartbpm.Home.Blood_pressure_Activity;
import com.example.smartbpm.Home.Cholesterol_Activity;
import com.example.smartbpm.Home.Daily_challenge_Activity;
import com.example.smartbpm.Home.Food_Scanner_Activity;
import com.example.smartbpm.Home.Heart_Rate_Activity;
import com.example.smartbpm.Home.Weight_BMI_Activity;
import com.example.smartbpm.R;

public class Home_Fragment extends Fragment {

    Context context;
    LinearLayout ll_hart_rate,ll_bp,ll_daily_challenge,ll_weight_bmi,ll_step_counter,ll_cholesterol,ll_blood_sugar,ll_food_scanner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home_, container, false);
        context = getActivity();

        ll_hart_rate = view.findViewById(R.id.ll_hart_rate);
        ll_bp = view.findViewById(R.id.ll_bp);
        ll_daily_challenge = view.findViewById(R.id.ll_daily_challenge);
        ll_weight_bmi = view.findViewById(R.id.ll_weight_bmi);
        ll_step_counter = view.findViewById(R.id.ll_step_counter);
        ll_cholesterol = view.findViewById(R.id.ll_cholesterol);
        ll_blood_sugar = view.findViewById(R.id.ll_blood_sugar);
        ll_food_scanner = view.findViewById(R.id.ll_food_scanner);



        ll_hart_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(context, Heart_Rate_Activity.class);
               startActivity(i);
            }
        });

        ll_bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Blood_pressure_Activity.class);
                startActivity(i);
            }
        });

        ll_daily_challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Daily_challenge_Activity.class);
                startActivity(i);
            }
        });

        ll_weight_bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Weight_BMI_Activity.class);
                startActivity(i);
            }
        });

        ll_cholesterol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Cholesterol_Activity.class);
                startActivity(i);
            }
        });
        ll_blood_sugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Blood_Sugar_Activity.class);
                startActivity(i);
            }
        });
        ll_food_scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, Food_Scanner_Activity.class);
                startActivity(i);
            }
        });


        return view;
    }
}