package be.intecbrussel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
       // List<Integer> list =new ArrayList<>();
        List <Integer> list = new LinkedList<>();

        int sum =0;
        double average=0;
        for(int i=0; i<4; i++) {

            int number = scanner.nextInt();
            list.add(number);
            sum+=number;
            average=((double)sum)/list.size();

        }
        list.forEach(number -> System.out.print(number +" "));

        System.out.println("sum:" + sum +" average:"+average);


    }
}
