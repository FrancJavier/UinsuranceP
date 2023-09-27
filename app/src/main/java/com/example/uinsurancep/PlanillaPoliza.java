package com.example.uinsurancep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class PlanillaPoliza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planilla_poliza);

    }



    public void Volver(View v) {
        Intent Volver = new Intent(this, MainActivity.class);
        startActivity(Volver);

    }

    public void Pagar(View v) {
        String url = "https://www.bancoestado.cl/content/bancoestado-public/cl/es/home/home.html#/"; // Reemplaza esto con la URL que deseas abrir
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}



