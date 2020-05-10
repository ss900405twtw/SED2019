public class PMButton extends Button {
    
    static int maxId = 0;
	String name;
	int id;

    public PMButton (String n) {
    	this.name = n;
        this.id = maxId;
        maxId++;
    }

    public int getID() {
    	return this.id;
    }

    public String getName() {
    	return this.name;
    }

    public void present() {
    	System.out.println("PMButton " + this.name);
    }
}
