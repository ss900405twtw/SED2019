import java.util.HashMap;
import java.lang.Character;

public abstract class TextConverter
{
	public HashMap<Character, ConvertToken> convertMap;

	TextConverter(){
		convertMap = new HashMap<Character, ConvertToken>(); 
	}
	public TextFormat convert(String text){
		TextFormat textFormat = newText();
		for (char c : text.toCharArray()){
			String ptext = "";
			ConvertToken ct = convertMap.get(c);
			if (ct != null) ptext = ct.convert();
			textFormat.append(ptext);
		}
		
		return textFormat;
	}

	public abstract TextFormat newText();
}