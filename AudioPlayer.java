package sample;

public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private String mediaType;

    public AudioPlayer(String prodName, String manufacture, String audioSpecs) {
        super(prodName);
        super.setManufacturer(manufacture);
        audioSpecification = audioSpecs;

    }

    @Override
     public String toString() {
        return "audioSpecification:'" + audioSpecification + '\'' + " mediaType:'" + mediaType;
    }

    @Override
    public void play() {
        System.out.println("Audio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Audio has been stopped.");
    }

    @Override
    public void previous() {
        System.out.println("Previous track is being played.");
    }

    @Override
    public void next() {
        System.out.println("Playing next track.");
    }

    /**
     * This driver class is used to test if occurrences of
     * "AudioPlayer" can be instantiated with the use of the
     * MultiMedia methods.
     */
    public static void main(String[] args) {
        AudioPlayer test = new AudioPlayer("iPod","Apple","mp3");
        test.play();
        test.previous();
        test.stop();
        test.next();
    }
}
