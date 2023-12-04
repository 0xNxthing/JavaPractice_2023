public class Track implements MusicComponent{
    private String title;

    public Track(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Трек: " + title);
    }
}
