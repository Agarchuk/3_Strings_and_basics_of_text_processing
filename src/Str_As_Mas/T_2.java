package Str_As_Mas;

import java.util.SplittableRandom;

public class T_2 {
    public static void main(String[] args) {
        //Замените в строке все вхождения 'word' на 'letter'.
        String str = "abcworddefwordjkl";
        String result = "";
        int tmp_index = 0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='w'){
                if(i+3<str.length()){
                    if(str.charAt(i+1)=='o'&str.charAt(i+2)=='r'&str.charAt(i+3)=='d'){
                        tmp_index = i;
                        result += "letter";
                        i+=3;
                    }
                }
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
