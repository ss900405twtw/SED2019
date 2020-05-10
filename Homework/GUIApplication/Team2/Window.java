public abstract class Window extends Widget {
    
	public static int priority = 1;

    public abstract void present();

    public abstract String getName();

    public int getPriority() {
    	return this.priority;
    }

}
