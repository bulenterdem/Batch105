package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_ınterface {

    // eger bir interface'i baska bir interface'in child'iyapmak isterseniz
    // extend keyword kullanilir

    // bir interface concrete class'i inherit edemez


    @Override
    void method1();

    // Interface bir child parent interface'deki abstract methodu override
    // edebilir ama ikisininde body si olmadigindan bu islemin bir anlami yoktur

    int method4();
    boolean method5();


}
