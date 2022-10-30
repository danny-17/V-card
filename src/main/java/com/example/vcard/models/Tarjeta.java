package com.example.vcard.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class Tarjeta {
//    @Value("${tarjeta.titulo}")
    private String nombre_empresa;

//    @Value("${tarjeta.empresa}")
    private String tipo_empresa;

//    @Value("${tarjeta.correoEmpresa}")
    private String correo_empresa;

   // @Value("${tarjeta.ubicacion}")
    private String ubicacion;

    public Tarjeta(String nombre_empresa, String tipo_empresa, String correo_empresa, String ubicacion) {
        this.nombre_empresa = nombre_empresa;
        this.tipo_empresa = tipo_empresa;
        this.correo_empresa = correo_empresa;
        this.ubicacion = ubicacion;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(String tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public String getCorreo_empresa() {
        return correo_empresa;
    }

    public void setCorreo_empresa(String correo_empresa) {
        this.correo_empresa = correo_empresa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
