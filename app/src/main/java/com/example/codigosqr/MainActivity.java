package com.example.codigosqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    TextView tv_mostrarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tv_mostrarDatos = findViewById(R.id.txt);
    }

    //METODO ON CLICK
    public void onclick(View view){
        if(view.getId() == R.id.AbrirScanner){
            new IntentIntegrator(this).initiateScan();
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        //LLAMAR A LA INFORMACION
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        //OBTENER LA INFORMACION EN UN STRING
        String datos = result.getContents();
        tv_mostrarDatos.setText(datos);
    }

}