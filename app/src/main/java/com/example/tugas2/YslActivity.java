package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class YslActivity extends AppCompatActivity {

    private CardView cvYsl1, cvYsl2, cvYsl3, cvYsl4, cvYsl5;

    private TextView tvYsl1, tvYsl2, tvYsl3, tvYsl4, tvYsl5, tvDetailYsl1, tvDetailYsl2, tvDetailYsl3, tvDetailYsl4, tvDetailYsl5, tvHargaYsl01, tvHargaYsl02, tvHargaYsl03, tvHargaYsl04, tvHargaYsl05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ysl);

        cvYsl1 = findViewById(R.id.cardYsl1);
        cvYsl2 = findViewById(R.id.cardYsl2);
        cvYsl3 = findViewById(R.id.cardYsl3);
        cvYsl4 = findViewById(R.id.cardYsl4);
        cvYsl5 = findViewById(R.id.cardYsl5);

        cvYsl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvYsl1 = findViewById(R.id.tvYsl1);
                tvDetailYsl1 = findViewById(R.id.tvDetailYsl1);
                tvHargaYsl01 = findViewById(R.id.tvHargaYsl01);

                Intent intentbarang = new Intent(YslActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvYsl1.getText());
                intentbarang.putExtra("Detail", tvDetailYsl1.getText());
                intentbarang.putExtra("Harga", tvHargaYsl01.getText());
                intentbarang.putExtra("Gambar", R.drawable.ysl1);
                startActivity(intentbarang);

            }
        });
        cvYsl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvYsl2 = findViewById(R.id.tvYsl2);
                tvDetailYsl2 = findViewById(R.id.tvDetailYsl2);
                tvHargaYsl02 = findViewById(R.id.tvHargaYsl02);

                Intent intentbarang = new Intent(YslActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvYsl2.getText());
                intentbarang.putExtra("Detail", tvDetailYsl2.getText());
                intentbarang.putExtra("Harga", tvHargaYsl02.getText());
                intentbarang.putExtra("Gambar", R.drawable.ysl2);
                startActivity(intentbarang);

            }
        });
        cvYsl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvYsl3 = findViewById(R.id.tvYsl3);
                tvDetailYsl3 = findViewById(R.id.tvDetailYsl3);
                tvHargaYsl03 = findViewById(R.id.tvHargaYsl03);

                Intent intentbarang = new Intent(YslActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvYsl3.getText());
                intentbarang.putExtra("Detail", tvDetailYsl3.getText());
                intentbarang.putExtra("Harga", tvHargaYsl03.getText());
                intentbarang.putExtra("Gambar", R.drawable.ysl3);
                startActivity(intentbarang);

            }
        });
        cvYsl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvYsl4 = findViewById(R.id.tvYsl4);
                tvDetailYsl4 = findViewById(R.id.tvDetailYsl4);
                tvHargaYsl04 = findViewById(R.id.tvHargaYsl04);

                Intent intentbarang = new Intent(YslActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvYsl4.getText());
                intentbarang.putExtra("Detail", tvDetailYsl4.getText());
                intentbarang.putExtra("Harga", tvHargaYsl04.getText());
                intentbarang.putExtra("Gambar", R.drawable.ysl4);
                startActivity(intentbarang);

            }
        });
        cvYsl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvYsl5 = findViewById(R.id.tvYsl5);
                tvDetailYsl5 = findViewById(R.id.tvDetailYsl5);
                tvHargaYsl05 = findViewById(R.id.tvHargaYsl05);

                Intent intentbarang = new Intent(YslActivity.this, DetailBarangActivity.class);

                intentbarang.putExtra("Title", tvYsl5.getText());
                intentbarang.putExtra("Detail", tvDetailYsl5.getText());
                intentbarang.putExtra("Harga", tvHargaYsl05.getText());
                intentbarang.putExtra("Gambar", R.drawable.ysl5);
                startActivity(intentbarang);

            }
        });
    }
}