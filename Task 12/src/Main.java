// Реализуйте структуру музыкальной библиотеки по паттерну "Компоновщик", позволяющую группировать музыкальные треки в альбомы и плейлисты.

public class Main {
    public static void main(String[] args) {
        MusicComponent track1 = new Track("Клава Кока");
        MusicComponent track2 = new Track("PHARAOH");
        MusicComponent track3 = new Track("Билан");

        Album album = new Album("Альбом 1");
        album.addTrack(track1);
        album.addTrack(track2);

        Playlist playlist = new Playlist("Плейлист 1");
        playlist.addComponent(album);
        playlist.addComponent(track3);

        playlist.play();
    }
}