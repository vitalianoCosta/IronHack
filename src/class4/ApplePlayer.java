package class4;

public class ApplePlayer implements Playable, VideoPlayer {
    private double volume;
    public void play() {

    }

    public void pause() {

    }

    @Override
    public void mute() {

    }

    @Override
    public void increaseVolume(double volume) {

    }
    public double getVolume(){
        return volume;
    }

    @Override
    public void changeContrast(int x) {
        System.out.println("contraste changed by: " +x);
    }

    public void changeBrightness(int y) {
        System.out.println("Brightness changed by: " +y);
    }
}
