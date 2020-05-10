import java.io.*;
import java.util.*;
import java.math.*;

public class Chassis extends Component{
    ArrayList<InnerComponent> innerComponents = new ArrayList<InnerComponent>();

    Chassis(String name, double power, double cost) {
        this.name = name;
        this.power = power;
        this.cost = cost;
    }

    public Iterator createIterator() {
        return new ChassisIterator(this);
    }

    public double sumCost() {
        double sum = this.cost;
        Iterator iter = this.createIterator();
        while (iter.hasNext()) {
            sum += ((Component)iter.next()).cost;
        } 
        System.out.println(Helper.integerOrDouble(sum));

        return sum;
    }

    public double sumPower() {
        double sum = this.power;
        Iterator iter = this.createIterator();
        while (iter.hasNext()) {
            sum += ((Component)iter.next()).power;
        } 
        System.out.println(Helper.integerOrDouble(sum));
        
        return sum;
    }

    public void get(int index_from_one) {
        int index_from_zero = index_from_one - 1;
        if (this.innerComponents.size() <= index_from_zero) {
            // System.out.println("!! len:" + String.valueOf(this.innerComponents.size()));
            System.out.println("Index " +  String.valueOf(index_from_one) + " out of bound of " + this.name);
        } else {
            System.out.printf("%s:%s\n", this.name, this.innerComponents.get(index_from_zero).name);
        }
    }

    public void addComponent(InnerComponent newComponent) {
        this.innerComponents.add(newComponent);
    }

    public void print(String name) {
        if (this.name.equals(name)) {
            // print self & child info
            System.out.println(this.name + " (" + Helper.integerOrDouble(this.power) + ", " + Helper.integerOrDouble(this.cost) + ")");
            Iterator iter = this.createIterator();
            while (iter.hasNext()) {
                System.out.printf("%s:", this.name);
                ((Component)iter.next()).print(name);
            } 
        }
        for (InnerComponent component : this.innerComponents) {
            if (component.name.equals(name)) {
                component.print(name);
            }
        }
    }
}
