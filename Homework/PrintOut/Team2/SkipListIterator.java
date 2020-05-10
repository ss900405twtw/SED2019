public class SkipListIterator implements Iterator{
    public int index;
    public SkipList list;
    public SkipListIterator(SkipList list){
        index = 0;
        this.list = list;
    }
    public SkipNode next(){
        SkipNode e = list.getNode(index);
        index++;
        return e;
    }
    public Boolean hasnext(){
        return (list.size() > index);
    }
}
