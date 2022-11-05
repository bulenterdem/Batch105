package Ders30_Encapsulation_Inheritance;

public class EChild extends DParent{

    /*
    java'daki inheritance'in insanlardan en buyuk farki:
    insanlarda parent child edinebilir ama child parentini secemez

    java da ise tam tersidir
    - siz bir class olusturdugunuzda daha once olusturulmus class'lardan
    tum ozelliklrini inherit etmek istediginiz class'i PARENT EDINIRSINIZ

    Bir class baska bir class'i inherit etmek istediginde extends keyword
     ile bunu deklare eder
     */
    public static void main(String[] args) {
        EChild child1=new EChild();

        child1.yas=30;

        child1.isim="mahmut";

        child1.isEnough=false;


    }
}
