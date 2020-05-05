package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
	// there will come a day where i will write clean code...
    // today is not that day!!!
        List<Double> list = new ArrayList<Double>();
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        double temp;
        double avg;

    // omg this is so hack :-(
        do {
            System.out.println("enter a temperature values: ");
           list.add(temp = keyboard.nextDouble());
        } while (list.size() < 5);

        for(int i = 0; i<list.size(); i++){
            total = total+list.get(i);
        }
        avg = total / list.size();

        for (double i : list)
            total = total + i;

        System.out.println("The total temperature = " +total);
        System.out.println("The average temperature =:" + avg);
    }
}
