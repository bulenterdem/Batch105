package Ders29_StringBuilder_AccesModifier;

public class C05_AccessModifier {
    public static void main(String[] args) {

        C04_AccesModifiers obj= new C04_AccesModifiers();

        obj.isim="tugay";

        System.out.println(obj.isim); // tugay

       // obj.sayi=20; private


        C04_AccesModifiers obj2=new C04_AccesModifiers();
        System.out.println(obj2.isim); // ali
    }
}
