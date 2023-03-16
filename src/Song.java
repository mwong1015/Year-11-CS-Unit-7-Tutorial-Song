import java.util.ArrayList;
import java.util.Locale;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> viewers = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public int howMany(ArrayList<String> peopleList ){ //
        int uniqueListeners=0;
        for(int i=0; i< peopleList.size(); i++){
            if(!(viewers.contains(peopleList.get(i).toLowerCase()))){
                viewers.add(peopleList.get(i).toLowerCase());
                uniqueListeners++;
            }

        }
        return uniqueListeners;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

}
