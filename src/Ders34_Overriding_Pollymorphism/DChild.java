package Ders34_Overriding_Pollymorphism;

public class DChild extends CParent{

    // Overriding kurallari
    // 1. access modifier method signature'a dahil olmadiginden overridden ve
    //  overriding access modifier'lar  farkli olabilir
    //  child parent'i sinirlandiramaz
    // yani overriding methodun access modifier!i ayni veya daha genis kapsamli olmalidir

    // private-- default---protected---public

    public void method1(){

    }
    // 2. private ve static methodlar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    // ancak override isareti ckmaz ve @override notasyonukullanilmak istenirse
    // CTE olur
    // java bunlari farkli classlardaki farkli methodlar olarak kabul eder

  public static void method2(){

  }
    private void method3(){

  }

  //3. return type method signature ina dahil olmadigindan
    // farkli secilebilir ancak
    // return type void vey primitive ise ayni olmak zorundadir
    // eger return type lar non-Primitive ise
    // child class daki return type , parent class'daki return type'i
    //ile ayni veya  child'i olmalidir

    public void method4(){

    }
    public String method5(){
        return "";

    }



}
