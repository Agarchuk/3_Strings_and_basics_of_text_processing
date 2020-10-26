package Str_or_StrBui;

public class T_2 {
    public static void main(String[] args) {
        // В строке вставить после каждого символа 'a' символ 'b'.
        String str = "hanna harchuk ahaha";
        System.out.println("Получившаяся строка: "+new_str(str));
    }
    public static String new_str(String str){
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                result+="ab";
            } else{
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
