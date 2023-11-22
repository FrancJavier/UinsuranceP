package com.example.uinsurancep.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uinsurancep.Controlador.ConexionHelper;
import com.example.uinsurancep.Controlador.Utility;
import com.example.uinsurancep.R;

public class Registro extends AppCompatActivity {

    EditText rutRegistro;
    EditText claveRegistro;
    EditText nombresRegistro;
    EditText apellidoPaternoRegistro;
    EditText apellidoMaternoRegistro;
    EditText emailRegistro;
    EditText celularRegistro;
    Button btnregistrarseRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        rutRegistro = findViewById(R.id.rutRegistro);
        claveRegistro = findViewById(R.id.claveRegistro);
        nombresRegistro = findViewById(R.id.nombresRegistro);
        apellidoPaternoRegistro = findViewById(R.id.apellidoPaternoRegistro);
        apellidoMaternoRegistro = findViewById(R.id.apellidoMaternoRegistro);
        emailRegistro = findViewById(R.id.emailRegistro);
        celularRegistro = findViewById(R.id.celularRegistro);
        btnregistrarseRegistro = findViewById(R.id.registarseRegistro);

        btnregistrarseRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarUsuarios();
            }

        });
    }

    private void registrarUsuarios(){
        ConexionHelper conn = new ConexionHelper(this, "bd_usuarios", null,1);
        SQLiteDatabase db = conn.getReadableDatabase();

        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Utility.CAMPO_RUT, rutRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_CLAVE, claveRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_NOMBRES, nombresRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_APELLIDO_PATERNO, apellidoPaternoRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_APELLIDO_MATERNO, apellidoMaternoRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_CORREO, emailRegistro.getText().toString());
            contentValues.put(Utility.CAMPO_CELULAR, celularRegistro.getText().toString());

            long rutResultante = db.insert(Utility.TABLA_USUARIO, null, contentValues);

            if (rutResultante != -1) {
                // Éxito
                Toast.makeText(Registro.this, "Usuario registrado con éxito", Toast.LENGTH_SHORT).show();
            } else {
                // Error
                Toast.makeText(Registro.this, "Error al registrar usuario", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
        } finally {
            // Cerrar la conexión con la base de datos
            db.close();
        }


    }

}