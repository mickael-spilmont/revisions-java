package test;

import singleton.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton premiereInstance = Singleton.getInstance();
        premiereInstance.setNombre(50);
        System.out.println("Premiere Instance = " + premiereInstance.getNombre());

        Singleton secondeInstance =  Singleton.getInstance();
        secondeInstance.setNombre(10);

        System.out.println("Première instance = " + premiereInstance.getNombre() +
                "\nSeconde instance = " + secondeInstance.getNombre());
    }
}
