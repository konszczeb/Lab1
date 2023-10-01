package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class uzupelnianie_lancucha_tekstowego {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            int num1=0, num2=0;
            System.out.print("Podaj liczby, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) || (num2== 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
            String bin = Integer.toBinaryString(num1+num2);
            String hex = Integer.toHexString(num1+num2);
            System.out.printf(" wynik dodawania binarnie = %s, wynik dodawania szesnastkowo = 20x%s%n", bin, hex);
        } while (true);
    }
}