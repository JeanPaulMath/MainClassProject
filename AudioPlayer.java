public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private String mediaType;

    public AudioPlayer(String prodName, String manufacture, String audiospecs) {
        super(prodName);
        super.getManufacturer();
        audioSpecification = audiospecs;

    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void next() {

    }
}
