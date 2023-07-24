package media_player;

public class VLC implements MediaPackage {
    @Override
    public void playFile() {
        System.out.println("Playing VLC in Media Package Interface");
    }
}
