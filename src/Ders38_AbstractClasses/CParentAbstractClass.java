package Ders38_AbstractClasses;

public abstract class CParentAbstractClass {

    /*
      Abstract bir class abstract method'lara sahip olabilir
      Bir class abstract yapmak icin class declaration'ina abstract keyword eklenmelidir

     */

    public abstract void mecburimethod1();

    public abstract void mecburiMethod2();


    public String concreteMethod(){

        // Bu gune kadar kullandigimiz normal methodlara
        // soyut olmayan method demek yerine concrete method denir
        return "";
    }

    // soyut(abstract) methodlarin body si olmaz

    /*
       Bir parent class da child class' larin mutlaka override edecegi bir method olusturdugumuzda
       method body'si gereksizlesir  cunku hic calısmayacaktir

       1- abstract parent class'dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
       2- child class'lar da mecburen bu method'u override edeceklerinden,
       bu methodlarin body si asla KULLANILMAYACAKTIR

       Java hic kullanilmayacak bu method body'leri yazmamiza imkan tanimistir

          */

    // child classlarin mutlaka overide etmesini istedigimiz methodlari
    // abstract olarak tanimlar ve bodysiz olustururuz
}
