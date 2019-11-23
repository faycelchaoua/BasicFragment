package com.isetkelibia.basicfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView exp1;
    ImageView exp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exp1 = findViewById(R.id.icon_exp1);
        exp2 = findViewById(R.id.icon_exp2);

        exp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StaticFragmentActivity.class);
                startActivity(i);
            }
        });
        exp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DynamicFragmentActivity.class);
                startActivity(i);
            }
        });

    }
}
