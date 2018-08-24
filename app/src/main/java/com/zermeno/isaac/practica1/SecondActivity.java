package com.zermeno.isaac.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //private String miTexto;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView = findViewById(R.id.miTexto);



        //miTexto = getIntent().getStringExtra("miTexto bla bla bla");
        String miTexto = getIntent().getStringExtra("miTexto bla bla bla");

        myTextView.setText(miTexto);
    }
}
