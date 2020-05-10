import java.util.*;

public class PrintOut {

    public Map<String, DataStructure> DSMap;

    public PrintOut ()
    {
        DSMap = new HashMap<String, DataStructure>();
    }

    public void traverse(DataStructure ds) {
        Iterator i = ds.createIterator();
        while(i.hasnext())
        {
            System.out.println(i.next());
        } 
    }
}