package Str_or_StrBui;

public class T_3 {
    public static void main(String[] args) {
        //Проверить, является ли заданное слово палиндромом
        String str1 = new String("HannaH");
        String str2 = new String("Hanna");
        String str3 = new String("Hanna annaH");
        System.out.println("Строка "+str1+" палиндром? " +check(str1));
        System.out.println("Строка "+str2+" палиндром? " +check(str2));
        System.out.println("Строка "+str3+" палиндром? " +check(str3));
    }
    public static boolean check(String str){
        StringBuilder reverse =new StringBuilder(str);
        reverse = reverse.reverse();
        //System.out.println("reverse: "+reverse);
        //System.out.println("str: "+str);
        //System.out.println(str.equals(reverse.toString()));
        if(str.equals(reverse.toString())){
            return true;
        }else {
            return false;
        }
    }
}
