package com.example.day10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText porsi;
    private RadioGroup makan, minum;
    private Button btnpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        porsi = findViewById(R.id.porsi);
        makan = findViewById(R.id.makan);
        minum = findViewById(R.id.minum);
        btnpesan = findViewById(R.id.btnpesan);

        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalharga = 0;
            }

            int selectedMakananId = makan.getCheckedRadioButtonId();
                switch (selectedMakananId) {
                case R.id.rbNasiGoreng:
                    Harga = 10000;
                    break;
                case R.id.rbMieRebus:
                    Harga += 8000;
                    break;
                case R.id.rbMieGoreng:
                    Harga += 8000;
                    break;
                case R.id.rbNasiUduk:
                    Harga += 15000;
                    break;
            }

            int selectedMinumanId = minum.getCheckedRadioButtonId();
                switch (selectedMinumanId) {
                case R.id.rbTehEs:
                    Harga += 10000;
                    break;
                case R.id.rbEsJeruk:
                    totalHarga += 10000;
                    break;
            }


                jumlahPesananTextView.setText("Total Harga: Rp " + totalHarga);

            // Berpindah ke halaman detail
            Intent intent = new Intent(MainActivity.this, HasilPesanan.class);
                intent.putExtra("TOTAL_HARGA", totalHarga);
            startActivity(intent);
        }
    });
}
        });
    }

}