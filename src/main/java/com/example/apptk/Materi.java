package com.example.apptk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        // Inten Membaca
        ImageView membaca = (ImageView) findViewById(R.id.materibaca);
        membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.materibaca:
                        Intent menu_membaca = new Intent(Materi.this, Membaca.class);
                        startActivity(menu_membaca);
                        break;
                }
            }
        }
        );
    }
}