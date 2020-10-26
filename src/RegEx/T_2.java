package RegEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T_2 {
    public static void main(String[] args) throws IOException {
        // Напишите анализатор,
        // позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
        // (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
        // Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
        String str = string_from_xml("E:/work/Java/Strings/src/RegEx/file.xml");
        System.out.println(str);
        //поиск
        search(str);

    }
    public static String string_from_xml(String filename) throws IOException {
        FileReader fw = new FileReader(filename);
        Scanner scan = new Scanner(fw);
        StringBuilder xml_to_str = new StringBuilder();
        Pattern pattern = Pattern.compile("[^\\s]*(<.*>)");


        while (scan.hasNextLine()){
            Matcher matcher = pattern.matcher(scan.nextLine());
            if(matcher.find()){
                xml_to_str.append(matcher.group());
                //System.out.println(scan.nextLine());
            }

        }
        fw.close();
        return xml_to_str.toString();
    }
    public static void search(String str){
        Pattern pattern = Pattern.compile("((?<OpenTag>[<][^>]+[>])(?<Body>[^<]+)(?<CloseTag><[/][\\w]+[>]))|" +
                "(?<OnlyOpenTag><[^/][^>]+[^/]>)|(?<OnlyCloseTag><[/][\\w]+[>])|(?<TagWithoutBody><[^>]+/>)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            if(matcher.group("OpenTag")!= null && matcher.group("CloseTag")!= null){
                System.out.println("OpenTag: "+matcher.group("OpenTag")+" Body: "+matcher.group("Body")+" CloseTag: "+matcher.group("CloseTag"));
            } else if(matcher.group("OnlyOpenTag")!=null){
                System.out.println("OnlyOpenTag: "+matcher.group("OnlyOpenTag"));
            } else if(matcher.group("OnlyCloseTag")!=null){
                System.out.println("OnlyCloseTag: "+matcher.group("OnlyCloseTag"));
            } else if(matcher.group("TagWithoutBody")!=null){
                System.out.println("TagWithoutBody: "+matcher.group("TagWithoutBody"));
            }
        }

    }

}
