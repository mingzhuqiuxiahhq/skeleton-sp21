public class vengefulSList<anytype> extends SList<anytype>{
  private SList<anytype> deletedItems;

  public vengefulSList(){
    super();
    deletedItems = new SList<anytype>();
  }

  public vengefulSList(anytype x){
    super(x);
    deletedItems = new SList<anytype>();
  }

  @Override
  public anytype removeLast(){
    anytype oldBack = super.removeLast();
    deletedItems.addLast(oldBack);
    return oldBack;
  }

  public void printLostItems(){
    deletedItems.print();
  }

  public static void main(String[] args) {
    vengefulSList<Integer> vs1 = new vengefulSList<Integer>();
    vs1.addLast(1);
    vs1.addLast(5);
    vs1.addlast(10);
    vs1.addLast(13);
    vs1.removeLast();
    vs1.removeLast();
    System.out.print("The fallen are: ");
    vs1.printLostItems();

    vengefulSList<Integer> vs2 = new vengefulSList<Integer>(9);
    SList<Integer> sl = vs2;

    sl.addLast(50);
    sl.removeLast();

    sl.printLostItems();
    vengefulSList<integer> vs3 = sl;


    /*        name           static         dynamic
              sl2            SList          vengefulsl
        compiler looks at vengefulsl is a SList
    **//
    SList<integer> sl2 = new vengefulSList<integer>();

    /*        name           static         dynamic
              sl2            vengefulsl     SList      
        compiler looks at SList is a vengefulSList
    **//
    vengefulSList<integer>() vsl2 = new SList<integer>();


  }





}
