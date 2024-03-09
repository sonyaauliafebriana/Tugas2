package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBarangActivity extends AppCompatActivity {

    private ImageView ivGambar;
    private TextView tvTitle, tvDetail, tvHarga;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_barang);

        String title = getIntent().getStringExtra("Title");
        String detail = getIntent().getStringExtra("Detail");
        String harga = getIntent().getStringExtra("Harga");
        int gambarResource = getIntent().getIntExtra("Gambar", 0);

        ivGambar = findViewById(R.id.ivGambar);
        tvTitle = findViewById(R.id.tvTitle);
        tvDetail = findViewById(R.id.tvDetail);
        tvHarga = findViewById(R.id.tvHarga);
        btnShare = findViewById(R.id.btnShare);

        ivGambar.setImageResource(gambarResource);
        tvTitle.setText(title);
        tvDetail.setText(detail);
        tvHarga.setText(harga);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = title + "\n" + detail + "\n" + "Harga: " + harga;

                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, text);

                startActivity(Intent.createChooser(share, "pilih Aplikasi"));
            }
        });

    }
}