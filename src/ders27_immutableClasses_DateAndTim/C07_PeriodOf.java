package ders27_immutableClasses_DateAndTim;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumunuzdan bugune ne kadar zaman gecti ?

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2008,9,19);


        Period gecenSure= Period.between(dogumGunu,bugun);

        System.out.println(gecenSure); // P50Y9M11D


        System.out.println(gecenSure.getYears()); // 50




    }
}
