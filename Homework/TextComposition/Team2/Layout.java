import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Layout {
    private Map<String, Component> components;

    public Layout(String specFile) throws Exception {
        FileReader fr = new FileReader(specFile);
        BufferedReader br = new BufferedReader(fr);

        components = new LinkedHashMap<String, Component>();
        while (br.ready()) {
            String[] spec = br.readLine().split(" ");
            if (spec[0].equals("Text") || spec[0].equals("GraphicalElement")) {
                String componentId = spec[1];
                int naturalSize = Integer.parseInt(spec[2]);
                int shrinkability = Integer.parseInt(spec[3]);
                int stretchability = Integer.parseInt(spec[4]);
                String content = spec[5];

                Component component;
                if (spec[0].equals("Text")) {
                    component = new Text(componentId, naturalSize, stretchability, shrinkability, content);
                } else {
                    component = new GraphicalElement(componentId, naturalSize, stretchability, shrinkability, content);
                }
                components.put(componentId, component);
            } else if (spec[0].equals("ChangeSize")) {
                String componentId = spec[1];
                int newSize = Integer.parseInt(spec[2]);
                components.get(componentId).resize(newSize);
            } else if (spec[0].equals("Require")) {
                String strategyName = spec[1];
                Strategy strategy;
                if (strategyName.equals("SimpleComposition")) {
                    strategy = new SimpleStrategy();
                } else if (strategyName.equals("TexComposition")) {
                    strategy = new TexStrategy();
                } else if (strategyName.equals("ArrayComposition")) {
                    strategy = new ArrayStrategy();
                } else {
                    // make strategy always initialized
                    throw new Exception("Unknown strategy");
                }
                this.require(strategy);
            }
        }

        fr.close();
    }

    private void require(Strategy strategy) {
        Composition composition = new Composition();
        ArrayList<Component> componentsList = new ArrayList<Component>();
        for (Map.Entry<String, Component> entry : components.entrySet()) {
            componentsList.add(entry.getValue());
        }
        composition.components = componentsList;
        composition.compose(strategy);
    }
}
