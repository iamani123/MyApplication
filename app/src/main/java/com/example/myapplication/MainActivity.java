package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
                //write code on button press

            login(v);
           }
       });

    }
    public void login(View view){
        Intent intent = new Intent(this, OTPActivity.class);
        EditText editText = (EditText) findViewById(R.id.input_email);
        String message = editText.getText().toString();
        startActivity(intent);
    }
}
