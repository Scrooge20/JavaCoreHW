package Lesson6;

public class Dogs extends Animals{
    // инициализируем переменные характерные класса Dogs
    int run = 500;
    double jump = 0.5;
    int swim = 10;
    String name = "UnknownDog";

//    public Dogs(String name, int run, int jump, int swim) {
//        super(name, run, jump, swim);
//    }

    @Override
    public void run(){
        System.out.println("Собака по имени " + name + " пробежит сколько сможет = " + run + " метров");
    }

    /**
     * перегруженный метод, но не переопределенный
     * @param run
     * @return
     */
    public boolean run(int run){
        if (run<500) {
        //    System.out.println("Собака по имени " + name + " пробежит сколько приказали = " + run + " метров");
            return true;
        }else return false;
    }
    @Override
    public void jump(){
        System.out.println("Собака по имени " + name + " прыгает на = " + jump + " метров");
    }
    @Override
    public void swim(){
        System.out.println("Собака по имени " + name + " проплывет = " + swim + " метров");
    }

}
