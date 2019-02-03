package factory;

public class CafetiereExpresso implements Product {

    @Override
    public void allumer() {
        System.out.println("Power On !");
    }

    public void faireDuCafe() {
        System.out.println("Une tasse d'expresso");
    }
}
