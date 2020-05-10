public abstract class Button extends Widget {
    
	public static int priority = 3;

    public abstract void present();

    public abstract String getName();

    public int getPriority() {
    	return this.priority;
    }
}
