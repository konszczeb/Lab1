package pl.lublin.wsei.java.cwiczenia.mylib;
import java.util.Scanner;
public class AnarchizeTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Podaj tekst do zmienienia (0, jak Ci się znudzi): ");
            String tekst = scn.next();
            if (tekst.equals("0")) break;
            System.out.print("Tekst po zmienie: " + (StringFun.anarchize(tekst)));
        } while (true);
    }
}

