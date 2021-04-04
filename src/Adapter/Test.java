package Adapter;

public class Test {
    public static void main(String[] args) {

        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new SamsungS10();
        androidCharger.charge(androidPhone);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);

    }
}
