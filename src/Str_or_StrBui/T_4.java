package Str_or_StrBui;

public class T_4 {
    public static void main(String[] args) {
        // С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
        String s1 = "информатика";
        String result="";
        result = result.concat(String.valueOf(s1.charAt(7)))+result.concat(String.valueOf(s1.charAt(3))+result.concat(String.valueOf(s1.charAt(4))+result.concat(String.valueOf(s1.charAt(7)))));
        System.out.println(result);


    }
}
