package media_player;

public class AdapterTestDrive {
    public static void main(String[] args) {
        System.out.println("MP3 using Media Player Interface");
        MediaPlayer mediaPlayer = new MP3();
        playingMusic(mediaPlayer);

        System.out.println("VLC using Media Package Interface");
        MediaPackage vlc = new VLC();
        MediaPlayer vlc_player = new FormatAdapter(vlc);
        playingMusic(vlc_player);

        System.out.println("VLC using Media Package Interface");
        MediaPackage mp4 = new MP4();
        MediaPlayer mp4_player = new FormatAdapter(mp4);
        playingMusic(mp4_player);
    }
    private static void playingMusic(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
    }
}
