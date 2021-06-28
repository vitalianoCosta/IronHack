package class4;

public class AndroidPlayer implements Playable, VideoPlayer {
    private final int MAX_VOLUME = 100;
    private double volume;

    public AndroidPlayer(double volume){
        this.volume = volume;
    }
    public void play(){
        System.out.println("Playing on Android");
    }
    public void pause(){
        System.out.println("Pausing on Android");
    }
    public void mute(){
        System.out.println("Muting on Android");
    }
    public void increaseVolume(double volume){
        this.volume = this.volume + volume > MAX_VOLUME ? MAX_VOLUME : this.volume + volume;
        System.out.println("Current Volume: " + this.volume);
    }
    public double getVolume(){
        return volume;
    }

    public void changeContrast(int x) {
        System.out.println("Contrast changes by :" +x);
    }

    public void changeBrightness(int y) {
        System.out.println("Brightness changed by: " +y);
    }
}
