package com.msa.don_and_dra.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.msa.don_and_dra.model.Perso;
import com.msa.don_and_dra.dao.PersoDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersoController {

    @Autowired
    private PersoDao persoDao;

    @GetMapping(value = "/persos")
    public List<Perso> displaylist(){
        return persoDao.findAll();
    }
    @GetMapping(value = "/persos/{id}")
    public Perso display_by_id(@PathVariable int id){
        return persoDao.PersofindById(id);
    }

}
