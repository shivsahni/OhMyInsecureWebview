package com.example.ohmyinsecurewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(getApplicationContext(), WebviewLoadActivity.class);
                myIntent.putExtra("URL", "http://192.168.1.70:5000/redirect");
                myIntent.putExtra("Authorization", "ThisIsSecretHeader");
                startActivity(myIntent);
            }
        });
    }
}
