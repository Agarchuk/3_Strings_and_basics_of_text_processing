package Str_As_Mas;

public class T_3 {
    public static void main(String[] args) {
        //  В строке найти количество цифр.
        String str = "fghj2mgh2jk8 gh 67bnm, 9";
        System.out.println("В строке " +count_of_numbers(str)+" цифр");
    }
    public static int count_of_numbers(String str){
        int result =0;
        for (int i = 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                result++;
            }
        }
        return result;
    }
}
