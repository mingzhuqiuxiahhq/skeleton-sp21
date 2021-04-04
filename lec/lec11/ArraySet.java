import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
//import java.util.Iterator;


public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;


    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }
    /* Returns true if this map contains a mapping for the specified key.
     */



    public boolean contains(T x) {
        // ArraySet<T> y = items;
        for (int i = 0; i < size; i++) {
            if (items[i].equals(x)) {
                return true;
            }
        }
        return false;
    }
    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x != null) {
            if (contains(x)) {
                return;
            }
            items[size] = x;
            size += 1;
        }
        else{
            System.out.println("can't add null");
        }
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }


    public Iterator<T> iterator(){
        return new arraySetIterator();
    }


    private class arraySetIterator implements Iterator<T> {
        private int pos;

        public arraySetIterator(){
            pos = 0;
        }
        public boolean hasNext(){
            return pos < size;
        }

        public T next(){
            T returnItem = items[pos];
            pos += 1;
            return returnItem;
        }
    }
    /*
    public String toString(){
        StringBuilder returnString = new StringBuilder("{");
        for (int i =0; i< size-1; i++) {
            returnString.append(this.items[i].toString());
            returnString.append(", ");
        }
        returnString.append(items[size -1]);
        returnString.append("}");
        return returnString.toString();
    }

     */
    @Override
    public String toString(){
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < this.size()-1; i++) {
            returnList.add(this.items[i].toString());
        }
        return "{" + String.join(" ,", returnList) + "}";
    }
    
    @Override
    public boolean equals(Object other){
        ArraySet<T> o = (ArraySet<T>) other;
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        if (o.size() != this.size()) {
            return false;
        }
        for (int i = 0; i < size - 1; i++) {
            if (!o.contains(items[i])) {
                return false;
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());
        System.out.println(s.toString());

        //Iterator<String> aseer = s.iterator();
/*
        for (String y : s) {
            System.out.println(y);
        }
**/
        /*
        Set<Integer> javaSet = new HashSet<>();

        javaSet.add(5);
        javaSet.add(10);
        javaSet.add(15);

        Iterator<Integer> iter = javaSet.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        for (int x : javaSet) {
            System.out.println(x);
        }

         */


    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */

}
