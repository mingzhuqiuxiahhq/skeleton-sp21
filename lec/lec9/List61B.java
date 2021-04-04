public interface List61B<anytype> {


    public void addFirst(anytype x);

    public anytype getFirst();

    public void addLast(anytype x);
    /*
    public Node getLastNode();
    **/

    public anytype getLast();

    public anytype removeLast();

    public int size();

    public anytype get(int x);

    public void insert(anytype x, int y);
}
