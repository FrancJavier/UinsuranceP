package com.example.uinsurancep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresar(View v) {
        Intent Ingresar = new Intent(this, PlanillaSiniestro.class);
        startActivity(Ingresar);
    }


    public void Facebook(View v) {
        String url = "https://www.facebook.com"; // Reemplaza esto con la URL que deseas abrir
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void X(View v) {
        String url = "https://www.twiter.com"; // Reemplaza esto con la URL que deseas abrir
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void Instagram(View v) {
        String url = "https://www.instagram.com"; // Reemplaza esto con la URL que deseas abrir
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void Registrar(View v){
        Intent Registrar = new Intent(this, Registro.class);
        startActivity(Registrar);

    }

}