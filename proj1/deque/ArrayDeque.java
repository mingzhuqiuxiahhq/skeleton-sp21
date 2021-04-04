package deque;

import java.util.Iterator;

public class ArrayDeque<T>{

    public int size;

    // empty  is always at helper.next which is equal to sentinel node motherfuckers
    private T[] helper;
    // two ints that represent the first position and last position
    // possibly the value of the positions
    private int first = 0;
    private int last;
    // size = last -1


    public ArrayDeque(){
        helper = (T []) new Object[8];
        //last is the last in the array that is not null
        last = 0;
        size = 0;
    }
    public double calRatio(){
        return (double) size / helper.length;
    }
    public void addFirst(T item){
        if (calRatio() > 0.7) {
            T[] newArray = (T[]) new Object[size * 3 / 2];
            newArray[0] = item;
            System.arraycopy(helper, 0, newArray, 1, helper.length);
            helper = newArray;
            last += 1;
            size += 1;
        }
        else{
            T[] newArray = (T[]) new Object[helper.length *3/2];
            newArray[0] = item;
            System.arraycopy(helper, 0, newArray, 1, helper.length);
            last += 1;
            size += 1;
            helper = newArray;
        }
    }
    public void addLast(T item){
        if (calRatio() > 0.7) {
            T[] newArray = (T[]) new Object[helper.length*3/2];
            System.arraycopy(helper,0,newArray,0,helper.length);
            newArray[size] = item;
            helper = newArray;
        }else{
            helper[size] = item;
            size += 1;
        }
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        int len = helper.length;
        for(int i = 0; i < len; i++){
            System.out.print(helper[i] + " ");
        }
        System.out.println();
    }

    public T removeFirst(){
        T first = helper[0];
        if (this.isEmpty()) {
            return null;
        }
        else{
        T[] newArry = (T[]) new Object[size];
        System.arraycopy(helper,1,newArry,0,size);
        size -= 1;
        return first;
        }

    }

    public T removeLast(){
        T last = helper[size-1];
        if (size == 0) {
            return null;
        }
        else{
            helper[size-1] = null;
            return last;
        }
    }

    public T get(int index){
        if (size != 0) {
            return helper[index-1];
        }
        else{
            return null;
        }
    }
/*
    public Iterator<T> iterator(){

    }
**/
    public boolean equals(Object o){
      if (o instanceof ArrayDeque) {
          return true;
      }
      else{
          return false;
      }
    }
}
