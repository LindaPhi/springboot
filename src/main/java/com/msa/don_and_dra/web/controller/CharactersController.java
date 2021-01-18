package com.msa.don_and_dra.web.controller;

import com.msa.don_and_dra.model.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController      // combinaison de @controller et @ResponseBody
public class CharactersController {

    @GetMapping(value = "/Characters")
    public String displayCharacters(){
        return "Liste des personnages";
    }

    @GetMapping(value = "/Characters/{id})")         //raccourcis pour @RequestMapping
    public Character displayById(@PathVariable int id){
        Character perso=new Character(id, new String("Conan"), new String("Warrior"));
        return perso;
    }
}
