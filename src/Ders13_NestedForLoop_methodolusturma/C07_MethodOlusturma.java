package Ders13_NestedForLoop_methodolusturma;

public class C07_MethodOlusturma {
    public static void main(String[] args) {


        String str= "java muhtesemdir";
        // metni buyuk satira cevirin

        String buyukstr=str.toUpperCase();

        System.out.println(str); // java muhtesemdir

        System.out.println(buyukstr); // JAVA MUHTESEMDIR

        // metnin buyuk harflere cevrilmıs hali S icerir mi?

        System.out.println(buyukstr.contains("S")); // true

    }
}
