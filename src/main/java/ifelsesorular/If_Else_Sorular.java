package ifelsesorular;

import java.util.Scanner;

public class If_Else_Sorular {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi >= 0) {

            System.out.println("Negatif değil");

        } else {

            System.out.println("Negatif");

        }


    }

}
