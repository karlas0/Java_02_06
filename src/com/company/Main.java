package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite savo svori kg");

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        System.out.println("Iveskite iveskite savo ugi metrais");

        float b = sc.nextFloat();

        System.out.println("Jusu KMI");

        System.out.println(a / (b * b));
    }

}
