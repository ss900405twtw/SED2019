import java.util.ArrayList;

public class Composition {
    public ArrayList<Component> components;
    public ArrayList<Line> lines;
    
    public void compose(Strategy strategy) {
        lines = strategy.arrange(components);
        for (Line l : lines) {
        	for (int i = 0; i < l.components.size(); i++) {
				// System.out.print("[" + Double.toString(c.getSize()) + "]" + c.getContent() + " ");
                l.components.get(i).display();
                if (i != l.components.size()-1) {
                    System.out.print(" ");
                }
        	}
        	System.out.println();
        }
    }
}
