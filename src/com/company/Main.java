package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        listA.add(scanner.nextLine());
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        listB.add(scanner.nextLine());
        Collections.reverse(listB);
        System.out.println(listB);
        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);

        System.out.println(listC);

    }
}
