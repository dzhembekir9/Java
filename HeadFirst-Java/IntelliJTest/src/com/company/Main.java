package com.company;


class Animal {

    void makeSound () {
        System.out.print("I am an animal");
    }

}

class Canine extends Animal {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println(" and also a canine.");
    }
}

class Herbivorous extends Animal {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println(" and also a herbivorous");
    }
}

class Wolf extends Canine {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println("Auuuuuu");
    }
}

class Tiger extends Canine {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println("Grrrrrrrr");
    }
}

class Dog extends Canine {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println("Woof Woof");
    }
}

class Cow extends Herbivorous {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println("Muuuuu");
    }
}

class Horse extends Herbivorous {

    @Override
    void makeSound () {
        super.makeSound();
        System.out.println("Iiiiiiii");
    }
}

class Vet {
    public void giveShot (Animal a) {

        a.makeSound();

    }
}


public class Main {

    public static void main (String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Wolf();
        animals[1] = new Tiger();
        animals[2] = new Dog();
        animals[3] = new Cow();
        animals[4] = new Horse();


//        int i = 0;
//
//        for (Object o : animals) {
//            animals[i].makeSound();
//            i++;
//        }

        Animal newAnimal = new Dog();
        newAnimal.makeSound();

        Vet v = new Vet();
        Animal c  = new Cow();

        v.giveShot(c);


    }

}
