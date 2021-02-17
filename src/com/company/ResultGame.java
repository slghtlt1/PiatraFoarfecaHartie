package com.company;
public class ResultGame {

    static void printResult(String AlegereJuc1, String AlegereJuc2) {
        if (AlegereJuc1.equalsIgnoreCase(AlegereJuc2))
            System.out.println("Este egalitate");
        if (AlegereJuc1.equalsIgnoreCase("piatra") &&
                AlegereJuc2.equalsIgnoreCase("foarfeca"))
            System.out.println("Jucatorul 1 a castigat");
        if (AlegereJuc1.equalsIgnoreCase("piatra") &&
                AlegereJuc2.equalsIgnoreCase("hartie"))
            System.out.println("Jucatorul 2 a castigat");
        if (AlegereJuc1.equalsIgnoreCase("foarfeca") &&
                AlegereJuc2.equalsIgnoreCase("piatra"))
            System.out.println("Jucator 2 a castigat");
        if (AlegereJuc1.equalsIgnoreCase("foarfeca") &&
                AlegereJuc2.equalsIgnoreCase("hartie"))
            System.out.println("Jucator 1 a castigat");
        if (AlegereJuc1.equalsIgnoreCase("hartie") &&
                AlegereJuc2.equalsIgnoreCase("piatra"))
            System.out.println("Jucator 1 a castigat");
        if (AlegereJuc1.equalsIgnoreCase("hartie") &&
                AlegereJuc2.equalsIgnoreCase("foarfeca"))
            System.out.println("Jucator 2 a castigat");
    }
}
