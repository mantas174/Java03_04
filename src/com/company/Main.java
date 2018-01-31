package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;
    public static void main(String[] args) {
        // write your code here
        Main obj = new Main();

    }

    public Main() {

        int suma = 0, sk = 0;

        do {
            sk = duokGarantuotaiSkaiciu();
            suma += sk;
        } while (sk != EXIT_CODE);
        System.out.print("suma : " + suma);
    }

    public int duokGarantuotaiSkaiciu() {
        int rezultatas = 0;

        Scanner in = new Scanner(System.in);
        boolean arPavyko = false;
        while(arPavyko == false) {
            System.out.print("Iveskite skaiciu ");
            try {
                System.out.print("Iveskite skaiciu ");
                rezultatas = in.nextInt();
                arPavyko = true;
            }catch (Exception klaida){
                System.out.println("tekstas yra ne skaicius");
                in.next();
            }
        }

        return rezultatas;

    }
}
