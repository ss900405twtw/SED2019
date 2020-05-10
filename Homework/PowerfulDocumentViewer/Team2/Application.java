import java.util.*;

public class Application {

    private ArrayList<Document> documentList;

    public Application ()
    {
        documentList = new ArrayList<Document>();
    }

    public void manageDocument()
    {
    }

    public void createDocument(DocumentCreator dc)
    {
        documentList.add(dc.createDocument());
    }

    public void present()
    {
        for (Document document: this.documentList)
        {
            document.printDocument();
        }
    }
}