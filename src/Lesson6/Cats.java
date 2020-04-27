package Lesson6;


public class Cats extends Animals{
    // инициализируем переменные характерные классу Cats
    int run = 200;
    int jump = 2;
    int swim = 0;
    String name = "UnknownCat";
//
//    public Cats(String name, int run, int jump, int swim) {
//        super(name, run, jump, swim);
//    }

    @Override
    public void run(){
        System.out.println("Cat " + name + " is Running - 200 meters = " + run);
    }
    @Override
    public void jump(){
        System.out.println("Cat " + name + " is Jumping - 2 meters" + jump);
    }
    @Override
    public void swim(){
        System.out.println("Cat " + name + " is Swimming - " + swim + " meters");
    }
}
