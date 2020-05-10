public abstract class Component {
    public String name;
    public double cost;
    public double power;
    public abstract double sumCost();
    public abstract double sumPower();
    public abstract void print(String name);
}
