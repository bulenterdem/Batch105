package Ders39_AbstractClass;

public abstract class BHonda extends Araba{
     // abstarcat bir class'i parent edindigimizde
    // iki alternatif olur
    // 1- parent'imiz olan abstract class'taki abstract method'lari override etmek
    //2 -proje yapimiz gerektiriyorsa bu class'i da abstract yapmak


    @Override
    public void marka() {
        System.out.println("marka : Honda");
    }

    public abstract void yakit();

    public abstract void guvenlik();

    public void ozelteknoloji(){
        System.out.println("Tum Honda arabalar Vtek teknolojisi kullanir");
    }



}
