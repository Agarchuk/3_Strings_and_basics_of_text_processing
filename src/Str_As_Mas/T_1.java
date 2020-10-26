package Str_As_Mas;

import java.util.Arrays;

public class T_1 {
    public static void main(String[] args) {
        //Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
        //camelCase - несколько слов пишутся слитно без пробелов, при этом каждое слово внутри фразы пишется с прописной буквы
        //snake_case - при котором несколько слов разделяются символом подчеркивания (_),
        // и не имеют пробелов в записи, причём каждое слово обычно пишется с маленькой буквы
        String[] s_camel = new String[]{"HarchukHanna", "HarchukMarina", "HarchukNikita"};
        StringBuilder[] s_snake = new StringBuilder[s_camel.length];
        System.out.println(Arrays.toString(s_snake));
        StringBuilder tmp = new StringBuilder();
        String symbol ="_";

        for(int i = 0; i<s_camel.length; i++){
            s_snake[i] = new StringBuilder(s_camel[i].charAt(0));
            System.out.println(Arrays.toString(s_snake));
            for(int j = 0; j<s_camel[i].length(); j++){
                if(j==0){
                    s_snake[i].insert(j, Character.toLowerCase(s_camel[i].charAt(j)));
                } else if(!Character.isUpperCase(s_camel[i].charAt(j))){
                    s_snake[i].insert( s_snake[i].length(),s_camel[i].charAt(j));
                    System.out.println(Arrays.toString(s_snake));
            } else if(Character.isUpperCase(s_camel[i].charAt(j))){
                    s_snake[i].insert(j,"_");
                    s_snake[i].insert(j+1, Character.toLowerCase(s_camel[i].charAt(j)));
                   //s_snake[i].insert(j, s_camel[i].charAt(j));
                    System.out.println(Arrays.toString(s_snake));
                    //j++;
                }


            }
        }


        

    }
}
