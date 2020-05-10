public class PMWidgetFactory extends WidgetFactory {


    public PMWidgetFactory() {

    }

    public Window makeWindow(String n) {
    	return new PMWindow(n);
    }

    public ScrollBar makeScrollBar(String n) {
    	return new PMScrollBar(n);
    }

    public  Button makeButton(String n) {
    	return new PMButton(n);
    }

}