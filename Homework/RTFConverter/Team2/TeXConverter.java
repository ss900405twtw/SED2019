import java.util.HashMap;

public class TeXConverter extends TextConverter
{
	TeXConverter(){
		super();
	}

	public TextFormat newText(){
		return new TeXText();
	}
}