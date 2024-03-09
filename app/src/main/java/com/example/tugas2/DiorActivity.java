package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DiorActivity extends AppCompatActivity {

    private CardView cvDior1, cvDior2, cvDior3, cvDior4, cvDior5;

    private TextView tvDior1, tvDior2, tvDior3, tvDior4, tvDior5, tvDetailDior1, tvDetailDior2, tvDetailDior3, tvDetailDior4, tvDetailDior5, tvHargaDior01, tvHargaDior02, tvHargaDior03, tvHargaDior04, tvHargaDior05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dior);

        cvDior1 = findViewById(R.id.cardDior1);
        cvDior2 = findViewById(R.id.cardDior2);
        cvDior3 = findViewById(R.id.cardDior3);
        cvDior4 = findViewById(R.id.cardDior4);
        cvDior5 = findViewById(R.id.cardDior5);

        cvDior1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDior1 = findViewById(R.id.tvDior1);
                tvDetailDior1 = findViewById(R.id.tvDetailDior1);
                tvHargaDior01 = findViewById(R.id.tvHargaDior01);

                Intent intentbarang = new Intent(DiorActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvDior1.getText());
                intentbarang.putExtra("Detail", tvDetailDior1.getText());
                intentbarang.putExtra("Harga", tvHargaDior01.getText());
                intentbarang.putExtra("Gambar", R.drawable.dior1);
                startActivity(intentbarang);

            }
        });
        cvDior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDior2 = findViewById(R.id.tvDior2);
                tvDetailDior2 = findViewById(R.id.tvDetailDior2);
                tvHargaDior02 = findViewById(R.id.tvHargaDior02);

                Intent intentbarang = new Intent(DiorActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvDior2.getText());
                intentbarang.putExtra("Detail", tvDetailDior2.getText());
                intentbarang.putExtra("Harga", tvHargaDior02.getText());
                intentbarang.putExtra("Gambar", R.drawable.dior2);
                startActivity(intentbarang);

            }
        });
        cvDior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDior3 = findViewById(R.id.tvDior3);
                tvDetailDior3 = findViewById(R.id.tvDetailDior3);
                tvHargaDior03 = findViewById(R.id.tvHargaDior03);

                Intent intentbarang = new Intent(DiorActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvDior3.getText());
                intentbarang.putExtra("Detail", tvDetailDior3.getText());
                intentbarang.putExtra("Harga", tvHargaDior03.getText());
                intentbarang.putExtra("Gambar", R.drawable.dior3);
                startActivity(intentbarang);

            }
        });
        cvDior4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDior4 = findViewById(R.id.tvDior4);
                tvDetailDior4 = findViewById(R.id.tvDetailDior4);
                tvHargaDior04 = findViewById(R.id.tvHargaDior04);

                Intent intentbarang = new Intent(DiorActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvDior4.getText());
                intentbarang.putExtra("Detail", tvDetailDior4.getText());
                intentbarang.putExtra("Harga", tvHargaDior04.getText());
                intentbarang.putExtra("Gambar", R.drawable.dior4);
                startActivity(intentbarang);

            }
        });
        cvDior5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDior5 = findViewById(R.id.tvDior5);
                tvDetailDior5 = findViewById(R.id.tvDetailDior5);
                tvHargaDior05 = findViewById(R.id.tvHargaDior05);

                Intent intentbarang = new Intent(DiorActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvDior5.getText());
                intentbarang.putExtra("Detail", tvDetailDior5.getText());
                intentbarang.putExtra("Harga", tvHargaDior05.getText());
                intentbarang.putExtra("Gambar", R.drawable.dior5);
                startActivity(intentbarang);

            }
        });
    }
}