package Ders09_StringManipulations;

import java.util.Locale;

public class C01_ToUpperCase {

    public static void main(String[] args) {

        String str = "Java Mutluluktur";

        System.out.println(str.toUpperCase(Locale.ROOT)); // JAVA MUTLULUKTUR

        str= str.toUpperCase();

        System.out.println(str); // JAVA MUTLULUKTUR

        str= "ince mehmet";

        str=str.toUpperCase();
        System.out.println(str);

        str=str.toLowerCase();

        //System.out.println(str);

        System.out.println(str.toLowerCase(Locale.CHINA)); // ince mehmet

        System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));


    }
}
