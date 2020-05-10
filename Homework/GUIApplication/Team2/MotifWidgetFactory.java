public class MotifWidgetFactory extends WidgetFactory {


    public MotifWidgetFactory() {

    }

    public Window makeWindow(String n) {
    	return new MotifWindow(n);
    }

    public ScrollBar makeScrollBar(String n) {
    	return new MotifScrollBar(n);
    }

    public  Button makeButton(String n) {
    	return new MotifButton(n);
    }

}
