public class IntList {

    //public int size;

    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        this.first = f;
        this.rest = r;
    }

    public static void evenOdd(IntList lst) {
        if (lst == null || lst.rest == null) {
            return;
            }
        IntList oddList = lst.rest;
        IntList second = lst.rest;
        while (lst.rest != null && oddList.rest != null) {
            lst.rest = lst.rest.rest;
            oddList.rest = oddList.rest.rest;
            lst = lst.rest;
            oddList = oddList.rest;
            }
        lst.rest = second;
        }

    public static void main(String[] args) {
        IntList a = new IntList(5, null);
        a = new IntList(2, a);
        a = new IntList(4, a);
        a = new IntList(1, a);
        a = new IntList(3, a);
        a = new IntList(0, a);
        IntList.evenOdd(a);
        IntList.partition(a,2);
    }

    public static IntList[] partition(IntList l, int k) {
        IntList[] array = new IntList[k];
        int index = 0;
        IntList lst = reverse(l);
        while (lst != null) {
            IntList tempArray = array[index];
            IntList tempList = lst.rest;
            array[index] = lst;
            array[index].rest = tempArray;
            tempArray = tempArray.rest;
            tempList = tempList.rest;

        }
        return array;


        /**
        // calculate l.size / k, i.e. 25/3 = 8.1, for k > 0,  8 + 1 = 9, 3-1 =2,
        int r;
        int d;
        int[] partition = new int[d];
        for (int i = 0; i < d ; i++) {
            partition[i] = r+d;
            r = 0;
        }  */
    }
}
