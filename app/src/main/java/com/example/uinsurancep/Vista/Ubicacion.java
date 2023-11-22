package com.example.uinsurancep.Vista;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.uinsurancep.R;

public class Ubicacion extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

    }

    public void openMapForSantiago(View view) {
        ImageButton MapaSantiago = findViewById(R.id.Santiago);

        Uri gmmIntentUri = Uri.parse("geo:-33.427991746076636, -70.65456497715115?q=Plaza de Armas - Santiago"); // Abre el mapa para Santiago (reemplaza las coordenadas con las correctas)
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");  // Asegúrate de que solo se abra en la aplicación de mapas de Google
        startActivity(mapIntent);
    }

    public void openMapForOvalle(View view) {
        ImageButton MapaSantiago = findViewById(R.id.Ovalle);

        Uri gmmIntentUri = Uri.parse("geo:-30.602691681303128, -71.20252700371908?q=Plaza de Armas - Ovalle"); // Abre el mapa para Santiago (reemplaza las coordenadas con las correctas)
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");  // Asegúrate de que solo se abra en la aplicación de mapas de Google
        startActivity(mapIntent);
    }

    public void openMapForCoquimbo(View view) {
        ImageButton MapaSantiago = findViewById(R.id.Coquimbo);

        Uri gmmIntentUri = Uri.parse("geo:-29.953156686874873, -71.33780772281051?q=Plaza de Armas - Coquimbo"); // Abre el mapa para Santiago (reemplaza las coordenadas con las correctas)
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");  // Asegúrate de que solo se abra en la aplicación de mapas de Google
        startActivity(mapIntent);
    }

    public void openMapForSerena(View view) {
        ImageButton MapaSantiago = findViewById(R.id.Serena);

        Uri gmmIntentUri = Uri.parse("geo:-29.90258937006963, -71.25190041723796?q=Plaza de Armas - La Serena"); // Abre el mapa para Santiago (reemplaza las coordenadas con las correctas)
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");  // Asegúrate de que solo se abra en la aplicación de mapas de Google
        startActivity(mapIntent);
    }
}







