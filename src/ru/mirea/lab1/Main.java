package ru.mirea.lab1;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tom", 3);
        Dog d2 = new Dog("Puppy");
        Dog d3 = new Dog(6);

        d2.setAge(4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();

        System.out.println("\n");

        Book b1 = new Book("John Smith", 33);
        Book b2 = new Book("Doe");

        b2.setCost(45);

        System.out.println(b1);
        System.out.println(b2);


        System.out.println("\n");


        Ball ball1 = new Ball("Addl", 33);
        Ball ball2 = new Ball();

        ball2.setMark("QQ");
        ball2.setCost(99);

        System.out.println(ball1);
        System.out.println(ball2);

    }
}
