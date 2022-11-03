package Ders13_NestedForLoop_methodolusturma;

public class C02_StringTersineCevirme {

    public static void main(String[] args) {


        // Kullanicidan bir String isteyip String'i tersine cevirip kaydedin

        String input= "Java her gecen gun guzellesiyor";

        String tersInput= "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput += input.substring(i,i+1);



        }
        System.out.println("ters hali : " + tersInput);
    }
}
