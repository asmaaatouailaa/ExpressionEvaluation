package com.nomChoisi.Exercice5;
import org.junit.jupiter.api.Test; // Importation de l'annotation @Test

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionEvaluationTest {
    @Test

    public void evaluatededuchainevideretourn0(){
        //GIVEN
        int resultatexpected = 0;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate(" ");

        //THEN
        assertEquals(resultatexpected,resultat);
    }
    @Test

    public void evaluatededuchainevide20retourn20(){
        //GIVEN
        int resultatexpected = 20;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate("20");

        //THEN
        assertEquals(resultatexpected,resultat);
    }



}
