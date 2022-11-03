package Ders13_NestedForLoop_methodolusturma;

public class C01_ForLoop {
    public static void main(String[] args) {

        // soru 9 kullanicidan bir string isteyin ve string'i tersten yazdirin

        String input= "Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));

        }
    }
}

