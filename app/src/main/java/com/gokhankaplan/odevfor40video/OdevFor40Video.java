package com.gokhankaplan.odevfor40video;

import java.util.Scanner;

public class OdevFor40Video {
    public static void main(String[] args) {

        int k;
        int i=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        k = input.nextInt();

        while (i<=k){
            i*=2;
            if(i<=k) {
                System.out.println(i);
            }

        }
    }
}
