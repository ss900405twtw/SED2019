import java.util.ArrayList;
public class List implements DataStructure{
	public ArrayList<String> content = new ArrayList<String>();
	public int length = 0;
	public Iterator createIterator(){
		return new ListIterator(this);
	}

	public void add(String str){
		content.add(str);
		length += 1;
	}

	public String get(int index){
		return (content.get(index));
	}
}