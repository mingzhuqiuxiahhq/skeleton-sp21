public class Maximizer <Object> {
    public static Object max(Object[] a) {
        int MaxNum = 0;
        for(int i = 0; i < a.length; i+= 1){
            if(a[i] > a[MaxNum]) {
                MaxNum = i;
            }
        }
        return a[MaxNum];
    }


}
