import java.util.HashMap;

public class WidgetConverter extends TextConverter
{
	WidgetConverter(){
		super();
	}

	public TextFormat newText() {
		return new WidgetText();
	}
}