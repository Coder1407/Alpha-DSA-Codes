public class XIII_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.breathe();
    }
}
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
