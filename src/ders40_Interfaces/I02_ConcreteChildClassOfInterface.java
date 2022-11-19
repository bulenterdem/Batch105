package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_ınterface {

    // Bir class'i interface'in child'i yapmak icin implement keyword kullanilir

    public static void main(String[] args) {

        System.out.println(MESAJ);

        // sayi=40;  yazili olmasa da ınterface icersinde oldugundan final dir ve atama
        // yapılamaz

        System.out.println(Integer.MAX_VALUE);
        // normalde variable isimleri kucuk harfle baslar ve camelcase kullanilir
        // ancak java da ortak kabul olarak
        // static ve final olarak isartelenen variable isimleri tamamen
        // buyuk harf ile yazilir


        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int mehod2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
