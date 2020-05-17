package L2interface2;

public class Wall {
    int height = 2;

    public void jumpWall(Jumpable j){
        j.jump(height);
    }
}
