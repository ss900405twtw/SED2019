import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws Exception{
        LinkedHashMap<String, View> views = new LinkedHashMap<String, View>();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();

        while (line != null) {
            String[] lineArgs = line.split(" ");
            String viewName = lineArgs[0];
            
            if (lineArgs[1].equals("add")) {
                
                for (int i = 2; i < lineArgs.length; ++i) {
                    
                    // add decorator
                    if (lineArgs[i].equals("scrollBar")) {
                        views.put(viewName, (View) new ScrollbarDecorator(views.get(viewName)));
                    } else if (lineArgs[i].equals("thickBlackBorder")) {
                        views.put(viewName, (View) new BorderDecorator(views.get(viewName)));                        
                    } else {
                        // TODO: print warning: no such decorator.
                    }

                }

            } else if (lineArgs[1].equals("display")) {
                views.get(lineArgs[0]).display();
                System.out.println(""); //print new line
            
            } else {
                // add new view
                views.put(viewName, new TextView(lineArgs[1]));
            }

            line = reader.readLine();
        }
    }
}