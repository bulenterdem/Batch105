package Ders34_Overriding_Pollymorphism;

public class BChild extends AParent{

    public void method1(){

        System.out.println("Child class method1");
    }
    public void method2(int a) {
        // overriding olabilmesi icin hem method ismi
        //hemde signature ayni olmali

        System.out.println("child class method2");
    }

    public void method2(String isim){

        System.out.println("child class string parametreli method2");
    }

    @Override
    public void method3() {
       // super.method3();
        // Overriding varssa parent ve child class'daki
        // overridden ve averriding methodlardan sadece biri calısır
        // eger ikisini birden calistirmak isterseniz
        // super.overridden method ismi yazilir

        /*
        overriding method @Override notasyonu ile isaretlenebilir
         @override kullanilmayan overriding  isleminde parent class daki
         overridin method silinirse hic sorun olmaz

         Ancak @override kullanilmayan overriding  isleminde parent class daki
         overridin method silinirse veya sigbTURE degistirilirse Java CTE verir
         */
    }
}
