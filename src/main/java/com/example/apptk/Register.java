package com.example.apptk;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class Register extends AppCompatActivity {
    private static final String TAG_SUCCESS = "success";
    private static String URL_REGISTER = "http://192.168.1.5/webtk/Login/ApiRegister"; //Url untuk memanggil file php

    EditText email, username, password; //Buat variable dengan email username dan password
    Button btnDaftar, btnReset;
    TextView loginScreen;
    ProgressDialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View ke register.xml
        setContentView(R.layout.activity_register);

        loginScreen = (TextView) findViewById(R.id.link_to_login);

        email = (EditText)findViewById(R.id.email); //untuk ambil value Nama Lengkap dari xml ke variable Email
        username = (EditText)findViewById(R.id.username); //untuk ambil value Username dari xml ke variable username
        password = (EditText)findViewById(R.id.password); //Untuk ambil value password dari XML ke variable password


        btnDaftar = (Button)findViewById(R.id.btnDaftar); // Ambil button submit di XML
        btnReset = (Button)findViewById(R.id.btnReset); // Ambil button reset di XML

        loginScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                finish();
            }
        });

        //Ketika button submit diclick manggil class InsertNewData
        btnDaftar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                //Cek jika form input masih kosong
                if(email.getText().toString().equals("") || username.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill all form", Toast.LENGTH_LONG).show();
                }else{

                    new InsertNewData().execute();
                }
            }

        });
        //Ketika button reset diklik, eksekusi method resetForm()
        btnReset.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                resetForm();
            }

        });
    }
    //insert data
    class InsertNewData extends AsyncTask<String, String, String> {
        JSONParser jsonParser = new JSONParser();

        /**
         * Before starting background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(Register.this);
            dialog.setMessage("Please wait..");
            dialog.setIndeterminate(false);
            dialog.setCancelable(true);
            dialog.show();
        }

        protected String doInBackground(String... args) {

            List<NameValuePair> params = new ArrayList<NameValuePair>(); //List untuk menyimpan data
            params.add(new BasicNameValuePair("email", email.getText().toString()));
            params.add(new BasicNameValuePair("username", username.getText().toString()));
            params.add(new BasicNameValuePair("password", password.getText().toString()));

            // ambil JSON Object di variable params
            // Note that create product url accepts POST method
            JSONObject json = jsonParser.makeHttpRequest(URL_REGISTER,
                    "POST", params);

            // check log cat fro response
            Log.d("Create Response", json.toString());

            // check for success tag
            try {
                int success = json.getInt(TAG_SUCCESS); //ambil success value yang dikirim php

                if (success == 1) { // cek jika variable success = 1, berarti registrasi berhasil
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Register Success. Please Log in!", Toast.LENGTH_LONG).show();
                        }});

                    Intent i = new Intent(Register.this, Login.class);
                    startActivity(i);
                    finish();
                } else {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Register Failed. Please check internet connection.", Toast.LENGTH_LONG).show();
                        }});

                    Intent i = new Intent(Register.this, Register.class);
                    startActivity(i);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        protected void onPostExecute(String file_url) {
            // dismiss the dialog once done
            dialog.dismiss();
        }

    }
    //fungsi untuk reset isi form
    protected void resetForm() {
        // TODO Auto-generated method stub
        email.setText("");
        username.setText("");
        password.setText("");
    }
}