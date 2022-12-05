package BeginOOP.StartOOP.overload_override;

class Animal {
    public void move() {
        System.out.println("Animal can move");
    }
    public Animal get(){
        return new Animal(); //we can return new object this class
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can run very fast");
    }
    @Override
    public Dog get(){
        //we can Override parent Method and return new object
        //from current class not parent
        return new Dog();
    }
}
class Tiger extends Animal {
    public void move() {
        System.out.println("Tigers are very strong animals and dangerous");
    }
    @Override
    public Tiger get(){
        return new Tiger();
    }
}

class Cat extends Animal {

    public void move() {
        //super means we use original method from parent class Animal
        //in overrides child's method
        super.move();
        System.out.println("Cats can run very fast and climb trees");
    }
}

public class TestOverride {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.move();
        dog.move();
        cat.move();
    }

}
