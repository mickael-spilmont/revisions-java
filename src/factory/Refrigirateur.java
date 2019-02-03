package factory;

public class Refrigirateur implements Product{
    @Override
    public void allumer() {
        System.out.println("Power On !");
    }

    public void faireDesGlacons() {
        System.out.println("Trois glaçons");
    }
}
