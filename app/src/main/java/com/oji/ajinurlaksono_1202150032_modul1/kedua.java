package com.oji.ajinurlaksono_1202150032_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class kedua extends AppCompatActivity {

    TextView jumlah;
    TextView tempat;
    TextView menu;
    TextView harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        Intent intent =getIntent();
        String pJumlah = intent.getStringExtra("jumlah");
        String pTempat = intent.getStringExtra("tempat");
        String pMenu = intent.getStringExtra("menu");
        String pHarga = intent.getStringExtra("harga");
        int jHarga = Integer.valueOf(pHarga)*Integer.valueOf(pJumlah);


        jumlah = (TextView) findViewById(R.id.tJumlah);
        jumlah.setText(pJumlah);
        tempat = (TextView) findViewById(R.id.tTempat);
        tempat.setText(pTempat);
         menu = (TextView) findViewById(R.id.tMenu);
        menu.setText(pMenu);
//String h = String.va
        harga = (TextView) findViewById(R.id.tHarga);
        harga.setText(String.valueOf(jHarga));

        if(jHarga > 65000){
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan Makan Malam Di sini!! Uang Kamu Tidak Cukup", Toast.LENGTH_LONG);
            toast.show();

        }else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan Malam Di sini aja nihh", Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
