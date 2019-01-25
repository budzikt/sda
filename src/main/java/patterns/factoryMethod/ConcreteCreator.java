package patterns.factoryMethod;

public class ConcreteCreator extends Creator {

    @Override
    protected Product _create() {
        return new ConcreteProduct();
    }
}
