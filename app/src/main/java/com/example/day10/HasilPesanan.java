package com.example.day10;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HasilPesanan extends AppCompatActivity {

    private TextView menu, porsi, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pesanan);

        menu = findViewById(R.id.menu);
        porsi tv4 = findViewById(R.id.porsii);
        harga tv5 = findViewById(R.id.harga);

        if (RESTRICTIONS_SERVICE != null) {

            String pesanan1 = RESTRICTIONS_SERVICE.toString("pesanan1");
            menu.setText(pesanan1);
        }            if (RESTRICTIONS_SERVICE.contains("pesanan2")) {
            String pesanan2 = RESTRICTIONS_SERVICE.toString("pesanan2");
            porsi.setText(pesanan2);
        }            if (RESTRICTIONS_SERVICE.contains("pesanan3")) {
            String pesanan3 = RESTRICTIONS_SERVICE.toString("pesanan3");
            harga.setText(pesanan3);
        }            if (RESTRICTIONS_SERVICE.contains("pesanan4")) {
            String pesanan4 = RESTRICTIONS_SERVICE.toString("pesanan4");
            tv5.setText(pesanan4);
        }        }
}