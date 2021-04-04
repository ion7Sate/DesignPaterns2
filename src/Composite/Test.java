package Composite;

public class Test {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Ion", 1, 1000l);
        Employee developer2 = new Developer("Sandu", 2, 2000L);
        Employee developer3 = new Developer("Vasile", 3, 2030L);
        Employee developer4 = new Developer("Alina", 6, 2890L);
        Employee developer5 = new Developer("Mihai", 7, 1110L);

        Employee lead1 = new Lead("Ina", 4, 2070L);
        Employee lead2 = new Lead("Christina", 5, 2900L);

        Employee manager = new Manager("Roxi", 8, 50000L);



        lead1.add(developer1);
        lead1.add(developer2);
        lead1.add(developer3);

        System.out.println(lead1.toString());
        lead2.add(developer4);

        System.out.println(lead2.toString());

        manager.add(lead1);
        manager.add(lead2);
        manager.add(developer5);


        System.out.println(manager.toString());
        }
    }

