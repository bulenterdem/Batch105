package Ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Checkedexceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/Ders36_checkedExceptions/Deneme.txt";
        int k=0;

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {

            System.out.println("dosya yolu yanlis veya dosya arizali");

        } catch (IOException e) {

            System.out.println("dosya okuma veya yazma ile ilgili bir sorun var");

        }

        /*
        bir kod calişirken birden fazla exception olusma ihtimali varsa bu kodun
        calisir hale getirmek icin 4 ihtimal vardir

        1- herbir exception ic ice try-catch bloklari kullanmak
        2- bir tane try blogu birden fazla catch blogu olusturmak
        3- method signature na tum exception ihtimallerini yazmak (exception handle edilmis olmaz)
        4- eger muhtemel exceptionlarin tumunu kapsayan daha genis kapsamli bir
        exception varsa onu kullanmak
         */

        /*
         2. ve 3. ihtimallerde olusmasi muhtemel exceptionlar arasinda
         parent-child iliskisi olup olmadigi kontrol edilir
          aralarında parent chıld ilişkisi yoksa exceptionları istediğimiz sırada yazabiliriz

        ANCAK parent chıld ilişkisi varsa önce chıld sonra Parent yazılmalıdır.
        AKSİ TAKDİRDE parent daha kapsamlı oldugundan tum exceptionları yakalar ve
        aşagıdakı chıld exception işlevsiz kalır java bu durumu kabul etmez . CTE verir

         */

    }
}
