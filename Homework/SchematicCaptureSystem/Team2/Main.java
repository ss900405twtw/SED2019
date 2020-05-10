import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String content;
        try {
            content = new Scanner(new File(args[0])).useDelimiter("\\Z").next();
            // System.out.println(content);            
        } catch (Exception e){
            System.out.println("Cannot open file: " + args[1]);
            content = "";
        }

        Parser parser = new Parser(content);
        ArrayList<Element> topLevelElements = parser.parse();
        for(Element e : topLevelElements) {
            e.print();
        }
    }

}
