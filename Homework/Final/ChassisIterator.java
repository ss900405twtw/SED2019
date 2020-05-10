public class ChassisIterator implements Iterator
{
	private Chassis chassis;
	private int index = 0;

	ChassisIterator(Chassis chassis) { this.chassis = chassis; }

	public boolean hasNext() { return (index + 1 <= chassis.innerComponents.size());}

	public Component next() {
		return chassis.innerComponents.get(index++); 
	}
}