import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import java.util.Map;

class BarChart implements Pltstgy {

    @Override
    public void print(LinkedHashMap<String, Data> data) {
        for (Map.Entry<String, Data> element : data.entrySet()) {
            StringBuilder barBuilder = new StringBuilder();
            for (int i = 0; i < element.getValue().value; ++i)
                barBuilder.append('=');

            System.out.println(barBuilder.toString() + " " + element.getKey());
        }
    }

    @Override
    public void modify() {
        // nothing.
    }
}