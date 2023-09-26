package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

/**
 * javadoc
 * substraction two integers
 *
 * @param a first integer
 * @param b second integer
 * @ return the substraction of a and b
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        //komentarz jednolinijkowy
        /* komentarz
        wielolinjkowy
         */
        System.out.print("samo");
        System.out.print("print\n");
        System.out.println("dzialanie println");
        System.out.println("pokazuje");
        System.out.print("print\n");
        System.out.print("ale z n na koncu\n");
        int a = 8;
        double b = 3.146569;
        String tekst = "dowolny tekst";
        System.out.printf("a = %d, b = %.2f, tekst = %20s %n", a, b, tekst);
        System.out.println("Nazywaliśmy to \"witaminą B3\"");
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));

        //wypisanie tabelko logarytmów 2 oraz potęg ciągu geometrycznego liczby 2
        System.out.printf("arg\tlog2(arg)\tsum(arg)\n");
        for (int i = 0; i < 30; i += 1)
            System.out.printf("%d\t%f\t%f\n", i, Math.log(i) / Math.log(2), (1 - Math.pow(2, i + 1)) / (1 - 2));


    }
}
