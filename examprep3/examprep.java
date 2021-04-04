public class examprep{

  public static void main(String[] args) {

    int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
    int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[][] S = {
    { 0, 0, 0, 0, 0},
    { 0, 0, 0, 0, 0},
    { 0, 0, 0, 0, 0},
    { 0, 0, 0, 0, 0},
    { 0, 0, 0, 0, 0}
    };

  }
  public static void fillGrod(int[] LL, int[] UR, int[][] S){
      int N = S.length;
      int kl, kr;
      kl = kr = 0;
      // S[row][column]
    for (int i = 0; i < N; i++ ) {

        //i = row and j = column
        for (int j = 0; j < N; j++ ) {
            // 0 are placed on rows and column where row and column position index are same
            if (i == j) {
                S[i][j] = 0;
            }
            // place LL to S,
            if (j < i) {
                S[i][j] = LL[kl];
                kl += 1;
            }
            if (j > i) {
                S[i][j] = UR[kr];
                kr +=1 ;
            }

        }

    }

  }

}
