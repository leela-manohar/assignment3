class Animal {
 void makeSound() {
     System.out.println("Some generic sound");
 }
}


class Dog extends Animal {
 
 @Override
 void makeSound() {
     System.out.println("Woof");
 }

 
 void makeSound(String action) {
     System.out.println("Dog is " + action);
 }
}


class Cat extends Animal {
 
 @Override
 void makeSound() {
     System.out.println("Meow");
 }
}

public class Question3 {
 public static void main(String[] args) {
     Animal animal1 = new Animal();
     animal1.makeSound(); 

     Dog dog = new Dog();
     dog.makeSound(); 
     dog.makeSound("barking"); 
     Cat cat = new Cat();
     cat.makeSound(); 
}
}
