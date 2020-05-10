public class ScrollbarDecorator extends ViewDecorator
{
	ScrollbarDecorator(View view){
		super(view);
	}

	public void display(){
		view.display();

		System.out.print(" scrollBar");
	}
}