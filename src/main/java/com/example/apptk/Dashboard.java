package com.example.apptk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {
    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        String username_index = getIntent().getStringExtra("username"); //ambil session username dan simpan di variable

        username = (TextView)findViewById(R.id.username);

        username.setText("Halo "+username_index); // set text dengan memanggil variable session

        // Inten Menu Pendaftaran
        ImageView showpendaftaran = (ImageView) findViewById(R.id.daftar);
        showpendaftaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.daftar:
                        Intent menu_pendaftaran = new Intent(Dashboard.this, Pendaftaran.class);
                        startActivity(menu_pendaftaran);
                        break;
                }
            }
        }
        );

        // Inten Menu Pembayaran
        ImageView showpembayaran = (ImageView) findViewById(R.id.bayar);
        showpembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bayar:
                        Intent menu_pembayaran = new Intent(Dashboard.this, Pembayaran.class);
                        startActivity(menu_pembayaran);
                        break;
                }
            }
        }
        );

        // Inten Menu Cek Pembayaran
        ImageView showCekPembayaran = (ImageView) findViewById(R.id.cek_pembayaran);
        showCekPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.cek_pembayaran:
                        Intent menu_cekpembayaran = new Intent(Dashboard.this, CheckPembayaran.class);
                        startActivity(menu_cekpembayaran);
                        break;
                }
            }
        }
        );

        // Inten Menu Biodata
        ImageView showbiodata = (ImageView) findViewById(R.id.bio);
        showbiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bio:
                        Intent menu_biodata = new Intent(Dashboard.this, Biodata.class);
                        menu_biodata.putExtra("username", username.getText().toString()); //Put session username berupa extras
                        startActivity(menu_biodata);
                        break;
                }
            }
        }
        );

        // Inten Menu Materi
        ImageView showmateri = (ImageView) findViewById(R.id.buku);
        showmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.buku:
                        Intent menu_materi = new Intent(Dashboard.this, Materi.class);
                        startActivity(menu_materi);
                        break;
                }
            }
        }
        );

        // Inten Menu Report
        ImageView showreport = (ImageView) findViewById(R.id.laporan);
        showreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.laporan:
                        Intent menu_report = new Intent(Dashboard.this, Report.class);
                        startActivity(menu_report);
                        break;
                }
            }
        }
        );
    }
}