package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int cnt;
    public static SharedPreferences sharedPreferences; //Get
    public static SharedPreferences.Editor editor; //Set Means Store

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        sharedPreferences = getSharedPreferences("Demo",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        cnt = sharedPreferences.getInt("name",0);

        textView.setText(""+cnt);
    }

    public void setClick(View view) {

        cnt++;

        editor.putInt("name",cnt);
        editor.commit();

        textView.setText(""+cnt);
    }
}