import java.util.LinkedHashMap;
import java.lang.StringBuilder;
import java.util.Map;

public class Inventory{

    LinkedHashMap<String, Component> components;

    public Inventory(){
        components = new LinkedHashMap<String, Component>();
    }  

    public void create(String name, double power, double cost)
    {
        Chassis s = new Chassis(name, power, cost);
        components.put(name, s);
    }   

    public void add(String type, String compo_name, double power_consumption, double additional_cost, String name)
    {
        Chassis s = (Chassis) components.get(name);
        if (type.equals("floppy")) {
            Floppy f = new Floppy(compo_name, power_consumption, additional_cost);
            s.addComponent(f);
        } else if (type.equals("bus")) {
            Bus b = new Bus(compo_name, power_consumption, additional_cost);
            s.addComponent(b);
        }
    }   

    public void get(String name, int index)
    {
        Chassis s = (Chassis) components.get(name);
        s.get(index);
    }   

    public void print(String name)
    {
        for (Map.Entry<String, Component> entry : components.entrySet()) {
            entry.getValue().print(name);
        }
    }   

    public void sumOfPowerConsumption(String name)
    {
        Chassis s = (Chassis) components.get(name);
        if (s == null) {
            System.out.printf("%s does not support command sumOfPowerConsumption\n", name);
        } else {
            s.sumPower();
        }
    }  

    public void sumOfAdditionCost(String name)
    {
        Chassis s = (Chassis) components.get(name);
        if (s == null) {
            System.out.printf("%s does not support command sumOfAdditionCost\n", name);
        } else {
            s.sumCost();
        }
    }   


}
