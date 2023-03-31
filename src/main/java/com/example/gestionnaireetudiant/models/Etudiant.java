package com.example.gestionnaireetudiant.models;

public class Etudiant {


    public Etudiant(String nom, String prenom, double moyenne) {
        if(nom == null) {
            throw new IllegalArgumentException("le nom ne doit pas être null");
        }
        if(nom.isEmpty()) {
            throw new IllegalArgumentException("le nom ne doit pas être vide");
        }

    }
}
