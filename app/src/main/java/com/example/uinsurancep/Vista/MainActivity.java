package com.example.uinsurancep.Vista;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import com.example.uinsurancep.R;
import android.text.InputType;
import android.text.InputFilter;
import android.text.Editable;


public class MainActivity extends AppCompatActivity {

    //ID
    ImageButton imgBtnOficinas;
    ImageButton ImgBtnWhatssap;
    Button Olvidar;
    EditText RutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Debes inicializar imgBtnOficinas después de haber llamado setContentView
        imgBtnOficinas = findViewById(R.id.Oficinas);
        imgBtnOficinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ubicacion.class);
                startActivity(intent);
            }
        });

        Olvidar = findViewById(R.id.Olvidar);
        Olvidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecuperacionContrasena.class);
                startActivity(intent);
            }
        });

        //MÉTODO WHATSSAP AYUDA
        ImgBtnWhatssap = findViewById(R.id.whatssap);
        ImgBtnWhatssap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://web.whatsapp.com/"; // Reemplaza esto con la URL que deseas abrir
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        // RUT
        RutMain = findViewById(R.id.RutMain);
        // Configura el tipo de entrada para permitir solo números y las letras 'k' y 'K'
        RutMain.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS);



        // Agregar un TextWatcher al EditText para validar mientras el usuario escribe
        RutMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                // No se necesita implementar en este caso
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                // No se necesita implementar en este caso
            }

            @Override
            public void afterTextChanged(Editable editable) {
                validarRut(editable.toString());
            }
        });
    }

    // Método para validar el formato del RUT
    private void validarRut(String rut) {
        // Eliminar espacios y guiones del RUT
        String rutLimpio = rut.replaceAll("[.]", "").replaceAll("[-]", "").trim();

        // Validar el formato del RUT
        if (validarFormatoRut(rutLimpio)) {
            // El RUT tiene el formato correcto
            // Aquí puedes implementar la lógica para validar el dígito verificador, por ejemplo.
        } else {
            // El RUT no tiene el formato correcto
            RutMain.setError("RUT inválido");
        }
    }

    // Método para validar el formato general del RUT
    private boolean validarFormatoRut(String rut) {
        // Utiliza la expresión regular para permitir solo números y las letras 'k' y 'K'
        boolean formatoValido = rut.matches("[0-9kK]+");

        // Retorna el resultado de la validación de formato
        return formatoValido;
    }




    // METODOS INGRESAR Y REGISTRAR
    public void Ingresar(View v) {
        Intent Ingresar = new Intent(this, PlanillaSiniestro.class);
        startActivity(Ingresar);
    }

    // Método para manejar el clic en el botón "Registrar"
    public void Registrar(View v) {
        Intent Registrar = new Intent(this, Registro.class);
        startActivity(Registrar);

    }
}
