package patterns.factoryMethod;

class ConcreteProduct extends Product {

    @Override
    public void upseProduct() {
        System.out.println("Concrete product used");
    }
}
