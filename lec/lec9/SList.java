public class SList<anytype> implements List61B<anytype> {

  public class Node{
    public anytype item;
    public Node next;

    public Node(anytype item, Node n){
      this.item = item;
      this.next = n;
    }
  }

  private Node sentinel;
  private int size;

  public SList(){
    size = 0;
    sentinel = new Node(null, null);
  }

  public SList(anytype x){
    size = 1;
    sentinel = new Node(null, null);
    sentinel.next = new Node(x, null);
  }

  public void addFirst(anytype x){
    Node oldSentNext = sentinel.next;
    Node newSentNext = new Node(x, oldSentNext);
    sentinel.next = newSentNext;
    size += 1;
  }

  public anytype getFirst(){
    return sentinel.next.item;
  }

  public void addLast(anytype x){
    Node newNode = sentinel;

    while(newNode.next != null){
      newNode = newNode.next;
    }
    newNode.next = new Node(x, null);
    size += 1;

  }

  private Node getLastNode() {
    Node p = sentinel;
    while(p.next != null){
      p = p.next;
    }
    return p;
  }

  public anytype getLast(){
    Node back = getLastNode();
    return back.item;
  }

  public anytype removeLast(){
    Node back = getLastNode();
    if (back == sentinel) {
      return null;
    }
    size -= 1;
    Node p = sentinel;
    while(p.next != back){
      p = p.next;
    }
    p.next = null;
    return back.item;
  }

  public int size(){
    return size;
  }

  public anytype get(int x){
    if (x == 0){
      return getFirst();
    }

    Node currentNode = sentinel.next.next;
    while (x > 1 && currentNode.next != null) {
      x -= 1;
      currentNode = currentNode.next;
    }
    return currentNode.item;  
  }

  public void insert(anytype x, int y){
    if (sentinel.next == null || y == 0) {
      addFirst(x);
      return;
    }

    Node current = sentinel.next.next;
    while(y > 1 && current.next != null){
      y -= 1;
      current = current.next;
    }

    Node newNode = new Node(x, current.next);
    current.next = newNode;
  }

}
