package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivGucci, ivDior, ivYsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivGucci = findViewById(R.id.ivGucci);
        ivDior = findViewById(R.id.ivDior);
        ivYsl = findViewById(R.id.ivYsl);

        ivGucci.setOnClickListener(this);
        ivDior.setOnClickListener(this);
        ivYsl.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivGucci) {
            Intent guci = new Intent(MainActivity.this, GucciActivity.class);
            startActivity(guci);

        } else if (v.getId() == R.id.ivDior) {
            Intent dior = new Intent(MainActivity.this, DiorActivity.class);
            startActivity(dior);

        } else if (v.getId() == R.id.ivYsl) {
            Intent ysl = new Intent(MainActivity.this, YslActivity.class);
            startActivity(ysl);

        }

    }
}