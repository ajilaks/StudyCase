package com.oji.ajinurlaksono_1202150032_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    String extra = "jumlah";
    EditText jum;
    EditText menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        Intent intent  = new Intent(this, kedua.class);
        jum = (EditText) findViewById(R.id.jumlah);
        String jumlah = jum.getText().toString();
        menu = (EditText) findViewById(R.id.makan);
        String makan = menu.getText().toString();
        intent.putExtra("tempat","Eatbus");
        intent.putExtra("menu",makan);
        intent.putExtra("jumlah",jumlah);
        intent.putExtra("harga","50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        Intent intent  = new Intent(this, kedua.class);
        jum = (EditText) findViewById(R.id.jumlah);
        String jumlah = jum.getText().toString();
        menu = (EditText) findViewById(R.id.makan);
        String makan = menu.getText().toString();
        intent.putExtra("tempat","Abnormal");
        intent.putExtra("menu",makan);
        intent.putExtra("jumlah",jumlah);
        intent.putExtra("harga","30000");
        startActivity(intent);

    }
}
