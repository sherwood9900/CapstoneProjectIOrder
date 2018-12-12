package com.example.CapstoneProject.IOrder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    private EditText txtUsername;
    private EditText txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        txtUsername = (EditText) findViewById(R.id.txtUser);
        txtPass = (EditText) findViewById(R.id.txtPassword);
    }

    public void loginAdmin(View view){

        if (txtUsername.getText().toString().equals("admin") && txtPass.getText().toString().equals("12345"))
        {
            Intent i = new Intent(AdminLogin.this, AdminView.class);
            startActivity(i);
        }
        else {
            Toast.makeText(AdminLogin.this, "Invalid Input", Toast.LENGTH_LONG).show();
        }

    }

}
