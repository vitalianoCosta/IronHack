package class4;

public class Main {
    public static void main(String[] args) {
        AndroidPlayer Player = new AndroidPlayer(20);
        Player.play();
        Player.pause();
        Player.mute();
        System.out.println("Volume: " + Player.getVolume());
        Player.increaseVolume(10);
        ApplePlayer AL = new ApplePlayer();
        Player.changeBrightness( 30);

        Player.changeContrast(20);
        AL.play();
        AL.pause();
        AL.mute();
        System.out.println("Volume: " + AL.getVolume());
        AL.increaseVolume(20);
    }
}
