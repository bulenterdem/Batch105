package Ders39_AbstractClass;

public class CHondaCivic extends BHonda{

    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec cevreci motor kullanir");
    }
    @Override
    public void kasa() {
        System.out.println("civic sedan veya hb kasa kullanir");
    }
    @Override
    public void tekerlek() {
        System.out.println("cıvıc araclar 205*55*16 teker kullanir");
    }
    @Override
    public void yakit() {
        System.out.println("civic araclar benzinlidir");

    }
    @Override
    public void guvenlik() {
        System.out.println("civic araclar guvenlik standartina uyar");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart klima kullanir");
    }

    /*
       Abstract parent class'lardaki abstract methodlar concrete child class'lar
       tarafindan mecburen override edilir

       Ancak abstract parent'lardaki concrete methodlari override etmek mecburi degildir
       eger child class'a uyarlamak isterseniz override etmeyip parent class'daki haliyle
       kullanabilirsiniz
     */

    public static void main(String[] args) {
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelteknoloji();

    }
}

