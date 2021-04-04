package Decorator;

public class AndroidPhone extends SmartPhone{
    public AndroidPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return "Android OS v11.0";
    }
}
