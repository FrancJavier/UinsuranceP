package com.example.uinsurancep.Controlador;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ConexionHelper extends SQLiteOpenHelper {

    public ConexionHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { db.execSQL(Utility.CREAR_TABLA_USUARIO);}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+Utility.TABLA_USUARIO);
        onCreate(db);
    }



    // METODO PARA QUE A TRAVÉS DEL RUT APAREZCA NOMBRE EN EL MAIN
    public String obtenerNombrePorRut(String rut) {
        SQLiteDatabase db = this.getReadableDatabase();
        String nombre = null;

        try {
            Cursor cursor = db.rawQuery("SELECT " + Utility.CAMPO_NOMBRES + " FROM " +
                    Utility.TABLA_USUARIO + " WHERE " + Utility.CAMPO_RUT + "=? AND " +
                    Utility.CAMPO_CLAVE + "=?", new String[]{rut});

            if (cursor.moveToFirst()) {
                nombre = cursor.getString(cursor.getColumnIndex(Utility.CAMPO_NOMBRES));
            }

            cursor.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return nombre;
    }

    public String obtenerNombrePorRutYClave(String rut, String clave) {
        SQLiteDatabase db = this.getReadableDatabase();
        String nombre = null;

        try {
            String[] projection = {Utility.CAMPO_NOMBRES};
            String selection = Utility.CAMPO_RUT + " = ? AND " + Utility.CAMPO_CLAVE + " = ?";
            String[] selectionArgs = {rut, clave};

            Cursor cursor = db.query(
                    Utility.TABLA_USUARIO,
                    projection,
                    selection,
                    selectionArgs,
                    null,
                    null,
                    null
            );

            if (cursor.moveToFirst()) {
                nombre = cursor.getString(cursor.getColumnIndex(Utility.CAMPO_NOMBRES));
            }

            cursor.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.close();
        }

        return nombre;
    }


}
