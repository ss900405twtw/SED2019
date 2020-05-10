public abstract class Element {
    protected boolean leaf;
	public abstract void print();
    public boolean isLeaf(){ return this.leaf; }
}