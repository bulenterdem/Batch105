package Ders28_Varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("java candir.");

        System.out.println(sb.capacity()); //16+12=28
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnac avaj

        System.out.println(sb.reverse()); // java candir.

        sb.replace(0,4,"Ahmet Hoca "); // Ahmet Hoca  candir.

        System.out.println(sb);

        sb.insert(19," bu bir yalandir"); // Ahmet Hoca  candir bu bir yalandir.
        System.out.println(sb);


        String str= "java cok guzel";

        sb.insert(23,str,9,14); // Ahmet Hoca  candir buguzel bir yalandir.
        System.out.println(sb);

    }
}
