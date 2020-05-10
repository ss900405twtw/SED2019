import java.util.ArrayList;
import java.lang.Math;

public class TexStrategy implements Strategy {

    TexStrategy() {
    }

    public ArrayList<Line> arrange(ArrayList<Component> components) {
        
        ArrayList<Line> lines = new ArrayList<Line>();

        lines.add(new Line());
        Line currentLine = lines.get(0);

        for (Component c : components) {
            if (currentLine == null) {
                Line newLine = new Line();
                lines.add(newLine);
                currentLine = newLine;
            }

            currentLine.components.add(c);
            
            if (is_paragraph_end(c)) {
                currentLine = null;
            }
        }

        return lines;
    }

    private boolean is_paragraph_end(Component component) {
        return component.getContent().equals("<ParagraphEnd>");
    }
}