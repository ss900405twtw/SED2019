public class DrawingDocument implements Document {

    private String documentName;

    public DrawingDocument ()
    {
        this.documentName = "DrawingDocument";
    }
    
    public DrawingDocument (String documentName)
    {
        this.documentName = documentName;
    }

    public void printDocument()
    {
        System.out.println(this.documentName);
    }
}