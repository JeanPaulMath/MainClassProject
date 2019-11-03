package sample;

public class Screen implements ScreenSpec{
    private String resolution;
    private int refreshRate;
    private int responseTime;


    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    @Override
    public String toString() {
        return "Screen: " + "resolution: " + resolution + '\'' + "refreshRate: " + refreshRate + " responseTime:" + responseTime ;
    }

    public static void main(String[] args) {
        Screen stest = new Screen();

    }
}
