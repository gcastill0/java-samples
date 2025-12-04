public class Animal {

    // Attributes
    private String species;        // e.g., "Canis lupus", "Panthera leo"
    private String habitat;        // e.g., "forest", "desert", "ocean"
    private String name;           // e.g., "lion", "eagle", "bear"
    private String locomotionType; // e.g., "walk", "fly", "swim", "slither"
    private String dietType;       // e.g., "herbivore", "omnivore", "carnivore"

    // Constructor
    public Animal(
        String species, 
        String habitat, 
        String name,
        String locomotionType, 
        String dietType) {
        
        this.species = species;
        this.habitat = habitat;
        this.name = name;
        this.locomotionType = locomotionType;
        this.dietType = dietType;
    }

    // Getters
    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getName() {
        return name;
    }

    public String getLocomotionType() {
        return locomotionType;
    }

    public String getDietType() {
        return dietType;
    }

    // Setters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocomotionType(String locomotionType) {
        this.locomotionType = locomotionType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    // Actions
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void move() {
        System.out.println(name + " is moving by " + locomotionType + "ing.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    public void explore() {
        System.out.println(name + " is exploring the " + habitat + ".");
    }  
}
