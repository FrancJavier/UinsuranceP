package com.example.uinsurancep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PlanillaSiniestro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planilla1);
    }

    public void Auto(View v) {
        Intent Auto = new Intent(Intent.ACTION_VIEW);
        startActivity(Auto);
    }
    public void Volver(View v){
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
