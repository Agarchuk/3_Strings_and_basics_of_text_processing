package Str_or_StrBui;

import java.util.Scanner;

public class T_8 {
    public static void main(String[] args) {
        //Вводится строка слов, разделенных пробелами.
        // Найти самое длинное слово и вывести его на экран.
        // Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        System.out.print("Введите строку из слов: ");
        String s = input();
        System.out.println("Самое длинное слово: "+search_longest_word(s));
    }
    public static String input(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static String search_longest_word(String s){
        StringBuilder s1 = new StringBuilder("");
        StringBuilder max_word = new StringBuilder("");
        int j =0;
        int count =0;
        int max =0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
                s1.insert(j,s.charAt(i));
                j++;
                if(i==s.length()-1) {
                    if (count > max) {
                        max = count;
                        max_word.replace(0, max_word.length(), s1.toString());
                        count = 0;
                    }
                }
            } else if(s.charAt(i)==' '){
                if (count>max){
                    max = count;
                    max_word.replace(0, max_word.length(), s1.toString());
                    s1.replace(0, s1.length(), "");
                    count=0;
                    j=0;
                } else{
                    s1.replace(0, s1.length(), "");
                    count=0;
                    j=0;

                }
            }
        }
        return max_word.toString();
    }

}
