import java.util.PriorityQueue;
import java.util.Arrays;

class GUI {
    PriorityQueue<Widget> widgets;
    WidgetFactory widgetFactory;

    public GUI() {
        widgets = new PriorityQueue<Widget>(10, (Widget a, Widget b) -> {
            if (a.getPriority() != b.getPriority()) {
                return a.getPriority() - b.getPriority();
            }
            return a.getID() - b.getID();
        });
        widgetFactory = new MotifWidgetFactory();
    }

    public void setStyle(WidgetFactory factory) {
        this.widgetFactory = factory;

        // recreate
        Widget[] widgetsArray = getWidgetsArray();
        widgets.clear();
        for (Widget widget : widgetsArray) {
            String widgetType = "";
            if (widget instanceof Window) {
                widgetType = "Window";
            } else if (widget instanceof ScrollBar) {
                widgetType = "ScrollBar";
            } else if (widget instanceof Button) {
                widgetType = "Button";
            }
            String name = widget.getName();
            add(widgetType, name);
        }
    }

    public void add(String widgetType, String widgetName) {
        if (widgetType == "Window") {
            widgets.add(widgetFactory.makeWindow(widgetName));
        } else if (widgetType == "ScrollBar") {
            widgets.add(widgetFactory.makeScrollBar(widgetName));
        } else if (widgetType == "Button") {
            widgets.add(widgetFactory.makeButton(widgetName));
        } else {
            // What are you talking about!?!
        }
    }

    private Widget[] getWidgetsArray() {
        Widget[] ret = new Widget[widgets.size()];
        widgets.toArray(ret);
        Arrays.sort(ret, widgets.comparator());
        return ret;
    }

    public void present() {
        Widget[] widgetsArray = getWidgetsArray();
        for (Widget widget : widgetsArray) {
            widget.present();
        }
    }
}
