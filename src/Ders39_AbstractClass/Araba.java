package Ders39_AbstractClass;

public abstract class Araba {

    // Araba class'ini inherit eden tum class'lar
    // motor , marka,kasa, tekerlek methodlarini override etmek zorunda kalsin
    // ancak abs,klima methodlari opsiyonel olsun
    // isteyen child bu methodlari override etsin
    //isteyem override etmesin

    public abstract void motor();

    public abstract void kasa();

    public abstract void marka();

    public abstract void tekerlek();

    public void abs(){
        System.out.println("guvenlik arttirmak isteyen arabalar abs kullanmali");
    }

    public void klima(){
        System.out.println("konfor arttirma isteyen arabalar klima kullanmali");
    }


}