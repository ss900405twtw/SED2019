public class Text extends Component {
	Text(String id, double natSize, double maxSize, double minSize, String content) {
		super(id, natSize, maxSize, minSize, content);
		// System.out.println("Text parameterised constructor called");
	}
	/*
    public Text()
    {
        System.out.println("Text Class is constructed!");
	}
	*/

	public void display() {
		System.out.print("[" 
			+ ((curSize % 1 == 0)? String.format("%.0f",curSize) : curSize) 
			+ "]" + this.content);
	}
}