public class ConstructorFactory implements ToyFactory{
    @Override
    public Toy createToy() {
        return new Constructor();
    }
}
