package L2interface2;

public class I2test {
    public static void main(String[] args) {
        Robot r1 = new Robot("R2D2",20, 10000);
        Wall w1 = new Wall();
        Cross cr1 = new Cross();
        /*
        вызываем метод jump у объекта класса Wall,
        куда передаем в качестве аргумента объект класса Robot,
        так как он реализует метод jump от интерфейса Jumpable.
        */
        w1.jumpWall(r1);//

        // ===============================
        // так как спортсмены не имеют общего суперкласса делаем так отдельно
        Robot [] r = {
                new Robot("Robot1", 5, 10000),
                new Robot("Robot2", 1, 200),
                new Robot("Robot3", 3, 1000),
                };
        /*
        цикл проверки прохождения препятствий
         */
        for (Robot rbt : r) {
            w1.jumpWall(rbt);
//            if(rbt.onDistance = false){continue;} такая конструкция не работает :( хотя вроде всё верно
            if(!rbt.isOnDistance()){
                continue;
            }
            cr1.runDistance(rbt);
        }
// дальше то же самое для классов кот и человек.....
    }
}
