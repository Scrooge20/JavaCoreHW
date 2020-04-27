package Lesson6;

public class Animals {
    String name = "Unknown";
    int run = 1000;
    int jump = 1;
    int swim = 20;
//    int iD = 0;

//    public Animals(String name, int run, int jump, int swim) {
//        this.name = name;
//        this.run = run;
//        this.jump = jump;
//        this.swim = swim;
//        this.iD = iD + 1;
//    }

    public void run(){
        System.out.println("Животное по имени " + name + " бегает " + run + " meters");
    }
    public void jump(){
        System.out.println("Животное по имени " + name + " прыгает " + jump + " meters");
    }
    public void swim(){
        System.out.println("Животное по имени "+ name + " плавает " + swim + " meters");
    }

    public void info(){
        System.out.println("Наше животное " + name + " умеет : ");
        run();
        jump();
        swim();
    }
}
