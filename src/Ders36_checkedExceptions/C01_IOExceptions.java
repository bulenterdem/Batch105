package Ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/Ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/Ders36_checkedExceptions/Deneme.txt");

        // java ile bilgisayaraimizdaki bir dosyaya ulasmak istersek
        // FileInputStream classs indan obje olusturup o obje ile dosyayi kullaniriz

        // fis olustururken ulasmak istedigimiz dosyanin dosya yolunu
        // parametere olarak girmeliyiz

        /*
        Checked exception olusturma ihitmali olan kodlari yazdigimizda java compile time orada
        bir hata ihtimali oldugunu gorur ve kodun altini kirmiz cizer

         bu durumda kirmiz cizgiyi kaldirmak icin 2 yontem vardir
         1- exceptionu try catch blogu ile handle etmek
         2- java ya sorun ihtimalini farkinda oldugumuzu ama kodumuza guvendigimizi
            ve calismaya devam etmesini istedigimizi soylemek
            bunun için method signature'a method declarasyonu ile curly braces arasına throws keyword
            ve beklenen exceptıon turu yazılabilir
         */
    }
}
