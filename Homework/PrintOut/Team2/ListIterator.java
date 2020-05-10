public class ListIterator implements Iterator{
    public int index;
    public List list;
    public ListIterator(List list){
        index = 0;
        this.list = list;
    }
    public String next(){
        String e = list.get(index);
        index++;
        return e;
    }
    public Boolean hasnext(){
        return (list.length > index);
    }
}
