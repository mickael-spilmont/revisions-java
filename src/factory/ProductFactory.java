package factory;

public class ProductFactory {

    public Product getProduct(ProductType productType) {
        switch (productType) {
            case REFRIGIRATEUR:
                return new Refrigirateur();
            case FOUR:
                return new FourElectrique();
            case CAFETIERE:
                return new CafetiereExpresso();
            default :
                return null;
        }
    }
}
