public abstract class WidgetFactory {


    public WidgetFactory() {

    }

    public abstract Window makeWindow(String n);

    public abstract ScrollBar makeScrollBar(String n);

    public abstract Button makeButton(String n);

}