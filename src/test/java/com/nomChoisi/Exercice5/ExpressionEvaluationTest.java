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

    public void evaluatededuchaine20retourn20(){
        //GIVEN
        int resultatexpected = 20;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate("20");

        //THEN
        assertEquals(resultatexpected,resultat);
    }
    @Test

    public void evaluatededuchainede3_et5retourn8(){
        //GIVEN
        int resultatexpected = 8;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate("3,5");

        //THEN
        assertEquals(resultatexpected,resultat);
    }
    @Test
    public void evaluatededuchainede10_et6et6retourn(){
        //GIVEN
        int resultatexpected =22 ;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate("10,6,6");

        //THEN
        assertEquals(resultatexpected,resultat);
    }
    @Test
    public void evaluatededuchainede5_et5et4_7retourn(){
        //GIVEN
        int resultatexpected =21 ;
        //WHEN
        int resultat = ExpressionEvaluation.evaluate("5,5,4,7");

        //THEN
        assertEquals(resultatexpected,resultat);
    }




}
