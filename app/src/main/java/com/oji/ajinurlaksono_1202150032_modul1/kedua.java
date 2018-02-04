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
        Intent intent =getIntent(); // inisasi intent yang akan menerima informasi dari class sebelumnya dan menampung ke variable
        String pJumlah = intent.getStringExtra("jumlah"); //menangkap informasi tambahan yang dikirimkan class sebelumnya dan menampung ke variable
        String pTempat = intent.getStringExtra("tempat"); //menangkap informasi tambahan yang dikirimkan class sebelumnya dan menampung ke variable
        String pMenu = intent.getStringExtra("menu"); //menangkap informasi tambahan yang dikirimkan class sebelumnya dan menampung ke variable
        String pHarga = intent.getStringExtra("harga"); //menangkap informasi tambahan yang dikirimkan class sebelumnya dan menampung ke variable
        int jHarga = Integer.valueOf(pHarga)*Integer.valueOf(pJumlah); //menghintung jumlah harga, yaitu harga satuan dikali jumlah porsi


        jumlah = (TextView) findViewById(R.id.tJumlah); //inisiasi attribute
        jumlah.setText(pJumlah); //set Tampilan TextView sesuai attribute
        tempat = (TextView) findViewById(R.id.tTempat); //inisiasi attribute
        tempat.setText(pTempat); //set Tampilan TextView sesuai attribute
         menu = (TextView) findViewById(R.id.tMenu); //inisiasi attribute
        menu.setText(pMenu); //set Tampilan TextView sesuai attribute
//String h = String.va
        harga = (TextView) findViewById(R.id.tHarga); //inisiasi attribute
        harga.setText(String.valueOf(jHarga)); //set Tampilan TextView sesuai attribute

        if(jHarga > 65000){ //perkondisian dimana jumlah harga lebih besar dari 650000
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Jangan Makan Malam Di sini! Uang Kamu Tidak Cukup", Toast.LENGTH_LONG); //memberi pesan yang ditampilkan pada toast
            toast.show(); //menampilkan toast

        }else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Makan Malam Di sini aja nihh", Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
