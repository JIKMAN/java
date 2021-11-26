import java.util.ArrayList;

public class Album {
    public final String name;
    public final int year;
    public final Artist artist;

    private final ArrayList<Song> tracks = new ArrayList<>();

    public Album(String name, int year, Artist artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack(Song track) {
        tracks.add(track);
    }

    public Song getTrack(int num) {
        if (num < 1 || num > tracks.size()) {
            return null;
        }
        return tracks.get(num - 1);
    }
}
