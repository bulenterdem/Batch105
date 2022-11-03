package Ders25_StaticKeyword;

public class deneme {

    int a=10;
    static int b=20;
    String str1="Ali";
    static String str2="ayse";

    deneme(){
     str1="hasan";
     str2+="++";
    }
    deneme(int x, int y) {

        a=x;
        b=y;

    }
    public static void main(String[] args) {
        deneme dnm1=new deneme(6,8);

        System.out.println(dnm1.b);

        deneme dnm2=new deneme(10,12);
        System.out.println(dnm1.b);
    }
}
