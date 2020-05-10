import java.util.ArrayList;
public class SkipList implements DataStructure{
	public ArrayList<SkipNode> content = new ArrayList<SkipNode>();
	public Iterator createIterator(){
		return new SkipListIterator(this);
	}

	public int size(){
		return content.size();
	}

	public void add(String str){
		content.add(new SkipNode(str));
	}

	public SkipNode getNode(int index){
		return content.get(index);
	}
}