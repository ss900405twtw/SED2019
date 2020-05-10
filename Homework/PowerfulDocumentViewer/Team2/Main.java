import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();

        Application app = new Application();


        while (line != null) {
            String[] lineArgs = line.split(" ");
            String order = lineArgs[0];
            
            if (order.equals("Draw")) {
                DocumentCreator creator = new DrawingDocumentCreator();
                app.createDocument(creator);

            } 
            else if (order.equals("Text")) {
                DocumentCreator creator = new TextDocumentCreator();
                app.createDocument(creator);

            } 
            else if(order.equals("Present")) {
                app.present();
            }

            else{
                System.out.println("error order");
            }
            line = reader.readLine();
        }
    }
}