package com.example.CapstoneProject.IOrder.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.CapstoneProject.IOrder.AdminLogin;
import com.example.CapstoneProject.IOrder.R;

public class Login extends AppCompatActivity {

    private static Spinner spinner;
    private EditText txtPassword;
    public static final String EXTRA_TEXT = "com.example.shehrooz.foodish.EXTRA_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn1 = findViewById(R.id.button);
        Button bntAdmin = findViewById(R.id.btnAdmin);
        spinner = (Spinner) findViewById(R.id.spinner);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Number, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (txtPassword.getText().toString().isEmpty()){
                        Toast.makeText(Login.this, "Enter the Password", Toast.LENGTH_LONG).show();
                    }
                    else{
                        String tableNum = spinner.getSelectedItem().toString();
                        Intent i = new Intent(Login.this, MainActivity.class);
                        i.putExtra(EXTRA_TEXT, tableNum);
                        startActivity(i);
                    }



            }
        });

        bntAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, AdminLogin.class);
                startActivity(i);
            }
        });

    }



}
