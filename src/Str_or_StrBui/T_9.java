package Str_or_StrBui;

import java.util.Scanner;

public class T_9 {
    public static void main(String[] args) {
        // Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
        // Учитывать только английские буквы.
        System.out.print("Введите строку: ");
        String s = input_str();
        System.out.println("Количство маленьких букв: "+counf_of_small_letters(s));
        System.out.println("Количство прописных букв: "+counf_of_big_letters(s));
    }
    public static String input_str(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int counf_of_small_letters(String s){
        int result =0;
        for (int i = 0; i<s.length(); i ++){
            if(Character.isLowerCase(s.charAt(i))){
                result++;
            }
        }
        return result;
    }
    public static int counf_of_big_letters(String s){
        int result =0;
        for (int i = 0; i<s.length(); i ++){
            if(Character.isUpperCase(s.charAt(i))){
                result++;
            }
        }
        return result;
    }
}
