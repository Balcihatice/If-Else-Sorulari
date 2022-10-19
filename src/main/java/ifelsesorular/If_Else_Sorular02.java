package ifelsesorular;

import java.util.Scanner;

public class If_Else_Sorular02 {

        /*
        kullanıcıdan bir sayı alın
        sayı 2 basamaklı ise consola "Iki basamakli en kucuk sayi" yazdırın
        sayı 3 basamaklı ise consola "Uc basamakli en kucuk sayi" yazdirin
        sayi 4 basamaklı ise consola "Dort basamakli en kucuk sayi" yazdirin
        Diger durumlar icin "Lutfen gecerli sayi giriniz..." yazdirin
         */
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();

        if (number == 10) {
            System.out.println("Iki basamakli en kucuk sayi");
        } else if (number == 100) {
            System.out.println("Uc basamakli en kucuk sayi");
        } else if (number == 1000) {
            System.out.println("Dort basamakli en kucuk sayi");
        } else {
            System.out.println("Lutfen gecerli sayi giriniz...");
        }
    }
}