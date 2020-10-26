package Str_or_StrBui;

public class T_6 {
    public static void main(String[] args) {
        // Из заданной строки получить новую, повторив каждый символ дважды.
        String s = "Harchuk Hanna";
        System.out.println("Строка с удвоенными символами: "+ double_symbols(s));
    }
    public static String double_symbols(String s){
        String new_s = "";
        for (int i =0; i<s.length();i++){
            new_s+=String.valueOf(s.charAt(i)).concat(String.valueOf(s.charAt(i)));
        }
        return new_s;
    }
}
