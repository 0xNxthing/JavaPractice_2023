public class BallFactory implements ToyFactory{
    @Override
    public Toy createToy() {
        return new Ball();
    }
}
