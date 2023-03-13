import java.util.ArrayList;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }
}

class Playlist {
    private ArrayList<Song> songs;
    private String name;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}

class MusicPlayer {
    private ArrayList<Playlist> playlists;

    public MusicPlayer() {
        playlists = new ArrayList<Playlist>();
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Playlist playlist1 = new Playlist("Reggeton");
        Playlist playlist2 = new Playlist("Phonk");
        Song song1 = new Song("LOKERA", "Rauw Alejandro,Lyanno,Brray", 317);
        Song song2 = new Song("Ley Seca", "Jhayco,Anuel AA", 423);
        Song song3 = new Song("METAMORPHOSIS", "INTERWORLD", 223);
        Song song4 = new Song("AFTERLIFE", "CYREX", 317);
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist2.addSong(song3);
        playlist2.addSong(song4);
        musicPlayer.addPlaylist(playlist1);
        musicPlayer.addPlaylist(playlist2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido/a a spotifer!");
            System.out.println("Aqui estan nuestras mejores playlist:");
            System.out.println("1. Playlist de reggeton");
            System.out.println("2. Playlist de Phonk");
            System.out.println("3. Salir");
            System.out.print("Escoge un opcion porfavor: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                printPlaylist(playlist1);
            } else if (choice == 2) {
                printPlaylist(playlist2);
            } else if (choice == 3) {
                System.out.println("Saliendo de spotifer... Que tengas un fabuloso dia!");
                break;
            } else {
                System.out.println("Oppcion Invalida, Porfavor intentelo de nuevo");
            }
        }
        scanner.close();
    }

    public static void printPlaylist(Playlist playlist) {
        System.out.println("Playlist: " + playlist.getName());
        for (Song song : playlist.getSongs()) {
            System.out.println("Titulo: " + song.getTitle());
            System.out.println("Artista: " + song.getArtist());
            System.out.println("Duración: " + song.getDuration() + " Segundos");
            System.out.println();
        }
    }
}
