package pl.lublin.wsei.java.cwiczenia;


public class UzupelnianieLancuchaTekstowego {
    public static void main(String[] args) {
        String aText = "tekst";
        char aChar = '0';
        int aWidth = 10;
        String NapisNaEkranie = leftPad(aText, aChar, aWidth);
        String DuzeLitery = aText.toUpperCase();
        System.out.printf("A tu testuje działanie UpperCase:%s", DuzeLitery);
    }

    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;

        System.out.printf("Liczba przed wypełnieniem = %s, po wypełnieniu = %s%n", aText, res);

        return res;
    }

}

