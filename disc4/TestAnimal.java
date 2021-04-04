public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield",6 );
        Dog d = new Dog("Fido", 4);
        a.greet(); // animal pluto says huh?
        c.greet(); // Cat Garfield says meow
        d.greet(); // Dog Fido says woof
        c.play(); // Woo it is so much fun being an animal!
        c.play(":)"); // Woo it is so much fun being a cat
        a = c;
        ((Cat) a).greet(); // Cat Pluto says meow
        ((Cat) a).play(":D"); // Woo it is so much fun being a cat! :D
        a.play(); // Woo it is so much fun being an animal!
        ((Dog) a).play(); // compile time - no method without para in dog.play
        a.greet(); // Woo it is so much fun being an animal!
        c = (Cat)a; // ______________________

    }
}
