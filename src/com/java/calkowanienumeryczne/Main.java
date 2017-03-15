package com.java.calkowanienumeryczne;

import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj początek przedziału : ") ;
        double xp = input.nextDouble();
        System.out.println("Podaj koniec przedziału: ");
        double xk = input.nextDouble();
        if (xp >= xk )
                throw new Exception("Wprowadź poprawne dane. Pamiętaj, że wartość początkowa musi być mniejsza niż wartość końcowa.");
        System.out.println("Podaj dokładność przedziału: ");
        int n = input.nextInt();
        double dx = (xk-xp)/n;
        NumericalIntegration calka = new NumericalIntegration();
        System.out.print("Przybliżone pole całki wynosi: ");
        System.out.format("%.5f",calka.integerCount(xp, xk, dx));
    }
}
