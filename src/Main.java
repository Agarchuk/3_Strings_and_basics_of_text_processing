import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String str = getStringFromXML("E:/work/Java/Strings/src/RegEx/file.xml");

        Pattern pattern1 = Pattern.compile("((?<openTag><[^/][^>]*[^/]>)(?<body>.*)(?<closeTag><[/][^>]*[^/]>))|(?<OnlyOpenTag><[^/][^>]*[^/]>)|(?<onlyCloseTag><[/][^>]*[^/]>)|(?<noBodyTag><[^>]*[/]>)");

        if (str != null) {
            System.out.println(str);
            Matcher matcher1 = pattern1.matcher(str);

            while (matcher1.find()) {
                if (matcher1.group("openTag") != null && matcher1.group("closeTag") != null) {
                    System.out.print("Open tag is: " + matcher1.group("openTag") + ". Close tag is: " + matcher1.group("closeTag") + ". Body is: " + matcher1.group("body") + "\n");

                                }else if (matcher1.group("OnlyOpenTag") != null) {
                    System.out.print("Open tag is: " + matcher1.group("OnlyOpenTag"));
                    System.out.println();
                } else if (matcher1.group("onlyCloseTag") != null) {
                    System.out.print("Close tag is: " + matcher1.group("onlyCloseTag"));
                    System.out.println();
                } else if (matcher1.group("noBodyTag") != null) {
                    System.out.print("No body tag is: " + matcher1.group("noBodyTag"));
                    System.out.println();
                }
            }
        }
    }

    private static String getStringFromXML(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder strFromXML = new StringBuilder();

            while((line = br.readLine()) != null){
                strFromXML.append(line.trim() + "\n");
            }
            return strFromXML.toString();
        }catch (IOException e) {
            System.out.println("ERROR! File not found.");
            return null;
        }
    }

}
