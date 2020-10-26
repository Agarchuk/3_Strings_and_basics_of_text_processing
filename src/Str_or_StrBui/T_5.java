package Str_or_StrBui;

public class T_5 {
    public static void main(String[] args) {
        //Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
        String s = "Harchuk Hanna";
        System.out.println("среди символов заданной строки буква “а” встречается "+ count(s)+" раза");
    }
    public static int count(String s){
        int result =0;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                result++;
            }
        }
        return result;
    }
}
