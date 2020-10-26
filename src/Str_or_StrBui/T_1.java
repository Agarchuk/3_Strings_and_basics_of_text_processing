package Str_or_StrBui;

public class T_1 {
    public static void main(String[] args) {
        //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
        String str = "aaa   bbbb    cc  ddddd jj      ;=k";
        System.out.println("наибольшее количество подряд идущих пробелов в строке: "+count(str));
    }
    public static int count(String str){
        int max =-999;
        int count =0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                while(str.charAt(i)==' '){
                    count++;
                    i++;
                }
                if(count>max){
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
}
