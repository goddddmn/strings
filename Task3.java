package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine() + "%end";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next(), maxWord = word;
        while (word.compareTo("%end") != 0) {
            word = strScanner.next();
            if (word.length() >= maxWord.length())
                maxWord = word;
        }
        System.out.println(maxWord);
    }
}
