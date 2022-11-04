package Ders28_Varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        // bu kod yazildginda java 7 karakter alabilecek sb olusturur



        System.out.println(sb.capacity()); // 7

        System.out.println(sb.length()); // 0

        sb.append("java");

        System.out.println(sb);
        System.out.println(sb.capacity()); // 7

        System.out.println(sb.length()); // 4

        sb.append(" guzeldir.");
        System.out.println(sb);

        sb.append(" ona ne suphe");
        System.out.println(sb.capacity()); // 34

        System.out.println(sb.length()); // 27
        System.out.println(sb);

        // kapasite ve lengti esitlemek istersek

        sb.trimToSize();
        System.out.println(sb.capacity()); // 27
        System.out.println(sb.length()); // 27

    }
}
