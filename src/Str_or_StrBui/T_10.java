package Str_or_StrBui;

public class T_10 {
    public static void main(String[] args) {
        //Строка X состоит из нескольких предложений,
        // каждое из которых кончается точкой, восклицательным или вопросительным знаком.
        // Определить количество предложений в строке X.
        String X = "Чeго вам нe слeдуeт дeлать однозначно, так это - разочаровываться в своeй жизни. Вы нe должны думать, что она нe удалась. Ни в каком возрастe нeльзя так думать. В этой жизни всe нe зря. И всe eщe только начинаeтся - в любоe врeмя, при любых условиях и обстоятeльствах.";
        System.out.println("В строке Х: "+count_of_sentences(X)+" предложений");
    }
    public static int count_of_sentences(String s){
        int result =0;
        for (int i =0; i<s.length(); i++){
            if(s.charAt(i)=='.'|s.charAt(i)=='?'|s.charAt(i)=='!'){
                result++;
            }
        }
        return result;
    }
}
