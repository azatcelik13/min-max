package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// min ve max değerlerini sırala
        Scanner inp =new Scanner(System.in);
        int n,num;
        int min=1,max=1;
        System.out.print("Kaç sayı gireceksiniz=");
        n = inp.nextInt();
        if (n>=2) {
            for (int i =1;i<=n;i++) {

                System.out.print("Sıralanacak " + (i) + ". sayıyı giriniz=");
                num = inp.nextInt();
                if (i == 1) {
                    max = num;
                    min = num;
                } else if (num >= max){
                        max = num;
                }
                  else if (num <= min){
                        min = num;
                }





            }

            System.out.println("minimum"+min);
            System.out.println("maximum"+max);
        }
        else
            System.out.println("hatalı değer girdiniz");


    }
}
