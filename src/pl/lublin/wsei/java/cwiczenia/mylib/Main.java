package pl.lublin.wsei.java.cwiczenia.mylib;
public class Main {


    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Пьотр Голобек");
        System.out.println(acc.getName());

        String transliterated = acc.translit("Пьотр Голобек");
        System.out.printf("Po transliteracji:");
        System.out.println(transliterated);
    }
}