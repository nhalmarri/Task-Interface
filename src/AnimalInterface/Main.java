package AnimalInterface;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println( "What does the Dog Do ?");
        dog.eat();
        dog.sleep();
        dog.makeSound();

        System.out.println( "\nWhat does the Cat Do ?");
        cat.eat();
        cat.sleep();
        cat.makeSound();




    }
}