
package com.saikat;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long  n = sc.nextLong() ;
        long ans = 0;

        while(n>0){
            long rem = n %10;
            n= n/10;
            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}

