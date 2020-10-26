package RegEx;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T_1 {
    public static void main(String[] args) {
        //Cоздать приложение, разбирающее текст (текст хранится в строке)
        // и позволяющее выполнять с текстом три различных операции:
        // отсортировать абзацы по количеству предложений;
        // в каждом предложении отсортировать слова по длине;
        // отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
        String s = "8In this paragraph 2 sentences andaa 10 words. 2Second sentence.\n" +
                "8In this paragraph 1 sentence and 8 words.\n" +
                "8In this paragraph 4 sentences and 14 words. 2Second sentence. 1Third. 3And forth sentences.\n" +
                "8In this paragraph 3 sentences and 11 words. 1Second. 3Third sentence.";
        System.out.println("Ваша строка:\n"+s);
        System.out.println("Выберите операцию над текстом:\n1. отсортировать абзацы по количеству предложений;\n2. в каждом предложении отсортировать слова по длине;\n3.  отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту");
        System.out.print("Номер операции: ");
        int operation = operation();
        System.out.println("После сортировки:\n"+(sort_str(s, operation)));
    }
    public static int operation(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static String sort_str(String Str, int operation){
        String result ="";

        switch (operation){
            case 1:
                //разбиение текста на абзацы
                String[] arr_of_par = break_str(Str, "\n");
                //вычисляем количество предложений в каждом абзаце
                String[] arr_of_sent_in_par = count_in_smth(arr_of_par.length, arr_of_par, "\\.");
                //сортируем абзацы по количеству предложений в абзаце
                result = Arrays.toString(sort(arr_of_par,arr_of_sent_in_par));
                break;

            case 2:
                //разбиваем текст на предложения
                String[] arr_of_sent = break_str(Str, "\\.\\s|\\.");
                //System.out.println("разбитый по предложениям:"+Arrays.toString(arr_of_sent));
                //разбиваем предложение на слова
                for (int i = 0; i<arr_of_sent.length; i++){
                    String[] arr_of_words = break_str(arr_of_sent[i], "\\s");
                    System.out.println("Массив слов: "+Arrays.toString(arr_of_words));
                    //вычисляем длину слов
                    String[] len_of_words = count_in_smth(arr_of_words.length, arr_of_words, "[a-zA-Z0-9]");
                    //сортируем
                    arr_of_sent[i] = Arrays.toString(sort(arr_of_words,len_of_words));

                }
                result = Arrays.toString(arr_of_sent);
                break;

            case 3:
                //разбиваем текст на предложения
                arr_of_sent = break_str(Str, "\\.\\s|\\.");
                //разбиваем предложение на слова
                for (int i = 0; i<arr_of_sent.length; i++){
                    String[] arr_of_words = break_str(arr_of_sent[i], "\\s");
                    Arrays.sort(arr_of_words);
                    System.out.println("Массив слов: "+Arrays.toString(arr_of_words));
                    //сколько символов "а" входит в лексему
                    String[] len_of_words = count_in_smth(arr_of_words.length, arr_of_words, "a");
                    System.out.println("Количество а в лексеме: "+Arrays.toString(len_of_words));
                    //сортируем
                    arr_of_sent[i] = Arrays.toString(sort(arr_of_words,len_of_words));
                    result = Arrays.toString(arr_of_sent);
                }

                break;
        }
        return result;
    }
    public static String[] break_str(String Str, String pattern){
        String[] arr_of_paragraphs = Str.split(pattern);
        return arr_of_paragraphs;
    }
    public static String[] break_array(int len, String[] arr_of_paragraphs, String pattern){
        Pattern pattern_2 = Pattern.compile(pattern);
        String[] count_of_sentences_in_paragr = new String[len];
        for (int i = 0; i<len; i++){
            Matcher matcher_2 = pattern_2.matcher(arr_of_paragraphs[i]);
            int count_of_sent_in_paragr = 0;
            while (matcher_2.find()){
                count_of_sent_in_paragr++;
            }
            count_of_sentences_in_paragr[i]= String.valueOf(count_of_sent_in_paragr);
        }
        return count_of_sentences_in_paragr;
    }

    public static String[] count_in_smth(int len, String[] arr_of_paragraphs, String pattern){
        Pattern pattern_2 = Pattern.compile(pattern);

        String[] count_of_sentences_in_paragr = new String[len];
        for (int i = 0; i<len; i++){
            Matcher matcher_2 = pattern_2.matcher(arr_of_paragraphs[i]);
            int count_of_sent_in_paragr = 0;
            while (matcher_2.find()){
                count_of_sent_in_paragr++;
            }
            count_of_sentences_in_paragr[i]= String.valueOf(count_of_sent_in_paragr);
        }
        return count_of_sentences_in_paragr;
    }

    public static String[] sort(String[] count_of_elem, String[] len_of_elem){
//        int tmp_el = 0;
        String tmp_len = "";
        String tmp_max = "";
        for (int i = 0; i<count_of_elem.length; i++){
            for (int j = count_of_elem.length - 1; j>i; j--){
                if(Integer.valueOf(len_of_elem[j])>Integer.valueOf(len_of_elem[j-1])){
                    tmp_max = count_of_elem[j];
                    tmp_len = len_of_elem[j];
                    count_of_elem[j] = count_of_elem[j-1];
                    len_of_elem[j]=len_of_elem[j-1];
                    count_of_elem[j-1] = tmp_max;
                    len_of_elem[j-1] = String.valueOf(tmp_len);

                    //System.out.println(tmp_max);

                }
               // System.out.println(Arrays.toString(count_of_elem));
            }
            }
        return count_of_elem;
    }

}
