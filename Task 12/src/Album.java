import java.util.ArrayList;
import java.util.List;

public class Album implements MusicComponent{
    private String title;
    private List<MusicComponent> tracks;

    public Album(String title) {
        this.title = title;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(MusicComponent track) {
        tracks.add(track);
    }

    @Override
    public void play() {
        System.out.println("Альбом: " + title);
        for (MusicComponent track : tracks) {
            track.play();
        }
    }
}
