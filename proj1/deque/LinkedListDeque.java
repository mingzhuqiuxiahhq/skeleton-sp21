package deque;

import java.util.Iterator;

public class LinkedListDeque<T>{


  public class LinkList{
    public LinkList prev;
    public T item;
    public LinkList next;

    public LinkList(){
      prev = null;
      next = null;
      item = null;
    }

    public LinkList(T f, LinkList prev, LinkList Next){
      this.prev = prev;
      this.next = Next;
      item = f;
    }
  }
  public int size;

  // empty LinkList is always at helper.next which is equal to sentinel node motherfuckers
  private LinkList helper;

  public LinkedListDeque(){
    helper = new LinkList(null, null, null);
    helper.next = helper;
    helper.prev = helper;
    size = 0;
  }
  /*
  public LinkedListDeque(T item){
    helper = new LinkList(null, null, null);
    helper.next = new LinkList(item, helper, helper);
    size = 1;
  }
  **/


  public void addFirst(T item){
    LinkList newL = new LinkList(item, helper, helper.next);
    newL.next.prev = newL;
    helper.next = newL;
    size += 1;
  }

  public void addLast(T item){
    LinkList newL = new LinkList(item, helper.prev , helper);
    helper.prev.next = newL;
    helper.prev = newL;
    size += 1;
  }

  public boolean isEmpty(){
    return size == 0;
  }
  public int size(){
    return size;
  }

  public void printDeque(){
    LinkList intNode = helper.next;
    while (intNode.item != null) {
      System.out.print(intNode.item + " ");
      intNode = intNode.next;
    }
    System.out.println();
  }

  public T removeFirst(){
    LinkList removeFirst = helper.next;
    if (removeFirst == helper
            //removeFirst.item == null || size == 0
    ) {
      return null;
    }
    else {
      T toReturn = removeFirst.item;
      removeFirst.next.prev = helper;
      helper.next = removeFirst.next;
      size -= 1;
      return toReturn;

    }
  }

  public T removeLast(){
      LinkList removeLast = helper.prev;
    if (removeLast == helper
            //removeLast.item == null || size == 0
    ) {
      return null;
    } else {
      T toReturn = removeLast.item;
      removeLast.prev.next = helper;
      helper.prev = removeLast.prev;
      size -= 1;
      return toReturn;
    }
  }


  public T get(int index){
    LinkList newL = helper.next;
    if (index > size -1 ) {
      return null;
    }
    else{
      for (int i = 0; index > i; i++) {
        newL = newL.next;
        }
      return newL.item;
    }
  }

  public Iterator<T> iterator(){
    Iterator<T> iter = iterator();
    return iter;
  }

  public boolean equals(Object o){
    if (o instanceof LinkedListDeque) {
      return true;
    }
    else{
      return false;
    }
  }

}
