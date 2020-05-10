import java.io.*;
import java.util.*;
import java.math.*;

public class InnerComponent extends Component {
    public InnerComponent(String name, double power, double cost) {
		this.name = name;
        this.power = power;
        this.cost = cost;
    }

    @Override
    public double sumPower() {
        System.out.printf("%s does not support command sumOfPowerConsumption\n", this.name);
        return -1;  // dummy
    }

    @Override
    public double sumCost() {
        System.out.printf("%s does not support command sumOfAdditionCost\n", this.name);
        return -1;  // dummy
    }

    @Override
    public void print(String name) {
        // I know my name lol
        System.out.printf("%s (%s, %s)\n", this.name,
                          Helper.integerOrDouble(this.power),
                          Helper.integerOrDouble(this.cost));
    }
}
