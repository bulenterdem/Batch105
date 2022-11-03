package Ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {

        // kullanicinin girdigi metinde tum karakterleri temizleyen bir kod yzin
        // Not: Space silinmemeli

        String input= "Ja5+va cok 1*guzel";



        input=input.replaceAll("\\d","");
        System.out.println(input);

        input=input.replace(" ","5");
        System.out.println(input);

       input=input.replaceAll("\\W","");
      System.out.println(input);

      input=input.replace("5"," ");
        System.out.println(input);

        input=input.replaceAll("\\s+"," ");
        System.out.println(input);



    }
}
