package com.example.android.justjava;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //This method is called when the - button is clicked.

    public void decrement(View view){
        int quantity = 1;
        display(quantity);
        displayPrice(quantity * 5);
    }

    //This method is called when the + button is clicked.

    public void increment(View view){
        int quantity = 3;
        display(quantity);
        displayPrice(quantity * 5);
    }


    //this method is called when the order button is clicked

    public void submitOrder(View view){
        int quantity = 2;
        display(quantity);
        displayPrice(quantity * 5);

    }


    //This method clears the displays  // TODO: 2017-03-05 use this function somehow!
    public void clearOrder(View View){
        display(0);
        displayPrice(0);
    }

    //this method displays the given quantity value on the screen.
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    //This method displays the given quantity value/cost on the screen.
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}