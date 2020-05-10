import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String specFile = args[0];

		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line = reader.readLine();
        Inventory inventory = new Inventory();
		
		while (line != null) {
            String[] lineArgs = line.split(" ");
            String order = lineArgs[0];
            
            if (order.equals("create")) {
            	String name = lineArgs[1];
                double power_consumption = Double.valueOf(lineArgs[2]);
                double addition_cost = Double.valueOf(lineArgs[3]);
            	inventory.create(name, power_consumption, addition_cost);
            } 
            else if (order.equals("add")) {
            	String type = lineArgs[1];
            	String component_name = lineArgs[2];
                double power_consumption = Double.valueOf(lineArgs[3]);
                double addition_cost = Double.valueOf(lineArgs[4]);
                String name = lineArgs[5];
                inventory.add(type, component_name, power_consumption, 
                				addition_cost, name);
            } 
            else if (order.equals("get")) {
                String name = lineArgs[1];
            	int index = Integer.valueOf(lineArgs[2]);
            	inventory.get(name, index);
            }
            else if (order.equals("print")) {
                String name = lineArgs[1];
                inventory.print(name);
            }
            else if (order.equals("sumOfPowerConsumption")) {
                String name = lineArgs[1];
                inventory.sumOfPowerConsumption(name);
            } 
            else if (order.equals("sumOfAdditionCost")) {
                String name = lineArgs[1];
                inventory.sumOfAdditionCost(name);
            }

            line = reader.readLine();
        }
		
	}
}
