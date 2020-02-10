package com.company;

import com.company.Calci.Calci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calci calci = new Calci();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char oprator = sc.next().charAt(0);
        int b = sc.nextInt();
        float result = calci.opr(oprator,a,b);
        System.out.println(result);
    }
}
