package com.example.productmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Product[] products = Storage.getProducts();

        EditText productName = findViewById(R.id.enter_product_name);

        int productID = 0;

        for (int i = 0; i < products.length; i++) {
            if(Objects.equals(products[i].getProductName(), productName.getText().toString())){
                productID = i;
            }
        }
        String productInfo = "Название продукта:" + products[productID].getProductName() + "\n"+
                "Дата поступления:" + products[productID].getProductDate() + "\n" +
                "Количество:" + products[productID].getProductCount() + "\n" +
                "Цена:" + products[productID].getProductPrice();
        TextView textView = findViewById(R.id.text_activity2);
        textView.setText(productInfo);
    }
}