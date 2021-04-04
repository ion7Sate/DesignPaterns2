package Adapter;

public class AndroidToIPhoneAdapter  implements IPhone{

    private AndroidPhone androidPhone;

    public AndroidToIPhoneAdapter(AndroidPhone androidPhone) {
        this.androidPhone = androidPhone;

    }

    public void charge() {
        androidPhone.charge();
    }
}
