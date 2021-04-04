public class Pokemon {
    public String name;
    public int level;
    public static String trainer = "Ash";
    public static int partySize = 0;

    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
        this.partySize += 1;
    }

    public static void main(String[] args) {
        Pokemon p = new Pokemon("Pikachu", 17);
        Pokemon j = new Pokemon("Jolteon", 99);
        //party size 2
        System.out.println("Party size: " + Pokemon.partySize);
        //Pikachu 17 Ash
        p.printStats();

        int level = 18;
        Pokemon.change(p, level);
        //Pikachu --> Voltorb 1, ash --> team rocket
        p.printStats();
        // Voltorb 1 Team Rocket
        System.out.println(Pokemon.trainer);
        Pokemon.trainer = "Ash";
        //Ash  --> Ash
        j.trainer = "Brock";
        //pikachu 18 Ash
        p.printStats();
        //class can't call instance method
        //Pokemon.printStats();
    }

    public static void change(Pokemon poke, int level) {
        //instance variable
        poke.level = level;
        //local variable in method,
        level = 50;
        poke = new Pokemon("Voltorb", 1);
        poke.trainer = "Team Rocket";
    }
     public void printStats() {
        System.out.println(name + " " + level + " " + trainer);
    }
}
