package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Integer;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.change);
        SeekBar sb = findViewById(R.id.seekBar3);
        CheckBox cB = (CheckBox) findViewById(R.id.black);
        //Log.d("temperatureInput", editTextC.getText().toString());
        cB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    TextView textc = findViewById (R.id.textC);
                    TextView texth = findViewById (R.id.textH);
                    textc.setTextColor(Color.parseColor("#ff5e9cff"));//设置颜色
                    texth.setTextColor(Color.parseColor("#ff5e9cff"));//设置颜色

                }else{
                    TextView textc = findViewById (R.id.textC);
                    TextView texth = findViewById (R.id.textH);
                    textc.setTextColor(Color.parseColor("#272727"));//设置颜色
                    texth.setTextColor(Color.parseColor("#272727"));//设置颜色
                }
            }});
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextC = findViewById (R.id.temperatureC);
                String s = editTextC.getText().toString();
                int T_c = Integer.parseInt(s);
                double T_f = T_c * 1.8 +32;
                String res = String.valueOf(T_f);
                TextView resT = findViewById (R.id.textViewRes);
                resT.setText(res);
            }
        });
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                //textView8
                TextView textV = findViewById (R.id.textView8);
                textV.setText("当前进度条是" + progress + "/100");

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
