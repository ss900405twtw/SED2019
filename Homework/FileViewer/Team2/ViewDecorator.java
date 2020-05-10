public abstract class ViewDecorator implements View {
    protected View view;

    public abstract void display();

    public ViewDecorator(View view) {
        this.view = view;
    }
}
