public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void notify(Estate estate) {
        System.out.println(name + ", новое предложение по недвижимости!\nАдрес: " +
                estate.getAddress() + "\nЦена: " + estate.getPrice() + "\n");
    }
}
