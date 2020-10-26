package Str_As_Mas;

public class T_4 {
    public static void main(String[] args) {
        // В строке найти количество чисел.
        String str = "df157651gh123dfg 5fgh fghj78 ";
        System.out.println("В строке "+count(str)+" чисел");
    }

    public static int count(String str){
        int result = 0;
        for (int i =0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i))){
                    i++;
                }
                result++;
            }
        }
        return  result;
    }
}
