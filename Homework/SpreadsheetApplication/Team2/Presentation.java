import java.util.*;
public class Presentation {
    public List<Pltstgy> strategyList;
    public LinkedHashMap<String, Data> dataList;
    public Presentation ()
    {
        this.strategyList = new ArrayList<Pltstgy>();
        this.dataList = new LinkedHashMap<String, Data>();
    }
    public void add(String itemName, int dataValue)
    {
        this.dataList.put(itemName, new Data(dataValue));
    }
    public void change(Pltstgy strategy, String itemName, int dataValue)
    {
        if (dataList.containsKey(itemName))
        {
            this.dataList.put(itemName, new Data(dataValue));
        }
        else
        {
            this.add(itemName, dataValue);
        }
        this.printAllChart();
    }
    public void printAllChart()
    {
        for (Pltstgy str:strategyList)
        {
            str.print(this.dataList);

        }
    }
    public void add_strategy(Pltstgy strategy)
    {
        this.strategyList.add(strategy);
    }
}