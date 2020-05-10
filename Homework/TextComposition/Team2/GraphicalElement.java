public class GraphicalElement extends Component {
	GraphicalElement(String id, double natSize, double maxSize, double minSize, String content){
		super(id, natSize, maxSize, minSize, content);
		// System.out.println("GraphicalElement parameterised constructor called");
	}
	/*
    public GraphicalElement()
    {
        System.out.println("GraphicalElement Class is constructed!");
	}
	*/

	public void display() {
		System.out.print("[" 
			+ ((curSize % 1 == 0)? String.format("%.0f",curSize) : curSize) 
			+ "]" + this.content);
		
	}
}