package Ders28_Varargs_stringBuilder;

public class C06_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java guzeldir");

        System.out.println(sb.indexOf("a")); // 1

        System.out.println(sb.indexOf("a", 2)); // 3
    }
}
