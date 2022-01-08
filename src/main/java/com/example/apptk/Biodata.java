package com.example.apptk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {
    TextView username;
    TextView no_induk;
    TextView nama_lengkap;
    TextView jenkel;
    TextView hobi;
    TextView ttl;
    ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        String username_biodata = getIntent().getStringExtra("username"); //ambil session username dan simpan di variable
        username = (TextView)findViewById(R.id.username);
        username.setText(username_biodata); // set text dengan memanggil variable session



        // Inten Button Back
        Button kembali = (Button) findViewById(R.id.back);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.back:
                        Intent i = new Intent(Biodata.this, Dashboard.class);
                        startActivity(i);
                        break;
                }
            }
        }
        );
    }
}