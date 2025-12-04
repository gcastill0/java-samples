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

        System.out.print("\nThe " + animal.getName() + " began the day by making a sound, expressing its presence in the " + animal.getHabitat() + ". Listen, the ");
        animal.makeSound();

        System.out.print("\nThe " + animal.getName() + " then moved through the area. Watch, the ");
        animal.move();

        System.out.print("\nAfter exploring the surroundings, the " + animal.getName() + " decided to look around more carefully. Watch out! The ");
        animal.explore();

        System.out.print("\nFeeling hungry, the " + animal.getName() + " stopped to eat. Be Careful! The ");
        animal.eat();

        System.out.print("\nOnce the activities were finished, the " + animal.getName() + " settled down to sleep. Let's be quiet. The ");
        animal.sleep();
    }

}
