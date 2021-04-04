public class RotatingSList<anytype> extends SList<anytype>{
  public void rotateRight(){
    anytype oldBack = removeLast();
    insertFront(oldBack);
  }


}
