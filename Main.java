package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String str = " " + n.nextLine();
        int count = 0;
        char[] letters = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                for (int j = 0; j < letters.length; j++) {
                    if (str.charAt(i + 1) == letters[j]) count++;
                }
            }
        }
        System.out.println(count);
    }
}





//nextLine() читает до конца текущей строки (символа перевода строки или конца потока) и возвращает всё, что было в этой строке.
//charAt() — возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
