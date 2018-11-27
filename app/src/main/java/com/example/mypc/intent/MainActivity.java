package com.example.mypc.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {

        EditText editText = findViewById(R.id.editText);
        String input = editText.getText().toString();
        Intent intent = new Intent(this,NextActivity.class);
        intent.putExtra("message",input);
        startActivity(intent);

    }
}
