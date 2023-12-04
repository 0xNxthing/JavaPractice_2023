import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicComponent{
    private String title;
    private List<MusicComponent> components;

    public Playlist(String title) {
        this.title = title;
        this.components = new ArrayList<>();
    }

    public void addComponent(MusicComponent component) {
        components.add(component);
    }

    @Override
    public void play() {
        System.out.println("Плейлист: " + title);
        for (MusicComponent component : components) {
            component.play();
        }
    }
}
