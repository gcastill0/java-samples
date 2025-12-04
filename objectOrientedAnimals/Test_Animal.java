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


        // Updated output
        System.out.println("\nUpdate lion habitat to \"grasslands\"");

        // Change an attribute of the first animal
        lion.setHabitat("grasslands");

        // Updated output
        System.out.println("\nAfter updating lion habitat:");
        testGetters(lion);
    }

    public static void testGetters(Animal animal) {
        System.out.println();
        System.out.println("This animal is a " + animal.getName());
        System.out.println("This animal belongs to the species: " + animal.getSpecies() + ".");
        System.out.println("This animal lives in the habitat: " + animal.getHabitat() + ".");
        System.out.println("This animal moves by: " + animal.getLocomotionType() + ".");
        System.out.println("This animal has a diet type of: " + animal.getDietType() + ".");
    }

}
