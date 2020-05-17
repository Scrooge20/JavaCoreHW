package L2interface2;

public class Robot implements Jumpable, Runable{
    String name;
    int maxHeight;
    int maxDistance;
    boolean onDistance = true;


    public Robot(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight){
            System.out.println("Robot ID : " + name + " прыгнул на : " + maxHeight + " метров");
            onDistance = true;
        }else {
            System.out.println("Robot ID : " + name + " выбыл из прыжков.");
            onDistance = false;}
    }

    @Override
    public void run(int distance) {
        if (distance <= maxDistance){
            System.out.println("Robot ID : " + name + " может пробежать : " + maxDistance + " метров");
            onDistance = true;
        }else {
            System.out.println("Robot ID : " + name + " выбыл из забега.");
            onDistance = false;}

    }
    public boolean isOnDistance() {
        return onDistance;
    }

}
