package ders32_InheritanceConstructorCall;

public class BToyota extends Araba {

    BToyota (){

        System.out.println("Parametresiz Toyota Constructor");
    }

    BToyota(int p1){

        System.out.println("String Parametreli Toyota Constructor");
    }

    BToyota (String pt2){

        super("mehmet");

        System.out.println("String parametreli Constructor");
    }
}
