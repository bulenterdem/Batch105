package ders40_Interfaces;

public interface I08_InterfacestaticVeDefaultMethods {

    /*

       java 8 ile developer'larin talebi uzerine yeni bir istisnai durum javaya eklenmistir

       bir interface'i yillar icersinde yuzlerce class inherit etmis olabilir
       sonradan  interface'e eklenen bir abstract method , tum eski child'lar tarafindan inherit edilmelidir
       aksi takdirde tum eski child class lar CTE verecektir

       Java 8 ile birlikte java, Interaface'lere default veya static ile isaretlenmek sorti ile body'si olan method
       eklenmesine izin vermistir. Bu sayede Interface sonradan eklenen method body'si oldugu icin
       override edilmek zorunda degildir

       Interface ıcersinde body'si olan method olusturmak icin kullanilan default ve static
       keyword2leri arsinda tek bir fark vardir

       default kullanilan method2lar obje olusturularak cagrılabilirken
       static olarak isaretlenen methodlar direk cagrilabilir



     */

    void method1();

    void method2();

    void method3();

    // interface deki tum methodlar public ve abstractir.
    // biz interface deki bir method deklarasyonuna default yazarsak bu access modifier degildir

    public default void method4(){
        System.out.println("Interface icindeki body'li default method");

    }

    public static void method5(){
        System.out.println("Interface icindeki body'li static method");


    }


}
