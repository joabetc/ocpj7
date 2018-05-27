import java.util.*;

abstract class Animal {
  public abstract void checkup();
}

class Dog extends Animal {
  public void checkup() {
    System.out.println("Dog checkup");
  }
}

class Cat extends Animal {
  public void checkup() {
    System.out.println("Cat checkup");
  }
}

class Bird extends Animal {
  public void checkup() {
    System.out.println("Bird checkup");
  }
}

public class AnimalDoctor {
  public void checkAnimals(Animal[] animals) {
    for(Animal a : animals) {
      a.checkup();
    }
  }
  public static void main(String[] args) {
    Dog[] dogs = { new Dog(), new Dog() };
    Cat[] cats = { new Cat(), new Cat(), new Cat() };
    Bird[] birds = { new Bird() };

    AnimalDoctor doc = new AnimalDoctor();
    doc.checkAnimals(dogs);
    doc.checkAnimals(cats);
    doc.checkAnimals(birds);
  }
}
