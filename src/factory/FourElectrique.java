package factory;

public class FourElectrique implements Product {
    @Override
    public void allumer() {
        System.out.println("Power On !");
    }

    public void faireCuire() {
        System.out.println("C'est chaud !");
    }
}
