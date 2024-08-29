// Decorator que adiciona açúcar ao café
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String makeCoffee() {
        return decoratedCoffee.makeCoffee() + ", with Sugar";
    }
}
