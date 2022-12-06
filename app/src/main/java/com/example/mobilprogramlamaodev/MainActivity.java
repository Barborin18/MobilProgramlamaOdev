package com.example.mobilprogramlamaodev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_sayi1;
    EditText editText_sayi2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_Kontrol);
        editText_sayi1 = findViewById(R.id.editTextNumber_Sayi1);
        editText_sayi2 = findViewById(R.id.editTextNumber_Sayi2);
    }

    public void kontrol(View view){
        int sayi1 = Integer.parseInt(editText_sayi1.getText().toString());
        int sayi2 = Integer.parseInt(editText_sayi2.getText().toString());
        if(sayi1>sayi2){
            Toast.makeText(MainActivity.this,"1. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi2>sayi1){
            Toast.makeText(MainActivity.this,"2. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi1==sayi2){
            Toast.makeText(MainActivity.this,"İki Sayı Birbirine Eşittir.",Toast.LENGTH_LONG).show();
        }
    }
}