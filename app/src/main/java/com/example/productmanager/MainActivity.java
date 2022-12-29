package com.example.productmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button changeActivity = findViewById(R.id.button_find_product_activity1);
        Button addProductButton = findViewById(R.id.button_add_product);

        EditText enterProductName = findViewById(R.id.product_name);
        EditText enterProductDate = findViewById(R.id.product_date);
        EditText enterProductCount = findViewById(R.id.product_count);
        EditText enterProductPrice = findViewById(R.id.product_price);

        changeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(switcher);
            }
        });
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Storage.addProduct(new Product(enterProductName.getText().toString(), enterProductDate.getText().toString(), Integer.parseInt(enterProductCount.getText().toString()), Integer.parseInt(enterProductPrice.getText().toString())));
            }
        });
    }
}