public class Dog{
  public String name;
  public int size;

  public Dog(String n, int s){
    this.name = n;
    this.size = s;
  }

  public void bark(){
    System.out.print(this.name);
    System.out.println(" bark");

  }

  public void barkMany(int x){
    for (int i = 0; i < x; i++) {
      bark();
    }
  }

  /*
  public void bark(int x){
    bark(1);
  }

  public void barkMany(int x){
    for (int i = 0; i < x ; i++) {
      System.out.print("bark ");
    }
  }
  */

  public static void main(String[] args) {
    /*
    Dog[] dogs = {new Dog("Gd", 25), new Dog("woof", 26), new Dog("aowu", 27) };
    Dog bigDog = (Dog) Maximizer.max(dogs);
    bigDog.bark();
    */
    Dog a = new Dog("Cat", 25);
    a.bark();
  }

}
