package com.msa.don_and_dra.web.controller;

import com.msa.don_and_dra.model.Perso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class persoController {
    @GetMapping(value = "/perso")
    public String displayPerso(){
        return "Liste des perso";
    }
    @GetMapping(value = "/perso/{id}")
    public Perso display_by_id(@PathVariable int id){
        Perso mon_perso = new Perso(id, new String("Moi"), new String("Guerrier"));
        return mon_perso;
    }
}
