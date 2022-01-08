package com.example.apptk;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.AsyncTask;
import android.app.ProgressDialog;
import android.util.Log;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    EditText username, password;
    Button btnLogin, btnReset;
    ProgressDialog dialog;
    private static final String TAG_SUCCESS = "success";

    private static String URL_LOGIN = "http://192.168.1.5/webtk/Login/ApiLogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerScreen = (TextView) findViewById(R.id.link_to_register);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnReset = (Button)findViewById(R.id.btnReset);

        // Mengambil link ke register new account
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Beralih ke tampilan screen Register
                Intent i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                if(username.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Please fill all form", Toast.LENGTH_LONG).show();
                }else{

                    new ValidateLogin().execute();
                }
            }

        });
        btnReset.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                resetForm();
            }

        });

    }
    class ValidateLogin extends AsyncTask<String, String, String> {
        JSONParser jsonParser = new JSONParser();

        /**
         * Before starting background thread Show Progress Dialog
         * */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog = new ProgressDialog(Login.this);
            dialog.setMessage("Please wait...");
            dialog.setIndeterminate(false);
            dialog.setCancelable(true);
            dialog.show();
        }

        protected String doInBackground(String... args) {

            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("username", username.getText().toString()));
            params.add(new BasicNameValuePair("password", password.getText().toString()));

            JSONObject json = jsonParser.makeHttpRequest(URL_LOGIN,
                    "POST", params);

            // check log cat fro response
            Log.d("Create Response", json.toString());

            // check for success tag
            try {
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Login Berhasil.", Toast.LENGTH_LONG).show();
                        }});

                    Intent i = new Intent(Login.this, Dashboard.class);
                    i.putExtra("username", username.getText().toString()); //Put session username berupa extras
                    startActivity(i);
                    finish();
                } else {
                    runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(getApplicationContext(), "Login Failed. Please try again.", Toast.LENGTH_LONG).show();
                        }});

                    Intent i = new Intent(Login.this, Login.class);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    protected void resetForm() {
        // TODO Auto-generated method stub
        username.setText("");
        password.setText("");
    }

}