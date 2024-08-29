// Classe abstrata CoffeeDecorator que implementa Coffee e contém um objeto Coffee
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String makeCoffee() {
        return decoratedCoffee.makeCoffee();
    }
}
