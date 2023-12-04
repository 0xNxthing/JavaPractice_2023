// Напишите программу для управления разными видами игрушек (мячи, куклы, конструкторы) с использованием фабричного метода.

public class Main {
    public static void main(String[] args) {
        ToyFactory ballFactory = new BallFactory();
        Toy ball = ballFactory.createToy();
        ball.play();

        ToyFactory dollFactory = new DollFactory();
        Toy doll = dollFactory.createToy();
        doll.play();

        ToyFactory buildingBlocksFactory = new ConstructorFactory();
        Toy buildingBlocks = buildingBlocksFactory.createToy();
        buildingBlocks.play();
    }
}