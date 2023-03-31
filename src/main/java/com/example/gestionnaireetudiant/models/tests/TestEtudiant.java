package com.example.gestionnaireetudiant.models.tests;

import com.example.gestionnaireetudiant.models.Etudiant;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEtudiant {


    @Test
    public void testConstructeur() {
        Etudiant etudiant = new Etudiant("Dupont", "Pierre", 12.5);
    }

    @Test
    public void testConstructeur2() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( null, "Pierre", 12.5);;
        });

    }

    @Test
    public void testConstructeur3() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( "", "Pierre", 12.5);;
        });

    }
}