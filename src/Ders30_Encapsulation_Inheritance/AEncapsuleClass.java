package Ders30_Encapsulation_Inheritance;

public class AEncapsuleClass {

    private String hastaneIsmi="Yildiz Hastanesi";
    // hasstane ismi gorulebilsin ama degistirilemesin

    private int hastaUcreti;
     // hasta ucreti de giris yapilabilsin ama
    // ucreti sigortadan alinacagi
    // icin personel hasta ucretlerini gormesin

    private String hemsireIsmi;
   private String hemsireAdresi;

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }
// bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'lari public yapmak yerine
    // private yapip getter ve setter olusturmak da
    // ayni islevi gorur

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
