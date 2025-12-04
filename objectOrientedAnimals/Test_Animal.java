public class Test_Animal {

    public static void main(String[] args) {

        // Create two Animal objects
        Animal lion = new Animal(
                "Panthera leo",
                "savannah",
                "lion",
                "walk",
                "carnivore");

        Animal eagle = new Animal(
                "Haliaeetus leucocephalus",
                "mountains",
                "eagle",
                "fly",
                "carnivore");

        // Initial output
        System.out.println("Initial values:");
        testGetters(lion);
        testGetters(eagle);

        // Change an attribute of the first animal
        lion.setHabitat("grasslands");

        // Updated output
        System.out.println("\nAfter updating lion habitat:");
        testGetters(lion);

        tellStory(lion);
    }

    public static void testGetters(Animal animal) {
        System.out.println();
        System.out.println("This animal is a " + animal.getName());
        System.out.println("This animal belongs to the species: " + animal.getSpecies() + ".");
        System.out.println("This animal lives in the habitat: " + animal.getHabitat() + ".");
        System.out.println("This animal moves by: " + animal.getLocomotionType() + ".");
        System.out.println("This animal has a diet type of: " + animal.getDietType() + ".");
    }

    public static void tellStory(Animal animal) {

        System.out.println();

        System.out.println("The " + animal.getName() + " began the day by making a sound, expressing its presence in the "
                + animal.getHabitat() + ".");

        System.out.print("Listen, the ");

        animal.makeSound();

        System.out.print("The " + animal.getName() + " then moved through the area by "
                + animal.getLocomotionType() + ".");
        
        System.out.print("Watch, the ");

        animal.move();

        System.out.println("After exploring the surroundings, the " + animal.getName() + " decided to look around more carefully.");

        System.out.print("Watch out! The ");

        animal.explore();

        System.out.println("Feeling hungry, the " + animal.getName() + " stopped to eat.");
        
        System.out.print("Be Careful! The ");

        animal.eat();

        System.out.println("Once the activities were finished, the " + animal.getName() + " settled down to sleep.");

        System.out.print("Let's be quiet. The ");

        animal.sleep();
    }

}
