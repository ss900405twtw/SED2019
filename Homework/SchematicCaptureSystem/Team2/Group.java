import java.util.ArrayList;
import java.util.List;

public class Group extends Element {
    protected List<Element> elements;

    public Group(boolean leaf) {
        this.elements = new ArrayList<Element>();
        this.leaf = leaf;
    }

    public void addElement(Element e) {
        elements.add(e);
    }

    @Override
    public void print() {
        System.out.print("Group:{");

        for (Element e : elements) {
            e.print();
        }

        System.out.print("} ");
    }
}
