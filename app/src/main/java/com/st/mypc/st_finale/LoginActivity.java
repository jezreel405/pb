package com.st.mypc.st_finale;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        btnlogin = (Button) findViewById(R.id.button);
        btnlogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String txtuser = user.getText().toString();
        String txtpass = pass.getText().toString();

        if ((txtuser.equals("admin")) && (txtpass.equals("ccs"))) {
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_SHORT).show();
            Intent n = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(n);
        } else {
            AlertDialog.Builder ab = new AlertDialog.Builder(this);
            ab.setTitle("Error");
            ab.setMessage("Login Failed");
            ab.setNeutralButton("Ok", null);

            AlertDialog a = ab.create();
            a.show();
        }
    }
}
