package com.example.sal11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout LlBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView TvBottom = (TextView) findViewById(R.id.tvBottom);
        Button BtnBottom = (Button) findViewById(R.id.btnBottom);

        LlBottom.setBackgroundResource(R.color.llBottomColor);
        TvBottom.setText(R.string.tvBottomText);
        BtnBottom.setText(R.string.btnBottomText);

    }
}