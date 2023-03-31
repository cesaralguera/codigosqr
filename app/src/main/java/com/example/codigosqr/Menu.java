package com.example.codigosqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btnLeerQR, btnGenQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnLeerQR = (Button)findViewById(R.id.btnLeerQR);
        btnGenQR = (Button) findViewById(R.id.btnGenQR);

        btnLeerQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina1 =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pagina1);
            }
        });

        btnGenQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagina2 =new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pagina2);
            }
        });


    }
}