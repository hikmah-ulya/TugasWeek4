package com.example.tugasweek4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
 TextView tvNama, tvInstitusi;
 Button btnActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNama = findViewById(R.id.tv_nama);
        tvInstitusi = findViewById(R.id.tv_institusi);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)){
            tvNama.setText("Nama :");
        }else{
            tvNama.setText("Nama : "+ nama);
        }
        if (TextUtils.isEmpty(institusi)){
            tvInstitusi.setText("Asal Institusi : ");
        } else {
            tvInstitusi.setText("Asal Institusi : "+institusi);
        }
        btnActivity3.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(moveIntent);
            }
        });

    }

}