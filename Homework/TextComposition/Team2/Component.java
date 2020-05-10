public abstract class Component {
	protected String id;
	private final double natSize;
	protected double maxSize, minSize, curSize;
	protected String content;

	Component(String id, double natSize, double maxSize, double minSize, String content) {
		/*
		if (natSize > maxSize || natSize < minSize) {
			throw new IllegalArgumentException("Natural size out of range");
		}
		*/
		this.id = id;
		this.natSize = natSize;
		this.maxSize = maxSize;
		this.minSize = minSize;
		this.content = content;

		this.curSize = natSize;

        // System.out.println("Component parameterised constructor called");
	}

	public String getId() { return this.id; }
	public double getNatSize() { return this.natSize; }
	public double getSize() { return this.curSize; }
	public double getMaxSize() { return this.maxSize; }
	public double getMinSize() { return this.minSize; }
	public String getContent() { return this.content; }

	public void resize(double newSize) {
		if (newSize < minSize || newSize > maxSize) {
			// throw new IllegalArgumentException("component " + this.id + " failed to change size");
			System.out.format("component %s failed to change size%n", this.id);
		}
		else {
			this.curSize = newSize;
			// System.out.println("component " + this.id + " size changed to " + newSize);
			System.out.println("component " + this.id + " size changed to " 
			+ ((newSize % 1 == 0)? String.format("%.0f",newSize) : newSize));	
			
		}
	}

	public abstract void display(); // Each component type implements their own display()
	
}
