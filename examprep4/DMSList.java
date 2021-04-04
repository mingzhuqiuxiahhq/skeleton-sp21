public class DMSList {
    private IntNode sentinel;
    public DMSList() {
           sentinel = new IntNode(-1000, new LastIntNode());
            }
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h) {
             item = i;
             next = h;
               }
        public int max() {
             return Math.max(item, next.max());
             }
    }
    public class LastIntNode extends IntNode {

        public LastIntNode(){
            super(0, null);
        }
        @Override
        public int max(){
            return 0;
        }
        /*
        public int max() {
            if (this.next == null) {
                return 0;
            } else {
                int maxNum = 0;
                IntNode p = this.next;
                while(p.next != null) {
                    if (maxNum < p.item) {
                        maxNum = p.item;
                        p = p.next;
                    }
                }
                return maxNum;
            }
        }

         */
    }
 /* Returns 0 if list is empty. Otherwise, returns the max element. */

    public int max() {
         return sentinel.next.max();
    }
    public void insertFront(int x) {
         sentinel.next = new IntNode(x, sentinel.next);
    }
 }


 /*

 A y = new B
 A Z = new B



  */