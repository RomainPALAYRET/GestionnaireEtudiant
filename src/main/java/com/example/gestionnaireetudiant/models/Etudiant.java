package com.example.gestionnaireetudiant.models;

public class Etudiant {


    public Etudiant(String nom, String prenom, double moyenne) {
        if(nom == null || prenom == null) {
            throw new IllegalArgumentException("le nom et le prenom ne doivent pas être null");
        }
        if(nom.isEmpty() || prenom.isEmpty()) {
            throw new IllegalArgumentException("le nom et le prénom ne doivent pas être vide");
        }
        if(moyenne < 0) {
            throw new IllegalArgumentException("la moyenne ne peut pas être négative");
        }


    }
}
