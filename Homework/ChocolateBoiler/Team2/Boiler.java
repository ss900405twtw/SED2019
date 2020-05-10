
public class Boiler {
    static Boiler boiler = null;

    private boolean isEmpty = true;
    private boolean isBoiled = false;

    private Boiler() {

    }

    public void fill() {
        if (! this.isBoiled && this.isEmpty) {
            System.out.println("Fill chocolate");
            this.isEmpty = false;
        }
    }

    public void boil() {
        if (! this.isEmpty && ! this.isBoiled) {
            System.out.println("Boil chocolate");
            this.isBoiled = true;
        }

    }

    public void drain() {
        if (!this.isEmpty && this.isBoiled) {
            System.out.println("Drain the boiled chocolate");
            this.isBoiled = false;
            this.isEmpty = true;
        }
    }

    public static Boiler getBoiler() {
        if (Boiler.boiler == null) {
            Boiler.boiler = new Boiler();
        }

        return Boiler.boiler;
    }

}