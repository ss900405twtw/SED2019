public class RTFConverter {

    public RTFConverter ()
    {

    }

    public TextFormat convert (TextConverter converter, String text)
    {
        return (converter.convert(text));
    }
}