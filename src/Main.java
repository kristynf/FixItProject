import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 3;i++){
            String artist = "Prince";//modify program to prompt user for an artist
            String title = "Purple Rain"; //modify program to prompt user for a title
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}