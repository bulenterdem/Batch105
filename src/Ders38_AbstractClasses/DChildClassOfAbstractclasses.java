package Ders38_AbstractClasses;

public class DChildClassOfAbstractclasses extends CParentAbstractClass{

      // abstract bir class'daki abstract methodlarin TAMAMI
      // concrete child class'lar tarafindan override edilmelidir

    @Override
    public void mecburimethod1() {

        System.out.println("child class method icersinde method'u kendien uyarlar");

    }

    @Override
    public void mecburiMethod2() {

    }
}
