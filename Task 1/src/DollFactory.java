public class DollFactory implements ToyFactory{
    @Override
    public Toy createToy() {
        return new Doll();
    }
}
