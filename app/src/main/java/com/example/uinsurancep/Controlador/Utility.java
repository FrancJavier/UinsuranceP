package com.example.uinsurancep.Controlador;

public class Utility {

    public static final String TABLA_USUARIO = "usuario";
    public static final String CAMPO_RUT = "rut";
    public static final String CAMPO_CLAVE = "clave";
    public static final String CAMPO_NOMBRES = "nombres";
    public static final String CAMPO_APELLIDO_PATERNO = "apellido_paterno";
    public static final String CAMPO_APELLIDO_MATERNO = "apellido_materno";
    public static final String CAMPO_CORREO = "correo";
    public static final String CAMPO_CELULAR = "celular";

    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE " +
            "" + TABLA_USUARIO + "(" +
            //CAMPO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            CAMPO_RUT + " TEXT, " +
            CAMPO_CLAVE + " TEXT, " +
            CAMPO_NOMBRES + " TEXT, " +
            CAMPO_APELLIDO_PATERNO + " TEXT, " +
            CAMPO_APELLIDO_MATERNO + " TEXT, " +
            CAMPO_CORREO + " TEXT, " +
            CAMPO_CELULAR + " TEXT)";

}
