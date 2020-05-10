public class Question extends Group {

    public Question(boolean leaf) {
        super(leaf);
    }

    @Override
    public void print() {
        for (Element e : elements) {
            e.print();
            System.out.print("\n");
        }
    }
}
