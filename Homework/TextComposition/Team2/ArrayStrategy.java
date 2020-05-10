import java.util.ArrayList;
import java.lang.Math;

public class ArrayStrategy implements Strategy {
    static int ROW_SIZE = 3;

    ArrayStrategy() {
    }

    public ArrayList<Line> arrange(ArrayList<Component> components) {
        ArrayList<Line> lines = new ArrayList<Line>();

        for (int i = 0; i < components.size(); i+=ROW_SIZE) {
            int end = Math.min(i+ROW_SIZE, components.size());
            Line line = new Line();
            line.components = new ArrayList<Component>(components.subList(i, end));
            lines.add(line);
        }

        return lines;
    }
}