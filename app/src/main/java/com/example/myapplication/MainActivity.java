package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    int qwerty = 5;
    int qwerty1 = 7;
    int result = 0;

    public void asd(View view)
    {

        String str = "";

        result = result + qwerty1;

        TextView txt = findViewById(R.id.txt);

        str = String.valueOf(result);

        txt.setText(str);
    }


}
