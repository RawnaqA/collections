package be.intecbrussel;

import java.util.*;

public class Opdracht {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        List<String> stringList = new ArrayList<>();


        String word;
       do {
            word = scanner.next();
            stringList.add(word);
        } while (!word.endsWith("."));
       /* while (!stringList.endsWith(".")){

           String word = scanner.next();
            stringList.add(word);
        }*/

        stringList.forEach(string -> System.out.print(string + " "));

        for(int i=stringList.size()-1 ;i>=0;i--){
            System.out.println(stringList.get(i)+" ");
        }

        Collections.reverse(stringList);
        System.out.println(stringList);
        Collections.reverse(stringList);

        System.out.println(stringList.size());
        System.out.println("\n There are :" + stringList.size() + "words");
    }
}
