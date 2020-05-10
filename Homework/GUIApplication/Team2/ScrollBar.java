public abstract class ScrollBar extends Widget {
    
    public static int priority = 2;

    public abstract void present();

    public abstract String getName();

    public int getPriority() {
    	return this.priority;
    }
}
