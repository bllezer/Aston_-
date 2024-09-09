public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    void run(int range) {
        System.out.println("Animal have run " + range + " m");
    }

    void swim(int range) {
        System.out.println("Animal have swam " + range + " m");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
public class Cat extends Animal{
    String name;
    static int countCat = 0;

    Dog(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name+ " cannot to run more 200 m");
        } else {
            System.out.println(name + " have run " + range + " m");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Cat cannot to swim");
    }

    static int getCountCat(){
        return countCat;
    }

}
public class Dog extends Animal{
    String name;
    static int countDog = 0;

    Dog (String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name+ " cannot to run more 500 m");
        }else {
            System.out.println(name + " have run " + range + " m");
        }
    }
    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Dog cannot to swim more " +range+ " m");
        }else {
            System.out.println(name + " have swim " + range + " m");
        }
    }
    static int getCountDog(){
        return countDog;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Cat barsik = new Cat("Barsik");
        Dog tuzik = new Dog("Tuzik");
        Cat barsik1 = new Cat("Barsik");
        Dog tuzik1 = new Dog("Tuzik");
        barsik.run(150);
        barsik.run(201);

        tuzik.run(500);
        tuzik.run(501);
        System.out.println("Total animals: " +Animal.getCountAnimal());
        System.out.println("Total cats: "+Cat.getCountCat());
        System.out.println("Total dogs: "+Dog.getCountDog());

    }
}