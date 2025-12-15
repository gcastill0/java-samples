Animal animal1;
Animal animal2;

Dot dot1;
Dot dot2;

void setup(){
  size(800,800);
  animal1 = new Animal();
  animal2 = new Animal("dog");
  
  animal1.species = "cat";
  
  dot1 = new Dot();
  dot2 = new Dot();
}

void draw() {
  background(0);
  dot1.render();
  dot1.moveX();
  
  dot2.render();
  
  println(animal1.getSpecies());
  println(animal2.getSpecies());
}

class Dot {
  int x;
  int y;
  
  public Dot() {
    this.x = width/2;
    this.y = height/2;
  }
  
  public void moveX() {
    if (this.x < width) {
      this.x = this.x + 5;
    }
  }
  
  public void render() {
    ellipse(this.x, this.y, 25, 25);
  }
}

class Animal {
  String blood_type;
  int number_of_legs;
  String food_type;
  boolean fur;
  private String species;
  Hair hair;
  
  public Animal() {
    this.blood_type = null;
    this.number_of_legs = 0;
    this.food_type = null;
    this.fur = false;
    this.species = null;
    this.hair = new Hair();
  }
  
  public Animal(String species) {
    this.blood_type = null;
    this.number_of_legs = 0;
    this.food_type = null;
    this.fur = false;
    this.species = species;
    this.hair = new Hair();
  }
  
  public String getSpecies() {
    return this.species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

}

class Hair {
  String colour;
  
  public Hair() {
    this.colour = "Orange";
  }
 
}
