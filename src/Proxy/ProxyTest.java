package Proxy;

public class ProxyTest {
    public static void main(String[] args) {
            Proxy myProxy = new Proxy();

            myProxy.authenticate("wrongUsername", "wrongPassword");
            System.out.println("Current Balance : " + myProxy.getAccBalance(100));
            System.out.println("Updating Balance by 100 ");

             myProxy.updateAccBalance(100, 0);

            System.out.println("Current Balance : " + myProxy.getAccBalance(100));
            System.out.println();

            myProxy.authenticate("ionSaptesate", "qwert1");
            System.out.println("Current Balance : " + myProxy.getAccBalance(100));
            System.out.println("Updating Balance by 100 ");
            myProxy.updateAccBalance(100, 100);
            System.out.println("New Balance : " + myProxy.getAccBalance(100));
            System.out.println();
    }
}
