package Str_or_StrBui;

import java.util.Scanner;

public class T_7 {
    public static void main(String[] args) {
        // Вводится строка.
        // Требуется удалить из нее повторяющиеся символы и все пробелы.
        // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
        System.out.print("Ввдите строку: ");
        String s= input();
        System.out.println("Строка с удаленными пробелами и повторяющимися символами: "+new_str(s));
    }
    public static String input(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    public static String new_str(String s){
        StringBuilder new_str = new StringBuilder(s);
        for (int i =0; i<new_str.length(); i++){
            if(new_str.charAt(i)==' ') {
                new_str.deleteCharAt(i);
            }
            for (int j = i+1; j<new_str.length(); j++){
                if(new_str.charAt(i)==new_str.charAt(j)){
                    new_str.deleteCharAt(j);
                    j--;

                }
            }
        }
        return new_str.toString();
    }
}
