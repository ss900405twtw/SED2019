import java.io.IOException;


public class TextView implements View {

    private String text;

    public TextView (String text){
        this.text = text;
    }

    public void display()
    {
        System.out.print(this.text);
    }
}