package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine() + " %end";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next();
        int count = 0;
        while (word.compareTo("%end") != 0){
            if(word.length() == 3) {count++;System.out.println(count);}
            word = strScanner.next();

        }
    }
}










//method compares two strings lexicographically