package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class StringFun {
    public static void main(String[] args) {
    }

    public static boolean isPalindrome(String tekst) {
        //zamieniam litery na o małym znaku
        tekst = tekst.toLowerCase();
        //sprawdzam długość tekstu
        int length = tekst.length();
        //wyznaczam środek
        int polowaWyrazenia = length / 2;
        //pętla porównująca kolejne symetrycznie znaki tekstu

        for (int i = 0; i < polowaWyrazenia; i++) {
            //korzystam z porównania indeksu znaku
            if (tekst.charAt(i) != tekst.charAt(length - 1 - i)) {
                return false;// W przypadku gdy nastąpi niezgodność, tekst nie jest palindromem
            }
        }
        return true;// W przypadku gdy wszystkie znaki będa równoważne tekst jest palindromem
    }

    public static String anarchize(String tekst) {
        char[] nowyTekst = new char[tekst.length()]; // tworzę tablicę znaków
        int pole = 0; // zmienna, gdzie będą dopisywane kolejne znaki, tekstu

        for (int i = 0; i < tekst.length(); i++) { //pętla wykonująca się tyle razy ile znaków w tekście
            char aktualnyZnak = tekst.charAt(i); //pobranie znaku do sprawdzenia
            if (Character.isLetter(aktualnyZnak)) { // Sprawdzam, czy znak jest literą

                if (Character.isLowerCase(aktualnyZnak)) { // jeśli mała
                    nowyTekst[pole] = Character.toUpperCase(aktualnyZnak); // to zmienia ją nadużą
                } else {
                    nowyTekst[pole] = Character.toLowerCase(aktualnyZnak); // przeciwnie zmienia na małą
                }
            } else {
                // Jeśli znak nie jest literą, to się nie zmienia
                nowyTekst[pole] = aktualnyZnak;
            }
            pole++;
        }

        return new String(nowyTekst); // Nowy tekst
    }

    public static String camelize(String tekst) {
        // usuwam podwójne spacje, wiodące i końcowe spacje
        tekst = StringUtils.normalizeSpace(tekst).trim();

        String[] slowa = tekst.split(" "); // rozdzielam frazy, które używają spacji
        String nowyTekst = "";// inicjalizacja zmiennej przechowującej nowy tekst

        for (int i = 0; i < slowa.length; ) { //pętla, która będzie wykonywać się do kiedy nie przekroczy liczby znaków wyrażenia
            String slowo = slowa[i]; // przypisanie wartości slowa do tablicy
            if (i == 0) {
                // Pierwsze słowo zaczyna małą literą
                nowyTekst += slowo.toLowerCase();
            } else {
                // Kolejne słowa pierwsza litera pisana wielkimi literami
                nowyTekst += slowo.toUpperCase();
                i++;
            }
        }

        return nowyTekst.toString(); //zwracam sklejony tekst

    }


    public static String decamelize(String tekst) {
        String[] slowa = StringUtils.splitByCharacterTypeCamelCase(tekst); // dzieli tekst na wyrazy
        StringBuilder tekstwynikowy = new StringBuilder(); // wykorzystanie StringBuilder do dopisywania kolejnych słów

        for (int i = 0; i < slowa.length; i++) { //pętla wykonuje się do długości wyrażenia
            tekstwynikowy.append(slowa[i].toLowerCase()); // zamienia wyrazy na male litery
            if (i < slowa.length - 1) {
                tekstwynikowy.append(" "); // Dodaję spację między wyrazami do ostatniego wyrazu length-1
            }
        }

        return tekstwynikowy.toString();
    }

    public static String shuffle(String tekst) {
        Random rand = new Random();
        StringBuilder tekstwynikowy = new StringBuilder(tekst.length());

        while (tekst.length() > 0) {
            int znak = rand.nextInt(tekst.length()); // losuje znak do przestawienia
            char przestawienie = tekst.charAt(znak); // przypisuje pobrany znak do zmiennej przestawienie
            tekstwynikowy.append(przestawienie); // dodaje znak wynikowy do tekstu
            tekst = tekst.substring(0, znak) + tekst.substring(znak + 1); // usuwa znak z wprowadzonego tekstu
        }

        return tekstwynikowy.toString();
    }

}


