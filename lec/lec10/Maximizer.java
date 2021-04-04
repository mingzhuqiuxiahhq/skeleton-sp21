public class Maximizer {

    public static Comparable max(Comparable[] items) {
        int MaxNum = 0;
        for(int i = 0; i < items.length; i++){
            int compValue = items[i].compareTo(items[MaxNum]);
            if(compValue > 0) {
                MaxNum = i;
            }
        }
        return items[MaxNum];


    }


}
