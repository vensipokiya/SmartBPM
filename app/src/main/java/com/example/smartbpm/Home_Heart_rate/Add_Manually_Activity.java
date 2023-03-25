package com.example.smartbpm.Home_Heart_rate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.smartbpm.R;

public class Add_Manually_Activity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    ImageView img_bpm, img_back;
    TextView tv_btm, tv_bpm_discription_short, tv_bpm_discription, tv_age_num, tv_gender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_manually);

        img_back = findViewById(R.id.img_back);
        img_bpm = findViewById(R.id.img_bpm);
        tv_btm = findViewById(R.id.tv_btm);
        tv_bpm_discription_short = findViewById(R.id.tv_bpm_discription_short);
        tv_bpm_discription = findViewById(R.id.tv_bpm_discription);
        tv_age_num = findViewById(R.id.tv_age_num);
        tv_gender = findViewById(R.id.tv_gender);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        NumberPicker numberPicker = findViewById(R.id.number_picker);
        numberPicker.setMinValue(40);
        numberPicker.setMaxValue(220);

        numberPicker.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        numberPicker.setOnValueChangedListener(this);
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i1) {
//        if (numberPicker.setMinValue(40 - 59)) {
//            tv_btm.setText("Slow");
//        }

    }
}