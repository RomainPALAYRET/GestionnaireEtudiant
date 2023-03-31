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

    @Test
    public void testConstructeur4() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( "Dupont", null, 12.5);;
        });

    }

    @Test
    public void testConstructeur5() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( "Dupont", "", 12.5);;
        });

    }

    @Test
    public void testConstructeur6() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( "Dupont", "Benoit", -1.00);;
        });

    }

    @Test
    public void testConstructeur7() {
        assertThrows(IllegalArgumentException.class, () -> {
            Etudiant etudiant = new Etudiant( "Dupont", "Benoit", 21.00);;
        });

    }

    @Test
    public void testConstructeur8() {
        Etudiant etudiant = new Etudiant( "Dupont", "Benoit", 12.00);
        assertEquals(etudiant.getMoyenne(), 12.00, 0.01);
    }

    @Test
    public void testConstructeur9() {
        Etudiant etudiant = new Etudiant( "Dupont", "Benoit", 12.00);
        assertEquals(etudiant.getNom(), "Dupont");
    }

    @Test
    public void testConstructeur10() {
        Etudiant etudiant = new Etudiant( "Dupont", "Benoit", 12.00);
        assertEquals(etudiant.getPrenom(), "Benoit");
    }
}