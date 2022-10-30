package com.example.vcard.controller;

import com.example.vcard.models.Tarjeta;
import com.example.vcard.models.VCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/tarjeta")
@Controller
public class TarjetaController {
    @Autowired
    private VCard vCard;

    @GetMapping("/ver")
    public String index(Model model){
        model.addAttribute("tarjeta", vCard);
        model.addAttribute("titulo", "Tarjeta de Presentacion");
        return "ver";
    }
}
