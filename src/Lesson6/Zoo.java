package Lesson6;

public class Zoo {
    public static void main(String [] args){
        System.out.println("Hi");

        Animals animal1 = new Animals();
        System.out.println(animal1.name);
        animal1.info();

//        Cats cat1 = new Cats("catNoName", 55,2, 0);
        Cats cat1 = new Cats();
        cat1.name = "Barsik";
        cat1.swim = 5;//наш уникальный объект cat1 плавает 5 метров. Задание 6.
        //System.out.println(cat1.name);
        cat1.swim();
        cat1.run();
        cat1.info();//метод неперегружен, а вызываемые им методы перегружены и выводят правильные данные

        Cats cat2 = new Cats();// создаем объект имеющий общее name и общие х-ки Cats
        cat2.swim();// наши ВСЕ созданные объекты Cats плавают 0 метров

        Dogs dog1 = new Dogs();
        System.out.println(dog1.run(200));// Задание 6- выводим true/false в зависимости от величины переменной
        dog1.run();
//        System.out.println(animal1.iD);
    }
}
