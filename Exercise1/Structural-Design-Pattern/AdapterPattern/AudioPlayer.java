package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    private LegacyMediaAdapter legacyAdapter;

    public AudioPlayer() {
        legacyAdapter = new LegacyMediaAdapter();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file directly: " + fileName);
        } else {
            legacyAdapter.play(audioType, fileName);
        }
    }
}