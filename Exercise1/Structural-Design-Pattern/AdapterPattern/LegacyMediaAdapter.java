package AdapterPattern;

public class LegacyMediaAdapter implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}