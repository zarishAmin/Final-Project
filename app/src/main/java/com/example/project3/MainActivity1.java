package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity1 extends AppCompatActivity {


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignin_activity();  }
        });
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
    public void opensignin_activity()
    {
        Intent intent = new Intent(MainActivity1.this, MainActivity.class);
        startActivity(intent);
    }
}