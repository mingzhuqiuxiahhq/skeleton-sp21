public class VerboseDog extends Dog{

  @Override
  public void barkMany(int n){
    System.out.println("As a dog, I say: ");
    for (int i = 0; i < n; i++) {
      bark();
    }
  }

  public static void main(String[] args) {
    VerboseDog d = new VerboseDog;
    d.barkMany(3);
  }

}
