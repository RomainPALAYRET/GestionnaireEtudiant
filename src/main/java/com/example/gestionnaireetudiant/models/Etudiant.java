package com.example.gestionnaireetudiant.models;

public class Etudiant {



    double moyenne;

    public Etudiant(String nom, String prenom, double moyenne) {
        if(nom == null || prenom == null) {
            throw new IllegalArgumentException("le nom et le prenom ne doivent pas être null");
        }
        if(nom.isEmpty() || prenom.isEmpty()) {
            throw new IllegalArgumentException("le nom et le prénom ne doivent pas être vide");
        }
        if(moyenne < 0 || moyenne > 20) {
            throw new IllegalArgumentException("la moyenne doit être comprise entre 0 et 20 compris");
        }

        this.moyenne = moyenne;

    }

    public double getMoyenne() {
        return moyenne;
    }
}
