package AnimalInterface;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }


}//end of class
