import java.util.ArrayList;

public class SimpleStrategy implements Strategy {

    SimpleStrategy() {
    }

    public ArrayList<Line> arrange(ArrayList<Component> components) {
        ArrayList<Line> lines = new ArrayList<Line>();

        for (Component c : components) {
            Line line = new Line();
            line.components.add(c);
            lines.add(line);
        }

        return lines;
    }
}