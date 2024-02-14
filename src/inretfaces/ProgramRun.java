package inretfaces;

public class ProgramRun {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.loadSystem();
        android.call();
        android.sms();
        android.internet();

        System.out.println("=======================================================");

        IPhones iPhone = new IPhones();
        iPhone.loadSystem();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();

        System.out.println("=======================================================");

        Smartphones smartAndroid = new Androids();
        smartAndroid.loadSystem();
        smartAndroid.call();
        smartAndroid.sms();
        smartAndroid.internet();

        System.out.println("=======================================================");

        Smartphones smartIPhone = new IPhones();
        smartIPhone.loadSystem();
        smartIPhone.call();
        smartIPhone.sms();
        smartIPhone.internet();

        System.out.println("=======================================================");

        OperationSystems operationAndroid = new Androids();
        operationAndroid.loadSystem();

        System.out.println("=======================================================");

        OperationSystems operationIPhone = new IPhones();
        operationIPhone.loadSystem();
    }
}
