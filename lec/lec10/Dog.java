
import java.util.Comparator;

public class Dog implements Comparable<Dog>{
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

    Dog[] dogs = {new Dog("Gd", 25), new Dog("woof", 26), new Dog("aowu", 27) };
    Dog bigDog = (Dog) Maximizer.max(dogs);
    bigDog.bark();


  }

  public Dog maxDog(Dog[] a){
      Dog largerDog = a[0];
      if (a.length == 0 || a == null) {
          return null;
      }

      for (Dog d : a) {
          if (d.size > largerDog.size) {
              largerDog = d;
          }
      }
      return largerDog;
  }

  @Override
  public int compareTo(Dog other){

      return this.size - other.size;
  }


  private static class NameCompare implements Comparator<Dog>{

      public int compare(Dog a, Dog b){
          return a.name.compareTo(b.name);
      }
  }
      public static Comparator<Dog> GetNameComparator(){
          return new NameCompare();
      }




}
