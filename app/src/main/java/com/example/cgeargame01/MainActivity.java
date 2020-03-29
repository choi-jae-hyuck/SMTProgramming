package com.example.cgeargame01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv= findViewById(R.id.textView3);
        tv.setText("Launched");
    }
    public void onBtnFirst(View v){
        TextView tv = findViewById(R.id.textView2);
        tv.setText("First Button Pressed");

    }

    public void onBtnThird(View view) {
        TextView tv = findViewById((R.id.textView));
        int count = 0;
        try {
            count = Integer.parseInt((String) tv.getText());
        } catch (Exception e) {
        }
        count++;
        tv.setText(String.valueOf(count));
    }
}
