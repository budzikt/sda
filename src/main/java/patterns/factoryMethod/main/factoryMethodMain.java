package patterns.factoryMethod.main;

import patterns.factoryMethod.ConcreteCreator;
import patterns.factoryMethod.Creator;
import patterns.factoryMethod.Product;
import patterns.factoryMethod.T;

public class factoryMethodMain {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.getProduct();
        product.upseProduct();
    }
}
