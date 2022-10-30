package com.example.vcard;

import com.example.vcard.models.Empleado;
import com.example.vcard.models.Tarjeta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class Configuracion {

    @Bean
    public List<Empleado> mostrarEmpleado(){
        Empleado empleado = new Empleado(
           "Danny",
           "Tenemea",
           "danny@gmail.com",
           "0987548707",
           "Gerente",
           "https://i.postimg.cc/zfB4vXf9/avatar-m.png"
        );
        Empleado empleado2 = new Empleado(
                "Marlon",
                "Vélez",
                "marlon@gmail.com",
                "0996826875",
                "Contabilidad",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png"
        );
        Empleado empleado3 = new Empleado(
                "Paola",
                "Criollo",
                "paola@gmail.com",
                "0992124300",
                "Publicidad",
                "https://i.postimg.cc/ZK4B04M0/usuaio-Mujer.jpg"
        );
        Empleado empleado4 = new Empleado(
                "William",
                "Tocto",
                "william@gmail.com",
                "095367924",
                "Recursos Humanos",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png"
        );
        Empleado empleado5 = new Empleado(
                "José",
                "Murillo",
                "jose@gmail.com",
                "0992579684",
                "Administrador",
                "https://i.postimg.cc/zfB4vXf9/avatar-m.png"
        );
        return Arrays.asList(empleado,empleado2, empleado3, empleado4, empleado5);
    }

    @Bean
    public List<Tarjeta> mostrarEmpresa(){
        Tarjeta tarjeta = new Tarjeta(
                "NacSoft",
                "Software",
                "nacsoft@gmail.com",
                "totoracocha"
        );
        Tarjeta tarjeta2 = new Tarjeta(
                "Futura",
                "Software",
                "futura@gmail.com",
                "Venedicto XVII"
        );
        Tarjeta tarjeta3 = new Tarjeta(
                "WillSoftTec",
                "Software",
                "willsofttec@gmail.com",
                "ISTA"
        );
        Tarjeta tarjeta4 = new Tarjeta(
                "OPEN",
                "Software",
                "open@gmail.com",
                "Av. Paucarbamba"
        );
        Tarjeta tarjeta5 = new Tarjeta(
                "GensiSoft",
                "Software",
                "gensi@gmail.com",
                "9 de Octubre"
        );
        return Arrays.asList(tarjeta, tarjeta2, tarjeta3, tarjeta4, tarjeta5);
    }

}
