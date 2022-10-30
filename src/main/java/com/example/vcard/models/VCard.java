package com.example.vcard.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VCard {
    @Autowired
    private List<Empleado> listEmpleado;
    @Autowired
    private List<Tarjeta> listTarjeta;

    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

//    public Tarjeta getListTarjeta() {
//        return listTarjeta;
//    }
//
//    public void setListTarjeta(Tarjeta listTarjeta) {
//        this.listTarjeta = listTarjeta;
//    }

    public List<Tarjeta> getListTarjeta() {
        return listTarjeta;
    }

    public void setListTarjeta(List<Tarjeta> listTarjeta) {
        this.listTarjeta = listTarjeta;
    }
}
