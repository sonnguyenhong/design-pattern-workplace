package media_player;

public class MP4 implements MediaPackage {
    @Override
    public void playFile() {
        System.out.println("Playing MP4 in Media Package Interface");
    }
}
