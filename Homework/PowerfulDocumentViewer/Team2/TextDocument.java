public class TextDocument implements Document{

    private String documentName;

    public TextDocument ()
    {
        this.documentName = "TextDocument";
    }

    public TextDocument (String documentName)
    {
        this.documentName = documentName;
    }

    public void printDocument()
    {
        System.out.println(this.documentName);
    }
}