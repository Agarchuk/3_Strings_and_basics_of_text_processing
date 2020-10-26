package Str_As_Mas;

public class T_5 {
    public static void main(String[] args) {
        //Удалить в строке все лишние пробелы,
        // то есть серии подряд идущих пробелов заменить на одиночные пробелы.
        // Крайние пробелы в строке удалить.
        String str = " hanna     harchuk and     somebody      else    ";

        System.out.println("Строка с удаленными лишними пробелами: " + new_string(str));
    }

    public static String new_string(String str) {
        String result = "";
        if (str.charAt(0) != ' ') {
            result += str.charAt(0);
        }
        for (int i = 1; i < str.length(); i++) {
             if(str.charAt(i)!=' '){
                 result+= str.charAt(i);
             } else if(str.charAt(i)==' '){
                 if((i+1)!=str.length()-1&str.charAt(i+1)!=' '){
                     result+=' ';
                 } else{
                     i++;
                 }

             }
        }
        return result;
    }
}
