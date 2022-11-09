package ders32_InheritanceConstructorCall;

public class Corolla extends BToyota {

    Corolla(int pc){

        super(5);
        System.out.println("parametreli constructor");
    }
    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Constructor");

    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("ilker");
        //Parametresiz Araba constructor
        //Parametresiz Toyota Constructor
        //String parametreli Constructor

        Corolla corolla1=new Corolla();
    //Parametresiz Araba constructor
    //Parametresiz Toyota Constructor
        System.out.println("======");

        Corolla corolla2=new Corolla(3);
        //Parametresiz Araba constructor
        //Parametreli Toyota Constructor
        //parametreli constructor
    }
}
