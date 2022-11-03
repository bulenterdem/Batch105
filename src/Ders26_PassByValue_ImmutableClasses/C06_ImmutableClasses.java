package Ders26_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {
    public static void main(String[] args) {

        String str="java guzeldir";

        System.out.println(str.toUpperCase(Locale.ROOT)); // JAVA GUZELDIR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();

        System.out.println(str);

        // string immutable oldugu icin method ile yapilan degisiklikler Stringi kalici degistirmez

        List<String>harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);

        System.out.println(harfler); // [B]

        // List ve Array mutable oldugu icin method ile yapilan degisiklikler kalici olur


    }
}
