package com.yalova.yumyfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView Name;
    private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Name =(TextView)findViewById(R.id.Name);
        Bundle bundle= getIntent().getExtras();
        strName = bundle.getString("NAME");
        Name.setText(strName);

    }
}
