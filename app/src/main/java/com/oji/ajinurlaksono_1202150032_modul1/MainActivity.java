package com.oji.ajinurlaksono_1202150032_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    //String extra = "jumlah";
    EditText jum;
    EditText menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {  //method untuk menjalankan tombol Eatbuss
        Intent intent  = new Intent(this, kedua.class); //intent menuju class kedua
        jum = (EditText) findViewById(R.id.jumlah);  //inisiasi attribute
        String jumlah = jum.getText().toString(); //menampung attribute pada string
        menu = (EditText) findViewById(R.id.makan); //inisiasi attribute
        String makan = menu.getText().toString(); //menampung attribute pada string
        intent.putExtra("tempat","Eatbus"); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("menu",makan); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("jumlah",jumlah); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("harga","50000"); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        startActivity(intent); // start activity dengan parameter intent yang sudah diinisiasi sebelumnya

    }

    public void abnormal(View view) { //method untuk menjalankan tombol Abnormal
        Intent intent  = new Intent(this, kedua.class); //intent menuju class kedua
        jum = (EditText) findViewById(R.id.jumlah); //inisiasi attribute
        String jumlah = jum.getText().toString(); //menampung attribute pada string
        menu = (EditText) findViewById(R.id.makan); //inisiasi attribute
        String makan = menu.getText().toString(); //menampung attribute pada string
        intent.putExtra("tempat","Abnormal"); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("menu",makan); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("jumlah",jumlah); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        intent.putExtra("harga","30000"); //memberikan informasi tambahan untuk data yang akan di oper ke aktivitas lain
        startActivity(intent); // start activity dengan parameter intent yang sudah diinisiasi sebelumnya

    }
}
