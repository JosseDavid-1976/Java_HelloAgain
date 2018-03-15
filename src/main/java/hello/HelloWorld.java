package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("L'heure courante est: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println("<--------------->");
        Bonjour animal1, animal2;
        animal1 = new Human();
        animal2 = new Dog();
        System.out.println(animal1.sayHello());
        System.out.println(animal1.sayGoodBye());
        System.out.println("<--------------->");
        System.out.println(animal2.sayHello());
        System.out.println(animal2.sayGoodBye());
    }
}
