package inretfaces;

public class IPhones implements Smartphones {
    @Override
    public void call() {
        System.out.println("Performs a call on the iPhone device.");
    }

    @Override
    public void sms() {
        System.out.println("Sends a message from the iPhone device.");
    }

    @Override
    public void internet() {
        System.out.println("Establishes an internet connection from the iPhone device.");
    }

    @Override
    public void loadSystem() {
        System.out.println("Boots up the iOS.");
    }
}
