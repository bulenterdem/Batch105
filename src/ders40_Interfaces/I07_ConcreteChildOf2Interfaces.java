package ders40_Interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface,I06_Interface {


    public static void main(String[] args) {
        System.out.println(I05_Interface.MESAJ);

        System.out.println(I06_Interface.SAYI);

        System.out.println(SAYI2);
    }
  /*

      1- bir class sadece bir class'a extend edilebilir
      ancak birden fazla interface'e implement edilebilir
      2- concrete child class implement ettigi tum interface'lerdeki abstract methodlari
      override etmek zorunda oldugundan iki interface deki tum methodlari override etmek gerekir
      -iki interface de ayni isimde ve ayni return type sahip methodlardan hangisini
      override ettigi onemli degildir
      -ancak isimler ayni return type2lar afrkli oldugunda iki interface2i implement etmemiz
      mumkun olamayacaktir
      bu durumda
      *) ya child class'dan bu iki interface'i implement etmekten vazgecmelisiniz
      *) veya bu concliti ortadan kaldiririz

      3- Child class'dan Interface'lerdeki variable'lari kullanmak icin
      -ayni isimde iki interface de de variable varsa
      InterfaceIsmi.variableIsmi seklinde tercihinizi belirtmelisiniz
      - kullanacaginiz variable sadece 1 Interface de varsa sadece variableIsmi
      yazmak yeterlidir

   */

    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;





    }
}
