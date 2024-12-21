package com.nomChoisi.Exercice5;

import java.util.Objects;

public class ExpressionEvaluation {

    public static int evaluate (String expression)
    {
       if (expression.equals(" ")){
                return 0;}
else if(!expression.contains(",")){
    return Integer.parseInt(expression);
       }else{
  String[] tab= expression.split(",");
  int sum =Integer.parseInt(tab[0])+Integer.parseInt(tab[1]);
  return sum;

        }
    }


}