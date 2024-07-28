package AdapterPattern;
import AdapterPattern.MediaPlayer;
import AdapterPattern.AudioPlayer;
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "song.mp3");
        audioPlayer.play("WAV", "song.wav");
    }
}