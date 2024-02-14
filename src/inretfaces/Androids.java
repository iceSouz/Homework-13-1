package inretfaces;

public class Androids implements Smartphones {
    @Override
    public void call() {
        System.out.println("Performs a call on the Android device.");
    }

    @Override
    public void sms() {
        System.out.println("Sends a message from the Android device.");
    }

    @Override
    public void internet() {
        System.out.println("Establishes an internet connection from the Android device.");
    }

    @Override
    public void loadSystem() {
        System.out.println("Boots up the LinuxOS.");
    }
}
