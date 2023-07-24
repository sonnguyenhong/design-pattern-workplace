package media_player;

public class FormatAdapter implements MediaPlayer {
    MediaPackage mediaPackage;
    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }
    @Override
    public void play() {
        this.mediaPackage.playFile();
    }
}
