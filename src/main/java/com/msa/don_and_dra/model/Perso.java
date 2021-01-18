package com.msa.don_and_dra.model;

public class Perso {
    private int id;
    private String nom;
    private String type;

    public Perso() {
    }

    @Override
    public String toString() {
        return "Perso{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Perso(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }
}
