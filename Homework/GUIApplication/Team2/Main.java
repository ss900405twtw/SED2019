import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception{
        GUI gui = new GUI();

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();

        while (line != null) {
            String[] lineArgs = line.split(" ");
            
            if (lineArgs[0].equals("Window")) {
                String name = lineArgs[1];
                gui.add("Window", name);
            } else if (lineArgs[0].equals("ScrollBar")) {
                String name = lineArgs[1];
                gui.add("ScrollBar", name);  
            } else if (lineArgs[0].equals("Button")) {
                String name = lineArgs[1];
                gui.add("Button", name);  
            } else if (lineArgs[0].equals("Motif")) {
                MotifWidgetFactory m = new MotifWidgetFactory();
                gui.setStyle(m);
            } else if (lineArgs[0].equals("PM")) {
                PMWidgetFactory p = new PMWidgetFactory();
                gui.setStyle(p);
            } else if (lineArgs[0].equals("Present")) {
                gui.present();  
            }

            line = reader.readLine();
        }
    }
}
