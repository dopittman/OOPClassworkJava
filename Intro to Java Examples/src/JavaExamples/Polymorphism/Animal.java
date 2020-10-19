package JavaExamples.Polymorphism;

 class Animal {
    public void animalNoise(){
        System.out.println("This animal makes a noise.");
    }

    public void legCount(){
        System.out.println("The number of legs I have.");
    }
}

  class Dog extends Animal {
    public void animalNoise(){
        System.out.println("Bark! Bark!");
    }

    public void legCount(){
        System.out.println("I have 4 legs.");
    }

}

  //
 class Cat extends Animal {
     public void animalNoise(){
         System.out.println("Meow!");
     }

     public void legCount(){
         System.out.println("I have 4 legs.");
     }

 }

 class Kangaroo extends Animal {
     public void animalNoise(){
         System.out.println("What noise does a Kangaroo make?");
     }

     public void legCount(){
         System.out.println("I have 2 legs.");
     }
 }

  class mainClass {
     public static void main(String[] args) {
         Animal firstAnimal = new Animal();
         Dog myDogBuster = new Dog();
         Kangaroo randomKangaroo = new Kangaroo();

         firstAnimal.animalNoise();
         myDogBuster.animalNoise();
         randomKangaroo.animalNoise();

         myDogBuster.legCount();
         randomKangaroo.legCount();
     }
  }