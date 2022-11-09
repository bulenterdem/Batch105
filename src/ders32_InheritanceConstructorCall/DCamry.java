package ders32_InheritanceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){
        super("Deniz");
        System.out.println("String Parametreli Camry");

    }
    DCamry(){

    }

    public static void main(String[] args) {
        // eger kullanilan bir argumente uygun bir constructor
        // Parent class da yoksa CTE olur

        DCamry camry2=new DCamry("celal");

        System.out.println("======");

        DCamry camry1=new DCamry();
    }
}
