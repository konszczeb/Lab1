package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;
    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String[] translitRepl = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c",
            "ch", "sh", "shh", "'", "ju", "ja"};

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }


    public String getName() {
        return name;
    }

    public String translit(String arg) {
        // Zamień cały tekst na małe litery
        String lowercaseArg = arg.toLowerCase();
        String cyrylica = "";

        // Dla każdego znaku w arg, znajdź jego pozycję w ukrAlphabet
        for (int i = 0; i < lowercaseArg.length(); i++) {
            char aktualnyZnak = lowercaseArg.charAt(i);
            int ktoryZnak = ukrAlphabet.indexOf(aktualnyZnak);

            // jeśli nie znajdzie znaku pozostawia aktualny znak
            if (ktoryZnak == -1) {
                cyrylica += aktualnyZnak;
            } else {
                // gdy znajdzie, wstawia transliterację
                cyrylica += translitRepl[ktoryZnak];
            }
        }

        return capitalize(cyrylica);
    }


}
