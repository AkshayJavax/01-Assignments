package com.cloud.core;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int temp, num;
    boolean isPrime = true;
    Scanner in = new Scanner(System.in);
    System.out.println("enter number for check prime or not");
    num = in.nextInt();
    in.close();
    for (int i = 2; i<= num/2; i++) {
        temp = num%i;
        if (temp == 0) {
            isPrime = false;
            break;
        }
    }
    if(isPrime) 
        System.out.println(num + " number is prime");
        else
            System.out.println(num + " number is not a prime");
}
}
