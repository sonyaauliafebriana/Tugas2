package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GucciActivity extends AppCompatActivity {

    private CardView cvGucci1, cvGucci2, cvGucci3, cvGucci4, cvGucci5;

    private TextView tvGucci1, tvGucci2, tvGucci3, tvGucci4, tvGucci5, tvDetailGucci1, tvDetailGucci2, tvDetailGucci3, tvDetailGucci4, tvDetailGucci5, tvHargaGucci01, tvHargaGucci02, tvHargaGucci03, tvHargaGucci04, tvHargaGucci05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gucci);

        cvGucci1 = findViewById(R.id.cardGucci1);
        cvGucci2 = findViewById(R.id.cardGucci2);
        cvGucci3 = findViewById(R.id.cardGucci3);
        cvGucci4 = findViewById(R.id.cardGucci4);
        cvGucci5 = findViewById(R.id.cardGucci5);

        cvGucci1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGucci1 = findViewById(R.id.tvGucci1);
                tvDetailGucci1 = findViewById(R.id.tvDetailGucci1);
                tvHargaGucci01 = findViewById(R.id.tvHargaGucci01);

                Intent intentbarang = new Intent(GucciActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvGucci1.getText());
                intentbarang.putExtra("Detail", tvDetailGucci1.getText());
                intentbarang.putExtra("Harga", tvHargaGucci01.getText());
                intentbarang.putExtra("Gambar", R.drawable.guci1);
                startActivity(intentbarang);

            }
        });
        cvGucci2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGucci2 = findViewById(R.id.tvGucci2);
                tvDetailGucci2 = findViewById(R.id.tvDetailGucci2);
                tvHargaGucci02 = findViewById(R.id.tvHargaGucci02);

                Intent intentbarang = new Intent(GucciActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvGucci2.getText());
                intentbarang.putExtra("Detail", tvDetailGucci2.getText());
                intentbarang.putExtra("Harga", tvHargaGucci02.getText());
                intentbarang.putExtra("Gambar", R.drawable.guci2);
                startActivity(intentbarang);

            }
        });
        cvGucci3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGucci3 = findViewById(R.id.tvGucci3);
                tvDetailGucci3 = findViewById(R.id.tvDetailGucci3);
                tvHargaGucci03 = findViewById(R.id.tvHargaGucci03);

                Intent intentbarang = new Intent(GucciActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvGucci3.getText());
                intentbarang.putExtra("Detail", tvDetailGucci3.getText());
                intentbarang.putExtra("Harga", tvHargaGucci03.getText());
                intentbarang.putExtra("Gambar", R.drawable.guci3);
                startActivity(intentbarang);

            }
        });
        cvGucci4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGucci4 = findViewById(R.id.tvGucci4);
                tvDetailGucci4 = findViewById(R.id.tvDetailGucci4);
                tvHargaGucci04 = findViewById(R.id.tvHargaGucci04);

                Intent intentbarang = new Intent(GucciActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvGucci4.getText());
                intentbarang.putExtra("Detail", tvDetailGucci4.getText());
                intentbarang.putExtra("Harga", tvHargaGucci04.getText());
                intentbarang.putExtra("Gambar", R.drawable.guci4);
                startActivity(intentbarang);

            }
        });
        cvGucci5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvGucci5 = findViewById(R.id.tvGucci5);
                tvDetailGucci5 = findViewById(R.id.tvDetailGucci5);
                tvHargaGucci05 = findViewById(R.id.tvHargaGucci05);

                Intent intentbarang = new Intent(GucciActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvGucci5.getText());
                intentbarang.putExtra("Detail", tvDetailGucci5.getText());
                intentbarang.putExtra("Harga", tvHargaGucci05.getText());
                intentbarang.putExtra("Gambar", R.drawable.guci5);
                startActivity(intentbarang);

            }
        });
    }
}