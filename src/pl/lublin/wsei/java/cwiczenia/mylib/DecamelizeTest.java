package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Scanner;

public class DecamelizeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder tekstsklejony = new StringBuilder(); // żeby pokazać tekst w jednej linijce
        do {
            System.out.print("Podaj tekst do rozklejenia (0, jak Ci się znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            String wynik = StringFun.decamelize(tekst);
            tekstsklejony.append(wynik);
            System.out.println("Tekst po zmianie: ");
            System.out.println(tekstsklejony.toString());
        } while (true);
    }
}

