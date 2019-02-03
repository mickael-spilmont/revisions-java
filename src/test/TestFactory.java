package test;

import factory.CafetiereExpresso;
import factory.Product;
import factory.ProductFactory;
import factory.ProductType;

import java.util.ArrayList;
import java.util.List;

public class TestFactory {

    public static void main(String[] args) {
        ProductFactory usine = new ProductFactory();
        List<Product> commande = new ArrayList<>();

        commande.add(usine.getProduct(ProductType.CAFETIERE));
        commande.add(usine.getProduct(ProductType.REFRIGIRATEUR));
        commande.add(usine.getProduct(ProductType.FOUR));

        for (Product product : commande) {
            product.allumer();
            if (product instanceof CafetiereExpresso){
                ((CafetiereExpresso) product).faireDuCafe();
            }
        }
    }
}
