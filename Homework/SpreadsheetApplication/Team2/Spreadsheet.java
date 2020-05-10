import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import java.util.Map;

public class Spreadsheet implements Pltstgy{
    public Spreadsheet(){

    }
    public void print(LinkedHashMap<String, Data> data_list){
        for( Map.Entry<String, Data> entry : data_list.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue().value;
            System.out.println(key+" "+Integer.toString(value));
        }

    }
    public void modify(){

    }
}
