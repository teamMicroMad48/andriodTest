package com.example.mypc.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        textView = findViewById(R.id.text);
        textView.setText("WELCOME "+ message +" to my first app :)");

    }
}
