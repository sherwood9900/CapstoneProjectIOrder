package com.example.CapstoneProject.IOrder.activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.CapstoneProject.IOrder.R;

import static com.example.CapstoneProject.IOrder.activity.CartActivity.grandTotal;
import static com.example.CapstoneProject.IOrder.activity.MainActivity.cartFoods;


public class OrderActivity extends AppCompatActivity {

    TextView mOrderTotal;
    Button mSMS,mEmail, mPhone;
    Drawable back;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setTitle("IOrder");
        mToolbar.setTitleTextColor(0xFFFFFFFF);

        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OrderActivity.super.onBackPressed();
            }
        });

        mOrderTotal = findViewById(R.id.order_price_total);
        mOrderTotal.setText(Double.toString(grandTotal(cartFoods)));


        mPhone = findViewById(R.id.phone_button);



        mPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, ConfirmationActivity.class);
                startActivity(intent);
            }
        });

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_confirmation, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
