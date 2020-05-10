public class TextFormat
{
	protected String content;
	TextFormat(){
		content = "";
	}
	public void display(){
		System.out.println(content);
	}
	public void append(String s){
		content += s;
	}
}