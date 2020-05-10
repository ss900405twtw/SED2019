import java.io.*;
import java.util.*;
import java.math.*;

public abstract class InnerComponent extends Component {
    public InnerComponent(String name, double power, double cost) {
		this.name = name;
        this.power = power;
        this.cost = cost;
    }

    @Override
    public void print(String name) {
        // I know my name lol
        System.out.printf("%s (%s, %s)\n", this.name,
                          Helper.integerOrDouble(this.power),
                          Helper.integerOrDouble(this.cost));
    }
}
