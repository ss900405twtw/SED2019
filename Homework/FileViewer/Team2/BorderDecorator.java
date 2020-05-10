public class BorderDecorator extends ViewDecorator
{
	BorderDecorator(View view){
		super(view);
	}
	
	public void display(){
		view.display();

		System.out.print(" thickBlackBorder");
	}
}