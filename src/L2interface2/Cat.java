package L2interface2;

public class Cat implements Jumpable {
    String name;
    int maxHeight;
    int maxDistance;
    boolean onDistance = true;

    public Cat(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }


    @Override
    public void jump(int height) {
        if (height <= maxHeight){
            System.out.println("Кот по имени : " + name + " прыгнул на : " + maxHeight + " метров");
            onDistance = true;
        }else {
            System.out.println("Кот по имени : " + name + " выбыл.");
            onDistance = false;}
    }
}
