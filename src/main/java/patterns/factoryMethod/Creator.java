package patterns.factoryMethod;

public abstract class Creator {

    protected abstract Product _create();

    public Product getProduct() {
        return this._create();
    }
}
